package club.banyuan.entity;

public class Product {
    Integer id = null;
    String name = null;
    String description = null;
    Double price = null;
    Integer stock = null;
<<<<<<< HEAD
    Integer quantity = null;

    public Product(Integer id, String name, String description, Double price, Integer stock, Integer quantity) {
=======

    public Product(Integer id, String name, String description, Double price, Integer stock) {
>>>>>>> e8277cc3d614bdb14d97acb5b6a1a4eecd676677
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
<<<<<<< HEAD
        this.quantity = quantity;
=======
>>>>>>> e8277cc3d614bdb14d97acb5b6a1a4eecd676677
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
<<<<<<< HEAD

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
=======
>>>>>>> e8277cc3d614bdb14d97acb5b6a1a4eecd676677
}
