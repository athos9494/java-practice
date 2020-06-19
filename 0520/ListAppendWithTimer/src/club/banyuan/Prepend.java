package club.banyuan;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 比较在基于数组的列表和基于链表的列表的第一个元素前插入n个值所需的时间
 * <p>
 * 1.创建一个计时器。
 * <p>
 * 2.计算将n个值添加到空链表的时间：
 * a.创建一个空的链表
 * b.启动计时器
 * c.依次将0..n-1中的每个值i插入到list中
 * d.停止计时器
 * e.显示时间
 * <p>
 * 3.计算将n个值添加到空数组列表的时间：
 * a.创建一个空的数组列表
 * b.启动计时器
 * c.依次将0..n-1中的每个值i插入到list中
 * d.停止计时器
 * e.显示时间
 */
public class Prepend {

    public static void main(String args[]) {
        int size= 100000;
        ArrayList arrayList= new ArrayList();
        TimerTest timerTest = new TimerTest();
        timerTest.start();
        arrayList.add(1);
        for (int i = 0;i < size-1;i ++){
            arrayList.add(0,i);
        }
        timerTest.stop();
        System.out.println("在数组列表第一个元素之前加入"+(size-1)+"个元素所需要的时间："+timerTest.getTimeMillisecond());
        LinkedList linkedList = new LinkedList();
        timerTest.start();
        linkedList.add(1);
        for (int i = 0;i < size-1; i++){
            linkedList.add(0,i);
        }
        timerTest.stop();
        System.out.println("在链表列表第一个元素之前加入"+(size-1)+"个元素所需要的时间"+timerTest.getTimeMillisecond());

    }
}
