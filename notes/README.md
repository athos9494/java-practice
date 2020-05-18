## 类和对象
### 类
1. 类的构造方法
**构造方法是和类同名的方法**，对象的创建就是通过构造方法完成的，构造方法分为有参构造方法和无参构造方法

```
public class Example {
   
    public Example()  {                              // 定义无参构造方法
        System.out.println("无参构造方法"); 
    }
    
    public Example(String name) {                   // 定义有参构造方法
        System.out.println("有参构造方法");
    }

}
```
定义构造方法的时候，构造方法没有返回值，也不需要void关键字进行修饰

在构造方法中可以为成员变量赋值，这样实例化一个本类的对象的时候，相应的成员变量也被初始化。

2. 类的主方法


3. 成员变量

4. 成员方法

5. 局部变量

6. 静态变量、常量和方法

- 静态方法静态代码块比非静态要先加载。
- 静态方法中不能调用非静态方法,因为静态方法中必须先执行静态方法执行完静态方法后“}”才能执行非静态方法，如果静态方法中调用非静态方法，就矛盾了
- 静态方法中可以直接调用同类中的静态成员变量，但是不能直接调用非静态成员变量，如果想要在静态方法中调用非静态成员变量，需要创建类的对象，通过对象访问静态变量
- 普通成员方法中，可以直接调用非静态变量和静态变量和静态方法。
- 静态方法中不能直接调用非静态方法，需要通过对象来访问非静态方法
- static关键字

    - static方法是没有this的方法，在static方法内部不能调用非静态方法，但是非静态方法内部可以调用静态方法，而且是在没创建对象的情况下，仅仅通过类名即可调用static方法
    - 简单来说就是方便在没有创建对象的情况下调用方法或者变量
    1. static方法

    - static修饰的静态方法不需要创建对象调用，不依附对象存在，所以在静态方法中不能访问类的非静态成员变量和非静态成员方法，因为非静态方法或者变量都是必须依赖实例化对象才能被调用。
    
    2. static变量 
    - 静态变量与非静态变量的区别是：静态变量被所有的对象共有，在内存中只有一个副本，当且仅当类初次加载的时候被初始化；
    - 非静态变量是对象所拥有的的，在创建对象的时候初始化，存在多个副本，各个对象拥有的副本互不影响。
    - static成员变量的初始化顺序按照定义的顺序进行初始化
    3. static代码块
    - 静态代码块一般用来优化程序性能。
    - static代码块可以放在类中的任何地方，可以有多个static代码块，在类被加载的时候按照块的顺序执行，并且只执行一次。因此可以优化程序。

    4. 常见的问题
    - static关键字不会改变类中成员的访问权限，能够影响到访问权限的只有private、public、protected以及不写。

        ```
            public class Main {
                static int value = 33;
 
                public static void main(String[] args) {
                    new Main().printValue();//通过对象调用方法
                }
 
                private void printValue(){
                    int value = 3;//局部变量不可能被对象所调用
                    System.out.println(this.value);
                }
            }
        ```
        this 代表当前类的当前对象，static变量是所有对象共有，所以这里的this指的就是33
    - 静态变量虽然独立与对象，但是所有的对象共有，静态方法静态变量都可以通过对象访问，只要权限足够
    - static不能作用于局部变量，java语法规定

7. 权限修饰符

8. this 关键字

### 对象

1. 对象的创建

2. 访问对象的属性和行为

3. 对象的引用、比较和销毁

## 抽象类和内部类
### 抽象类
1. 定义

抽象类是只声明方法的存在但是不去具体实现它的类，抽象类不可被实例化，也就是不能创建对象，使用abstract关键字定义对象。

下面是一个抽象类的定义，class前直接加上abstract关键字

```
abstract class Animal {        // 定义抽象类
    public String animal;        // 定义颜色成员变量

    public Animal() {        // 定义构造方法
        animal="bird";
    }

    public abstract void voice();        // 定义抽象方法
}
// 这里的抽象方法没有实际意义，必须用子类重写
//抽象方法只有方法的声明，但是没有方法的实现，与接口类似，但是abstract修饰的抽象类其中的抽象方法前不能用private和static关键词修饰
```

实现抽象方法： 通过子类重写该方法实现抽象方法

```
public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("woof...");
    }
}

public class Cat extends Animal {
    @Override
    public void voice() {
        System.out.println("nya...");
    }
}
```

