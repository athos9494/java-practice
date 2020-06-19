package club.banyuan;

/*通过对象获取完成的包名和类名*/

public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        System.out.println(demo1.getClass().getName());
    }
}
