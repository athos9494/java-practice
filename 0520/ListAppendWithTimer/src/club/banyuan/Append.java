package club.banyuan;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 比较在基于数组的列表和基于链表的列表的末尾增加n个值所需的时间
 * <p>
 * 1.创建一个计时器。
 * <p>
 * 2.计算将n个值添加到空链表的时间：
 * a.创建一个空的链表
 * b.启动计时器
 * c.依次将0..n-1中的每个值i添加到list中
 * d.停止计时器
 * e.显示时间
 * <p>
 * 3.计算将n个值添加到空数组列表的时间：
 * a.创建一个空的数组列表
 * b.启动计时器
 * c.依次将0..n-1中的每个值i添加到list中
 * d.停止计时器
 * e.显示时间
 */
public class Append {

    static int n = 10000000;

    public static void main(String args[]) {
        ArrayList arrayList = new ArrayList();
        TimerTest timer = new TimerTest();
        timer.start();
        for (int i = 0;i<n;i++){
            arrayList.add(i);
        }
        timer.stop();
        System.out.println("将"+n+"个值添加到空数组列表的时间是："+timer.getTimeMillisecond()+"ms");
        LinkedList linkedList = new LinkedList();

        timer.start();
        for (int i = 0;i< n ;i ++){
            linkedList.add(i);

        }
        timer.stop();
        System.out.println("将"+n+"个值添加到空列表的时间是："+timer.getTimeMillisecond()+"ms");


    }
}
