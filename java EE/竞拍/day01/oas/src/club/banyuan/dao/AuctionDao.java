package club.banyuan.dao;

import club.banyuan.entity.Auction;

import java.sql.SQLException;
import java.util.List;

public interface AuctionDao extends IBaseDao{
    public List<Auction> selectByLotsId(Integer id) throws Exception;
    public Auction getLotsHighPrice(Integer id )throws  Exception;
    public int add(Auction auction);
}
