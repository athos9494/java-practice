package club.banyuan;

public class DataSet <T>{

    private double sum;
    private int count;
    private Country maximum;
    private Measurer measurer;

    public DataSet() {
    }

    public DataSet(Measurer aMeasurer) {
        sum = 0;
        count = 0;
        maximum = null;
        measurer = aMeasurer;
    }

    public void add(Object x) {
        if (x instanceof Measurable) {
            add((Measurable) x);
        } else {
            addByMeasurer(x);
        }
    }

    private void addByMeasurer(Object x) {
        sum = sum + measurer.measure(x);
        if (count == 0 || measurer.measure(maximum) < measurer.measure(x)) {
            maximum = (Country) x;
        }
        count++;
    }

    private void add(Measurable measurable) {
        sum = sum + measurable.getMeasure();
        if (count == 0 || ((Measurable) maximum).getMeasure() < measurable.getMeasure()) {
            maximum = (Country) measurable;
        }
        count++;
    }

    public double getAverage() {
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }

    public Country getMaximum() {
        return (Country) maximum;
    }


}
