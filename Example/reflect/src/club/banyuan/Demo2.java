package club.banyuan;

/*实例化class对象*/

public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class class1 = new Demo2().getClass();
        Class class2 = Class.forName("club.banyuan.Demo2");
        Class class3 = Demo2.class;
        System.out.println(class1.getName());
        System.out.println(class2.getName());
        System.out.println(class3.getName());

    }
}
