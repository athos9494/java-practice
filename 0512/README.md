### 内部类

java中内部类：非静态内部类，静态内部类，局部内部类，匿名内部类
1. 内部类的共性
(1) 内部类是一个独立的类，在编译之后内部类会被编译成一个独立的class文件- 外部类名+$+内部类名.class
(2) 内部类不能用普通的方式访问，内部类是外部类的一个成员，因此内部类可以自由的访问外部类的成员变量，即使是private类型
(3)内部类声明成静态的，不能随便访问外部类成员变量，此时内部类只能访问外部类的静态成员变量

#### 非静态内部类

一个类作为另一个类的非静态成员，这个类就是一个非静态内部类
```
public class OutClass {
    private int i = 4 ;//外部类私有成员变量
    private void Test(){//外部类私有成员方法
        System.out.println("outclass");
    }
    public class InnerClass{//定义内部类InnerClass
        private int i = 5;//内部类私有成员变量
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