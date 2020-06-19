package club.banyuan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

class Main{
    public static void main(String[] args) {
//        ArrayList<String> array1 = new ArrayList<String>();
//        array1.add("abc");
//        array1.add("de");
//        array1.add("ghip");
//        array1.add("jklmn");
//        System.out.println("array1:"+array1);
//        Iterator<String> iterator = array1.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next());
//
//        }
        String s = "this is "+"athos";
        String check = ".*athos.*";
        boolean isExist = Pattern.matches(".*athos.*",s);
        System.out.println("isExist?"+isExist);

    }
}