## 接口、继承与多态
### 接口
1. 接口的定义
权限修饰 + interface + 接口名{},
```
public interface ICalculator{
    final float pi = 3.1415f;//定义常量pi，表示圆周率
    float getArea(float r);//定义用于计算面积的方法
    float getCircumference(float r);//定义计算周长的方法
}
```
interface定义一个接口，名字叫ICalculator（接口一般都是大写字母I开头），在接口中定义变量和方法，但是接口中的方法都不能写方法体，方法名后直接加“；”即可；具体方法实现是写到接口的类中的；还有一点需要注意的是，接口中的所有方法都必须在实现该接口的类中实现（即使是空实现）

- static 和default方法需要方法体
-  接口中的成员变量默认都是public、static、final类型的，必须被显式初始化
- 接口中的方法默认都是public、abstract类型的。
- 接口中只能包含public、static、final类型的成员变量和public、abstract类型的成员方法。
- 接口没有构造方法，不能被实例化，在接口中定义构造方法是非法的。
- 一个接口不能实现另一个接口，但它可以继承多个其他接口。
interface C extends A, B{} // A和B都是接口
- 当类实现某个接口时，它必须实现接口中所有的抽象方法，否则这个类必须被定义为抽象类。
- 接口中没有方法体

2. 接口的实现

接口的实现需要在类中用implements关键字，例如：
```
public class Calculator implements ICalculator{
    @override
    public float getArea(float){
        float area = pi * r * r;//计算面积并且赋值
        return area;
    }
    @override
    public float getCircumference(float r){
        float circumference = 2 * pi * r ;
        return circumference;
    }
}
```
- 接口中的静态方法值允许通过接口名调用，不能使用变量名调用，但是接口中的成员变量可以通过变量名调用
- 接口和类一样可以构成多态
- 接口里面不能有静态代码块和构造方法
### 继承
1. 继承的实现
在java中使用extends关键字实现继承，extends后跟父类名
```
public class Bird {
    String color = "灰色";    // 颜色
    String skin = "羽毛";    // 皮毛
}
```
```
public class Pigeon extends Bird {
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon();
        System.out.println(pigeon.color);
    }
}
```
执行结果就是灰色

2. 重写
简单的说就是如果子类的方法名和父类的方法名相同，那么子类就不能继承父类的方法，此时称子类的方法重写了父类的方法，也可叫覆盖

- 动物类实现了voice方法
```
public class Animal {
　　public Animal() {}
　　public void voice() {
        System.out.println("make some voice..");
    }
}
```

- 创建animal子类dog，重写voice方法：

```
public class Dog extends Animal{
    public Dog() {}

    @Override
    public void voice(){
        System.out.println("woof...");
    }
}
```

- 再创建一个animal的子类cat，重写voice方法发出猫叫

```
public class Cat extends Animal {
    public Cat() {}

    @Override
    public void voice(){
        System.out.println("nya...");
    }
}
```

- 再创建一个animal的子类但是不重写方法

```
public class Fish extends Animal{
    public Fish() {}
}
```

- 再创建一个Main 类测试以上

```
public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.voice();

        Cat cat = new Cat();
        cat.voice();
        
        Fish fish = new Fish();
        fish.voice();
    }
}
```
输出结果是：
```
woof...
nya...
make some voice..

```



3. super 关键字

子类可以调用父类声明构造方法，但是必须在子类的构造方法中使用super关键字来调用
子类继承父类的时候，必须依赖父类的实例化才能完成子类的实例化，super（）；调用父类的构造函数完成实例化，如果没有显式的调用父类的构造函数，java会默认隐式调用无参构造函数，如果父类没有无参构造函数，必须使用super关键字调用显式的有参构造函数去初始化父类。
如果想要在子类中操作父类被隐藏的成员变量和被重写的成员方法，也可以使用super关键字。
子类的静态方法中不能使用super关键字；

### 多态

java中通常使用方法重载和重写实现类的多态性

重载是在一个类中出现多个方法名相同，但是参数列表不同的方法，举个重载的例子
```
// circle area 
public float getArea (float r){
    float area = pi * r * r;
    return area ;
}
//rectangle area
public float getArea (float a,float b){
    float area = a * b;
    return area;
}
```
**在方法重载的时候，返回值的类型不能作为区别方法的标志**

### 内部类

java中内部类：非静态内部类，静态内部类，局部内部类，匿名内部类
1. 内部类的共性
(1) 内部类是一个独立的类，在编译之后内部类会被编译成一个独立的class文件- 外部类名+$+内部类名.class
(2) 内部类不能用普通的方式访问，内部类是外部类的一个成员，因此内部类可以自由的访问外部类的成员变量，即使是private类型
(3)内部类声明成静态的，不能随便访问外部类成员变量，此时内部类只能访问外部类的静态成员变量

#### 非静态内部类

