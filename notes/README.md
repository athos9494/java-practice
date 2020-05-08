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



3. super 关键字

子类可以调用父类声明构造方法，但是必须在子类的构造方法中使用super关键字来调用
如果想要在子类中操作父类被隐藏的成员变量和被重写的成员方法，也可以使用super关键字。

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