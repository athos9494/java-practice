package club.banyuan;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

public class ReflectTest {

    private int a = 0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    private Integer integer;
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        printInfo(0);

    }
    public static void printInfo(Object object) throws ClassNotFoundException, NoSuchMethodException {
        Class <?> aclass = Class.forName("club.banyuan.ReflectTest");
        Constructor [] constructor = aclass.getConstructors();
        for (int i = 0; i <constructor.length ; i++) {
            System.out.println(constructor[i].getName());

        }
        Method[] methods = aclass.getMethods();

        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }

        Field[] fields = aclass.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }
    }
}