- 外部类可以直接访问内部私有域，内部类也可以直接访问外部类的私有域，封装对于内部类和外部类之间无意义

一个类作为另一个类的非静态成员，这个类就是一个非静态内部类！

非静态内部类中不允许有static方法，但静态内部类中可以有非静态方法！
首先，初始化外部类对象的时候就会加载内部类，如果内部类有static成员就会初始化，但是这时并没有一个实例化的内部类对象，内部类的static成员相当于脱离了外部类的掌控，不需要外部类的对象就可以生成内部类的对象，这与成员内部类的定义就相驳了，因为我们知道非静态成员内部类的对象必须是现有外部类的对象才能创建，并且是绑定在一起的，所以成员内部类不可以定义静态变量。

外部类不允许static关键字修饰！
```
public class OutClass {
    private int i = 4 ;//外部类私有变量
    private void Test(){//外部类私有方法
        System.out.println("outclass");
    }
    public class InnerClass{//定义内部类InnerClass
        private int i = 5;//内部类私有变量
        public int getI(){
            return this.i;
        }
        public void Test1(){//内部类成员方法，如果private修饰方法，外部类外无法调用这个方法。
            System.out.println("innerclass");
            System.out.println(this.i);//内部类中this关键字调用的是内部类中的成员变量，不用this也可。
            System.out.println(OutClass.i);//成员变量名称相同，如果想要调用外部类的成员变量需要在this前加外部类名
            Test();//内部类直接调用外部类的成员方法即使是private修饰
        }
    }
    public static void main(String[] args) {
        new OutClass().new InnerClass().Test1();//外部类中调用内部类的成员方法
        System.out.println(new OutClass().new InnerClass().i);//需要新建对象通过对象调用
    }
}
class Main{
    public static void main(String[] args) {
        new OutClass().new InnerClass().Test1();//外部类外调用内部类方法，通过创建对象调用，先创建外部对象，然后以外部对象为标识创建内部对象完成调用。
        System.out.println(new OutClass().new InnerClass().getI());//外部类外调用内部成员变量
    }
}
```

#### 局部内部类

定义：局部内部类的作用范围是和局部变量的作用范围相同，只在局部中起作用，所以对局部内部类进行访问时只能在局部内部类的作用范围内

```
//局部内部类
public class OuterClass {
    public void Demo(){
        class InnerClass{//定义一个方法内部的局部内部类
            int i = 5;//内部类的变量
        }
        System.out.println(new InnerClass().i);//外部类的方法的方法体
    }
}
class Test{
    public static void main(String[] args) {
        new OuterClass().Demo();//直接调用方法即可访问局部内部类
    }
}
```
#### 静态内部类

定义：jingt内部类在外部类中扮演一个静态成员的角色
```
class OutClass{
    static class InClass{
        //内部类成员
    }
    //外部类成员
}
```
- 外部类中访问静态内部类
```
//静态内部类
public class StaticOutClass {
    static class InnerClass{
        int i = 5;
        public void print(){
            System.out.println("static innerclass");
        }
    }
    public void Test(){
        new InnerClass().print();//外部类中调用静态内部类方法和变量都要创建对象以对象为标识调用
        System.out.println(new InnerClass().i);
    }
}
class Test1{
    public static void main(String[] args) {
        new StaticOutClass.InnerClass().print();
        //静态内部类是外部类的静态成员，在外部类外调用静态内部类的时候不需要创建外部对象作为标识
        //外部类名.内部类对象.即可调用静态内部类的成员。
        System.out.println(new StaticOutClass.InnerClass().i);
    }
}

```

#### 匿名内部类

定义：匿名内部类是没有类名的内部类，匿名内部类只能使用一次，通常用来简化代码

**使用匿名内部类必须继承一个父类或者实现一个接口**

- 创建匿名内部类

创建匿名内部类中将使用到继承父类或者接口实现的只是，匿名内部类是没有名字的，所以在创建匿名内部类的时候同时创建匿名内部类的对象，创建匿名内部类的语法格式如下：
```
new InFather(){
  //匿名内部类  
};
```

**创建匿名内部类的语法中，InFather是匿名内部类继承的父类的类名使用new同时创建了匿名内部类的对象，在匿名内部类中可以重写父类中的方法，也可以定义自己的方法**

- 不用匿名内部类实现抽象方法
```
abstract class Person{
    abstract void run();
}
class Man extends Person{
    public void run(){
        System.out.println("keep running...");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        new Man().run();
        Person one = new Man();
        one.run();
    }
}

```

使用Man继承了Person类，然后实现了Man的一个实例，将其向上转型为Person类的引用，这里的Man如果只使用一次将其编写为独立的类就很麻烦，这时候引入内部类

