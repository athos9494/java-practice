package club.banyuan;

/*

1.修改Pair类为泛型类，两个值具有相同的泛型类型
2.向Pair类添加方法swap，该方法交换第一个和第二个元素的内容
3.新增一个类PairUtil实现其中一个静态泛型的方法swap，其参数为Pair对象。该方法应返回一个新的Pair对象，并交换第一和第二个元素。
4.PairUtil中增加一个minmax方法，该方法接收Measurable实现类对象的数组，计算数组中的最小和最大元素，并返回包含最小和最大值的Pair对象。
5.重复练习4的问题，但要求数组元素实现Comparable接口。
6.编写合适的单元测试类，测试以上方法的功能

 */

public class Pair<T> {

    private T first;
    private T second;

    public Pair(T firstElement, T secondElement) {
        first = firstElement;
        second = secondElement;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
    public void swap(){
        T temp;
        temp = this.first;
        this.first = this.second;
        this.second = temp;


    }
}