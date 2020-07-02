package club.banyuan.dao.impl;

import club.banyuan.dao.ProductDao;
import club.banyuan.entity.Product;
<<<<<<< HEAD
import club.banyuan.utils.JdbcUtils;
=======
>>>>>>> e8277cc3d614bdb14d97acb5b6a1a4eecd676677

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl extends BaseDaoImpl implements ProductDao {
    public ProductDaoImpl(Connection connection) {
        super(connection);
    }

    @Override
    public List<Product> getProductByName(String productName) throws SQLException {
<<<<<<< HEAD
        List <Product> productList = new ArrayList<>();
        List<Object> paramList = new ArrayList<>();
        String sql = "select id,name,description,price,stock,quantity from product where name like ?";
        ResultSet resultSet = null;
        paramList.add(productName);
        resultSet = executeQuery(sql,paramList.toArray());
        while(resultSet.next()){
=======
        List<Product> productList = new ArrayList<>();
        List<Object> paramList = new ArrayList<>();
        String sql = "select id,name,description,price,stock from product where name like ?";
        ResultSet resultSet = null;
        paramList.add("%" + productName + "%");
        resultSet = executeQuery(sql, paramList.toArray());
        while (resultSet.next()) {
>>>>>>> e8277cc3d614bdb14d97acb5b6a1a4eecd676677
            try {
                Product product = tableToClass(resultSet);
                productList.add(product);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

<<<<<<< HEAD

=======
        closeResource(resultSet);
        closeResource();
>>>>>>> e8277cc3d614bdb14d97acb5b6a1a4eecd676677
        return productList;
    }

    @Override
    public Product getProductById(Integer id) throws SQLException {
<<<<<<< HEAD
        String sql = "select id,name,description,price,stock,quantity from product where id = ?";
        Product product = null;
        ResultSet  resultSet = null;

        Object[] o = new Object[]{id};
        resultSet = executeQuery(sql,o);
        try {
            while (resultSet.next()){
                product = tableToClass(resultSet);
            }
        }catch (Exception e){
            e.getStackTrace();
        }finally {
=======
        String sql = "select id,name,description,price,stock from product where id = ?";
        Product product = null;
        ResultSet resultSet = null;

        Object[] o = new Object[]{id};
        resultSet = executeQuery(sql, o);
        try {
            while (resultSet.next()) {
                product = tableToClass(resultSet);
            }
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
>>>>>>> e8277cc3d614bdb14d97acb5b6a1a4eecd676677
            resultSet.close();
        }


<<<<<<< HEAD

=======
>>>>>>> e8277cc3d614bdb14d97acb5b6a1a4eecd676677
        return product;
    }

    @Override
    public Product tableToClass(ResultSet rs) throws Exception {
<<<<<<< HEAD
        Product product = new Product(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getDouble(4),
                rs.getInt(5), rs.getInt(6));

        return product;
=======

        return new Product(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getDouble(4),
                rs.getInt(5));
>>>>>>> e8277cc3d614bdb14d97acb5b6a1a4eecd676677
    }
}
