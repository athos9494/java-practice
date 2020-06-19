package club.banyuan;

public class OrderCake extends Cake {
    double weight;
    public OrderCake(int n, double r,double weight) {
        super(n,r);
        this.weight = weight;
    }

    @Override
    public double calcPrice() {
        double totalPrice = weight * super.price;

        return totalPrice;
    }
}