- 匿名内部类基本实现

```
abstract class Person{
    abstract void run();
}
public class AbstractClass {
    public static void main(String[] args) {
        Person one = new Person() {
            @Override
            public void run() {
                System.out.println("keep running...");
            }
        };
        one.run();
    }
}
```

直接将抽象类Person的抽象方法在大括号中实现，这样可省略一个类的书写。

- 匿名内部类实现接口

```
public interface PersonInterface {
    void run();
}
class PersonInterfaceTest{
    public static void main(String[] args) {
        PersonInterface one = new PersonInterface() {
            @Override
            public void run() {
                System.out.println("keep running...");
            }
        };
        one.run();
    }
}
//和抽象类实现基本类似
```
#### 方法内部类

1. 方法内部类定义在外部类的方法中，只能在方法内部使用

2. 因为不能在外部类方法以外的地方使用，因此方法内部类不能使用访问权限控制符和static关键字修饰

3. 如果想要调用方法内部类，需要在外部方法中新建对象，通过对象调用这个内部类中的成员。

```
//方法内部类
class C{
    void demo2(){
        class D{
            void demo3(){
                System.out.println(123456);
            }
        }
        new D().demo3();
    }

    public static void main(String[] args) {
        new C().demo2();
    }
}
```

#### 内部类与接口


### 枚举类

1. 枚举类用来解决描述有限个事务对象时使用，比常量使用描述可以增加编译时的类型检查。通过枚举类的实现机制，提供一些默认算法的实现

2. 枚举类不可以继承其他的类，因为默认继承的enum类，也不能被继承。但是能实现接口


### 异常处理

![流程图](https://img.php.cn//upload/image/366/676/554/1533871816569884.png)

try,catch；finally,throw,throws.
```
try {
    //业务实现代码

}catch（Exception1 e）{
    //异常处理块1

}catch（Exception2 e）{
    //异常处理块2
}//如果try中任何一条代码抛出一个在catch子句中说明的异常类，程序就会跳过try语句其他的代码执行catch子句中的处理器代码，
//如果没有抛出任何异常，就会跳过catch子句
//如果抛出一个没有在catch子句中说明的异常类，方法立刻退出。
finally{
    //资源回收块
}
方法throws声明方法可能抛出的异常
throw 抛出实际的异常，抛出一个具体的异常对象;

```
finally里面如果有return，假设利用return从try语句退出，在方法返回前finally子句的内容将会被执行，如果finally子句中也有一个return，这个返回值将会覆盖原始的返回值
```
public static int f(int n){
    try {
        int r=n * n;
        return r;
    }
    finally{
        if (n == 2)
        return 0;
    }
}
//正常f（2）返回值是4，但是在真正返回之前还要执行finally子句，使得返回值是0，覆盖之前的返回值4；
```
异常可以减少返回值的方式通知掉哦用方法调用出现问题，可以将正常的流程和处理异常情况的代码隔离开，对于代码的扩展性会更有利，对于增加新的异处理或者修改都是更方便的。
对于使用别人的代码，通过api的内容可以得知会出现的问题，可以对模块化的内部异常进行隐藏，对外暴露有限个异常，对于方法调用放和模块的使用对于异常的处理会更加的清晰

异常的分类：
Exception的子类受查异常（check exception），如果是代码里抛出此类异常，异常必须进行处理，可以在代码中进行catch处理，或者在方法中声明throws，包括main方法也可以throws异常往外抛
Runtimeexception的子类，非受查异常（uncheck exception），可以不处理，不处理则沿着方法的调用依次向上抛出。直到有catch处理

通知调用方法调用失败需要抛出异常；捕获异常，需要对方法调用失败的情况进行处理，需要捕获异常，如果当前方法不确定如何处理异常，可再次将异常抛出

如果造成方法调用失败的原因如果来自于调用方则抛出非受查异常，如果造成方法调用失败的原因来自于方法依赖的其他方法，通常是指依赖外部功能的方法（网络，文件），抛出受查异常

抛出异常后，后续代码的顺序会受到影响，抛出异常的后续代码不再执行，如果捕获异常，则进行捕获遗产后的处理代码（catch代码块），如果需要在异常出现与否都要执行某些代码，可以将这些diamante放入finally代码块中。
#### 单元测试

### 泛型

参数化类型，

参数化类型，在不创建新的类型的情况下，通过泛型指定不同的类型来控制形参具体限制的类型，也就是说在泛型的使用过程中，操作的数据类型被指定为一个参数，这个参数类型可以用在类，接口方法中，被叫做泛型类、泛型接口、泛型方法。



