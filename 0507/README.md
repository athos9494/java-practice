## 接口练习：
1. 
```
interface A
{
    void myMethod();
}
 
class B
{
    public void myMethod()
    {
        System.out.println("My Method");
    }
}
 
class C extends B implements A
{
     
}
 
class MainClass
{
    public static void main(String[] args) 
    {
        A a = new C();
         
        a.myMethod();
    }
}
```
> My Method
2. 
```
interface A 
{ 
    void myMethod(); 
    void getInfo(); 
} 
  
abstract class B implements A 
{ 
    void getData() 
    { 
        System.out.println("B"); 
    } 
} 
  
public class Test extends B 
{ 
    public void myMethod() 
    { 
        System.out.println("myMethod"); 
    } 
    public void getInfo() 
    { 
        System.out.println("getInfo"); 
    } 
      
    public static void main(String[] args) 
    { 
        B obj = new Test(); 
        obj.getInfo(); 
    } 
}
```
> getInfo
3. 
```
interface A
{
    int i = 111;
}
 
class B implements A 
{
    void methodB()
    {
        i = 222;
    }
}
```
4.以下内容是否编译通过，如果不能请指出错误原因
```
class A
{
    //Class A
}
 
interface B extends A
{
    //Interface B extending Class A
}
```
5.
```
interface P
{
    String p = "PPPP";
     
    String methodP();
}
 
interface Q extends P
{
    String q = "QQQQ";
     
    String methodQ();
}
 
class R implements P, Q
{
    public String methodP()
    {
        return q+p;
    }
     
    public String methodQ()
    {
        return p+q;
    }
}
 
public class MainClass 
{
    public static void main(String[] args)
    {
        R r = new R();
         
        System.out.println(r.methodP());
         
        System.out.println(r.methodQ());
    }
}
```
```
QQQQPPPP
PPPPQQQQ
```
6.
```
class A implements B
{   
    public int methodB(int i)
    {
        return i =+ i * i;
    }
}
 
interface B
{
    int methodB(int i);
}
 
public class MainClass 
{
    public static void main(String[] args)
    {
        B b = new A();
         
        System.out.println(b.methodB(2));
    }
}
```
> 4

7.以下内容是否编译通过，如果不能请指出错误原因
```
interface A
{
    {
        System.out.println("Interface A");
    }
     
    static
    {
        System.out.println("Interface A");
    }
}
```
8.以下内容是否编译通过，如果不能请指出错误原因
```
interface ABC
{
	public void methodOne();
	
	public void methodTwo();
}

interface PQR extends ABC
{
	public void methodOne();
	
	public void methodTwo();
}
```
> ???
9.
```
interface ABC
{
	void methodOne();
}

interface PQR extends ABC
{	
	void methodTwo();
}

abstract class XYZ implements PQR
{
	public void methodOne()
	{
		methodTwo();
	}
}

class MNO extends XYZ
{
	public void methodTwo()
	{
		methodOne();
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		ABC abc = new MNO();
		
		abc.methodOne();
	}
}
```
> ????
10.
```
interface X
{
    char c = 'A';
     
    char methodX();
}
 
class Y implements X
{
    {
        System.out.println(c);
    }
     
    public char methodX()
    {
        char c = this.c;
         
        return ++c;
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        Y y = new Y();
         
        System.out.println(y.methodX());
         
        System.out.println(y.c);
         
        System.out.println(X.c);
    }
}
```
> A B A A

12.以下内容是否编译通过，如果不能请指出错误原因
```
interface A
{
    void methodA();
}
 
class B implements A
{
    public void methodA()
    {
        interface C
        {
            int i = 123;
        }
    }
}
```
> 应该不能通过
13.
```
interface One
{
    String s = "FINAL";
     
    String methodONE();
}
 
interface Two
{
    String methodONE();
}
 
abstract class Three
{
    String s = "NOT FINAL";
     
    public abstract String methodONE();
}
 
class Four extends Three implements One, Two
{
    public String methodONE()
    {
        String s = super.s + One.s;
         
        return s;
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        Four four = new Four();
         
        System.out.println(four.methodONE());
         
        One one = four;
         
        System.out.println(one.s);
    }
}
```
```
NOT FINALFINAL
FINAL
```

