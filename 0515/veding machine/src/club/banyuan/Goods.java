package club.banyuan;

public class Goods<goods> {
    //商品编号，名称，数量，价格
    private String ID;
    private String name;
    private int quantity;
    private double price;
    public void setID(String id){
        this.ID = id;
    }

    public String getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void goodsAdd(String id ,String name ,int quantity,double price){
        this.ID = getID();
        this.name = getName() ;
        this.quantity = getQuantity();
        this.price = getPrice();

    }


}
