package club.banyuan;

public class DataSet implements Measurer{
    // TODO: 定义private 实例变量
    private int sum;
    private int count;
    private Object maximum;
    private Measurer measurer;

    public DataSet(Measurer aMeasurer) {
        sum = 0;
        count = 0;
        maximum = null;
        measurer = aMeasurer;
    }

    public DataSet() {

    }

    // TODO： 重载方法，使得Contry统计 DataSetTester 运行成功
    public void add(Object x) {
        sum = (int) (sum + measurer.measure(x));
        if (count == 0 || measurer.measure(maximum) < measurer.measure(x)) {
            maximum = x;
        }
        count++;
    }

    public double getAverage() {
        // TODO: Check divide by zero. Compute the average value.
        return sum/count;
    }

    public Object getMaximum() {
        return maximum;
    }

    @Override
    public double measure(Object anObject) {
        return 0;
    }
}