14.
```
interface X
{
    void method();
}
 
class Y
{
    public void method()
    {
        System.out.println("CLASS Y");
    }
}
 
class Z extends Y implements X
{
     
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        X x = new Z();
         
        x.method();
    }
}
```
```
CLASS Y
```
15.
```
interface A
{
    int methodA();
}
 
interface B
{
    int methodB();
}
 
interface C
{
    int methodC();
}
 
class D implements A, B, C
{
    int i = 999+111;
     
    public int methodA()
    {
        i =+ i / i;
         
        return i;
    }
     
    public int methodB()
    {
        i =- i * i;
         
        return i;
    }
     
    public int methodC()
    {
        i = ++i - --i;
         
        return i;
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        D d = new D();
         
        System.out.println(d.i);
         
        System.out.println(d.methodA());
         
        System.out.println(d.methodB());
         
        System.out.println(d.methodC());
    }
}
```
```
1110
1
-1
1
```
16.
```
interface One
{
    int i = 222;
     
    interface OneTwo
    {
        int i = One.i+One.i;
         
        interface OneTwoThree
        {
            int i = OneTwo.i + OneTwo.i;
        }
    }
}
```
> ???
17.
```
interface A
{
	String A = "AAA";
	
	String methodA();
}

interface B
{
	String B = "BBB";
	
	String methodB();
}

class C implements A, B
{
	public String methodA()
	{
		return A+B;
	}
	
	public String methodB()
	{
		return B+A;
	}
}

class D extends C implements A, B
{
	String D = "DDD";
	
	public String methodA()
	{
		return D+methodB();
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		C c = new C();
		
		System.out.println(c.methodA());
		
		System.out.println(c.methodB());
		
		c = new D();
		
		System.out.println(c.methodA());
		
		System.out.println(c.methodB());
	}
}
```
```
AAABBB
BBBAAA
DDDBBBAAA
BBBAAA
```
18.
```
interface X
{
    void methodX();
}
 
interface Y extends X
{
    void methodY();
}
 
class Z implements Y
{
    public void methodY()
    {
        System.out.println("Method Y");
    }
}
```
19.
```
abstract class A
{
    abstract void myMethod(Number N);
}
 
interface B
{
    abstract void myMethod(Object O);
}
 
class C extends A implements B
{
    void myMethod(Number N) 
    {
        System.out.println("Number");
    }
     
    public void myMethod(Object O)
    {
        System.out.println("Object");
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new C();
         
        a.myMethod(new Integer(121));
         
        B b = new C();
         
        b.myMethod(new Integer(121));
         
        C c = new C();
         
        c.myMethod(new Integer(121));
    }
}
```
```
Number
Object
Number
```
20.
```
class A { }
 
class B extends A { }
 
class C extends B { }
 
interface ABC
{
    void method(A a);
}
 
interface PQR
{
    void method(B b);
}
 
class M implements ABC, PQR
{   
    public void method(A a)
    {
        System.out.println(2);
    }
     
    public void method(B b) 
    {
        System.out.println(3);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        M m = new M();
         
        m.method(new A());//2
         
        m.method(new B());//3
         
        m.method(new C());//3
    }
}
```
## 继承回顾
多态，减少代码耦合，方便代码灵活扩展
什么时候引入多态，需要处理一些列类有共通性，方法类似但不相同，可使用多态减少代码耦合
抽象类：一些类不需要实例，只需抽象的概念，子类中必须有实例方法实现父类中的抽象方法，除非子类也是抽象类
抽象类可否实例化
引用数据类型类型转换的时候转换成错误的数据类型会有什么后果


## 接口
### 本节重点问题
1. 引入接口是为了解决什么问题
- 通过接口实现不相关类的相同行为，而不需要了解对象所对应的类
- 通过接口可指明多个类需要实现的方法
- 可以了解对象的交互界面，不需要了解对象所对应的类
- 类描述实体，接口定义实体可能发出的动作，但是只定义动作的原型没有实现，也没有任何的状态信息
- 接口是一个规范，一个抽象的概念，类是实现这个协议，满足这个规范的具体实现，是一个具体的概念

- 接口就是函数申明，类就是函数实现
2. 接口为什么不能够被实例化
- 接口类似于一个抽象类，所有的方法都是抽象方法，接口的方法都是默认的public abstra，所以不能被实例化
3. 接口中是否可以出现成员变量，如果是，成员变量修饰符有什么限制
4. 接口是否可以继承别的接口，是否可以多继承接口
5. 接口中的方法修饰符有什么限制
6. 接口中是否允许出现静态的成员变量或方法
7. 接口和抽象类有什么区别，什么场景使用接口，什么场景使用抽象类
8. 接口是否可以继承，是否允许多继承。
9. 接口是否有多态性
接口中定义的方法都是抽象的方法，定义的成员变量都是属于接口的，实现接口中的所有方法才能继承接口，
抽象类继承的时候某些行为方法是用不上的，但是继承抽象类的时候都是需要一并继承的，就可以把这个行为方法单独形成一个接口？？？
- java支持单继承不支持多继承，接口实现类的多重继承
- 定义：interface定义一个接口，与类相似，例如
```
public interface ICalculator{
    final float pi = 3.1415f;//pi标识圆周率
    float getArea(float r);//定义计算面积的方法
    float getCircumference(float r);//定义计算周长的方法
}
```
- interface 定义一个接口名为ICalculator（接口一般使用大写字母I开头），在接口中可以定义变量与方法，但是需要注意的是这里的方法不能写方法体，后面直接加分号即可，方法的实现是写到接口的类中去。接口中所有的方法都必须在实现该接口的类中实现（即使是空实现）
- 接口的实现需要在类中用implements关键字实现，
`class 类名 implements 接口名{}`
一个类可以实现多个接口，在implements后的接口间隔逗号即可，变量冲突通过`接口名.变量`明确指定变量的接口。
