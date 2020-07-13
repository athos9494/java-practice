package club.banyuan.dao;


import club.banyuan.entity.Order;
import club.banyuan.entity.OrderDetail;
import club.banyuan.entity.Product;
import java.util.List;
import java.util.Map;

public interface OrderDetailDao{

    public List<OrderDetail> getOrderDetailByOrderId(Order order);

    public int saveOrderDetail (OrderDetail orderDetails);


}