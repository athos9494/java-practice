package club.banyuan;

import java.io.Serializable;
import java.net.InterfaceAddress;

/*获取对象的类的父类和实现的接口*/

public class Demo3 implements Serializable {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("club.banyuan.Demo3");
        System.out.println("父类"+aClass.getClass().getSuperclass());

        Class[] interfaceAddress = aClass.getInterfaces();
        for (int i = 0; i <interfaceAddress.length ; i++) {
            System.out.println("实现的接口"+ interfaceAddress[i].getName());
        }
    }

}
