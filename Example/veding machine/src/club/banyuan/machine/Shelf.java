package club.banyuan.machine;

public class Shelf {
    private int price;
    private int inventory;
    private String code;
    private String name;



    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getInventory() {
        return inventory;
    }
    public void setInventory(int inventory) {
        this.inventory = inventory;
    }


    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
}
