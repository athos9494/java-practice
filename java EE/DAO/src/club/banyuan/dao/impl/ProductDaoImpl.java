package club.banyuan.dao.impl;

import club.banyuan.dao.ProductDao;
import club.banyuan.entity.Product;
import club.banyuan.utils.JdbcUtils;

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
        List <Product> productList = new ArrayList<>();
        List<Object> paramList = new ArrayList<>();
        String sql = "select id,name,description,price,stock,quantity from product where name like ?";
        ResultSet resultSet = null;
        paramList.add(productName);
        resultSet = executeQuery(sql,paramList.toArray());
        while(resultSet.next()){
            try {
                Product product = tableToClass(resultSet);
                productList.add(product);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        return productList;
    }

    @Override
    public Product getProductById(Integer id) throws SQLException {
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
            resultSet.close();
        }



        return product;
    }

    @Override
    public Product tableToClass(ResultSet rs) throws Exception {
        Product product = new Product(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getDouble(4),
                rs.getInt(5), rs.getInt(6));

        return product;
    }
}
