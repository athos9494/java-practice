package club.banyuan.dao;

import club.banyuan.entity.Auction;

import java.util.List;

public interface AuctionDao {
    public List<Auction> selectByLotsId(Integer id) throws Exception;
    public Auction getLotsHighPrice(Integer id )throws  Exception;
    public int add(Auction auction);
}
