package club.banyuan.dao;

import club.banyuan.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao extends IBaseDao{

    public List<Product> getProductByName(String productName) throws SQLException;

    public Product getProductById(Integer id) throws SQLException;
}
