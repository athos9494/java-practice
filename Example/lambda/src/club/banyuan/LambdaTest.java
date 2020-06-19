package club.banyuan;

import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Timer;

public class LambdaTest {
    public static void main(String[] args) {
        String[] planet = new String[]{"earth","mars","mercury","neptune"};

        System.out.println(Arrays.toString(planet));

        Arrays.sort(planet);
        System.out.println(Arrays.toString(planet));

        Arrays.sort(planet,(first,second) -> first.length()- second.length());
        System.out.println(Arrays.toString(planet));

        ArrayList<String> arrayList = new ArrayList<>(3);


    }
}
