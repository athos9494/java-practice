package club.banyuan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericMethodDemo {
    public static <T> void print(T[] intput){
        for (T t:intput
             ) {
            System.out.print(t+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
//        Integer[] ints = {1,2,3,4,5};
//        Double[] doubles = {1.1,2.2,3.3,4.4};
//        Long[] longs = {100l,200l,3000l};
//        Character[] s= {'h','e','l','l','o'};
//        print(ints);
//        print(doubles);
//        print(longs);
//        print(s);
        List<String>list = new ArrayList<>();
        list.add("你好");
        list.add("java");
        Iterator<String > iterator = list.iterator();

        while (iterator.hasNext()){System.out.println(iterator.next());}
        for (String st:list
             ) {
            System.out.print(st);
        }
    }
}
