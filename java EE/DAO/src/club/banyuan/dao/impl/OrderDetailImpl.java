package club.banyuan.dao.impl;

import club.banyuan.dao.OrderDetailDao;
import club.banyuan.entity.OrderDetail;

import java.sql.Connection;
import java.sql.ResultSet;

public class OrderDetailImpl extends BaseDaoImpl implements OrderDetailDao {
    public OrderDetailImpl(Connection connection) {
        super(connection);
    }

    @Override
    public void add(OrderDetail orderDetail) {

        Integer id = 0;
        String sql = "insert into order_detail values(?,?,?,?,?)";
        Object[]objects = new Object[]{orderDetail.getId(),
                orderDetail.getOrderId(),
                orderDetail.getProductId(),
                orderDetail.getQuantity(),
                orderDetail.getCost()};
        id = executeInsert(sql,objects);
        orderDetail.setId(id);

        closeResource();

    }

    @Override
    public Object tableToClass(ResultSet rs) throws Exception {
        return new OrderDetail(rs.getInt(1),
                rs.getInt(2),
                rs.getInt(3),
                rs.getInt(4),
                rs.getDouble(5));
    }
}
