package club.banyuan;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;

public class TruckPriceTest {

    @org.junit.Test
    public void getTruckPriceList() {
        List<String> target = new ArrayList<>();
        target.add("blah blah red toyota 1993 pick-up truck blah blah $5000 blah");
        target.add("pick-up truck 1993 toyota red $5000");
        target.add("desperate: red 1993 toyota pickup truck for sale. $2,000 o.b.o.");
        target.add("pickup truck $5000");//匹配不成功
        target.add("red 1993 toyota automatic pick-up truck $5000\n");//匹配不成功
        Assert.assertTrue(TruckPrice.getTruckPriceList(target).containsAll(Arrays.asList(5000,5000,2000)));
    }
}
