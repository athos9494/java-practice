package club.banyuan.service;

import club.banyuan.entity.Auction;
import club.banyuan.entity.Lots;

import java.sql.SQLException;
import java.util.List;

public interface AuctionServiceDao {
    public List<Auction> getByLotsId(Integer lotsId) throws Exception;
    public Auction getLotsHighPrice(Integer lotsId) throws  Exception;
    public int add(Auction auction)throws SQLException;
}
