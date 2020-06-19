package club.banyuan;

import java.util.Arrays;

public class Anything {
    public static void main(String[] args) {
        System.out.println("plz enter password:"+
                "plz enter username:");
        int[] sortarray = {9,5,10,48,23};
        Arrays.sort(sortarray);
        for (int c:sortarray
        ) {
            System.out.println(c);

        }

        int[] a= {1,2,3,4,5,6,7,8,9};
        for (int c:a
        ) {
            System.out.print(c);

        }
        System.out.println();
        System.out.println(a.length);
        int[] b = {};
        b= Arrays.copyOf(a,20);
        for (int c:b
        ) {
            System.out.print(c);

        }
        System.out.println();
        System.out.println(b.length);
    }
}

