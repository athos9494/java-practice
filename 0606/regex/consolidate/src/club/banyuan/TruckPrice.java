package club.banyuan;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TruckPrice {
    public static List<Integer> getTruckPriceList(List<String> target){
        List<Integer> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("((red(\\s(\\w|-)*){0,2}\\spick(\\s|-)?up\\struck)|(pick(\\s|-)?up\\struck(\\s(\\w|-)*){0,2}\\sred)).*\\$(([0-9]{1,3}(,[0-9]{3})+(.[0-9]{2})?)|([0-9]+)|([0-9]+).[0-9]{2})");
        for (String s : target) {
            Matcher matcher = pattern.matcher(s);
            if(matcher.find()){
                String str1 = s.substring(s.indexOf("$") + 1);//得到"2,000,000 o.b.o."
                String[] split1 = str1.split("\\s");
                String str3 = split1[0];//得到"2,000,000"
                String[] split2 = str3.split(",");
                for (String s1 : split2) {
                    stringBuilder.append(s1);
                }
                list.add(Integer.parseInt(stringBuilder.toString()));
                stringBuilder = new StringBuilder();
            }
        }
        return list;
    }
}

