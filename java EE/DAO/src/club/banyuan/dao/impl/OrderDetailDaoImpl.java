package club.banyuan.dao.impl;

import club.banyuan.dao.OrderDao;
import club.banyuan.entity.Order;

import java.sql.Connection;
import java.sql.ResultSet;

public class OrderDetailDaoImpl extends BaseDaoImpl implements OrderDao {
    public OrderDetailDaoImpl(Connection connection) {
        super(connection);
    }

    @Override
    /*
     * 订单保存
     * */

    public void add(Order order) throws Exception {

        Integer id = 0;

        String sql = "insert into ShoppingStreet.order(id,userId,loginName,createTime,cost) values(?,?,?,?,?)";
        ResultSet resultSet = null;
        Object[] objects = new Object[]{order.getId(),
                order.getUserId(),
                order.getLoginName(),
                order.getCreateTime(),
                order.getCost()};
        id = executeInsert(sql, objects);
        order.setId(id);

        closeResource();

    }

    @Override
    public Object tableToClass(ResultSet rs) throws Exception {

        return new Order(rs.getInt(1),
                rs.getInt(2),
                rs.getString(3),
                rs.getDate(4), rs.getDouble(5));
    }
}
