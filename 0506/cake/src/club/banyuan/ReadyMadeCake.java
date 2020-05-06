package club.banyuan;

public class ReadyMadeCake extends Cake {
    int quantity;
    public ReadyMadeCake(int n, double r,int quantity) {
        super(n, r);
        this.quantity = quantity;
    }

    @Override
    public double calcPrice() {
        double totalPrice;
        totalPrice = quantity * super.price;
        return totalPrice;
    }
}
