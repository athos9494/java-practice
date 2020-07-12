package club.banyuan.service.impl;

import club.banyuan.dao.AuctionDao;
import club.banyuan.dao.impl.AuctionDaoImpl;
import club.banyuan.entity.Auction;
import club.banyuan.service.AuctionServiceDao;
import club.banyuan.utils.JdbcUtils;

import java.sql.SQLException;
import java.util.List;

public class AuctionServiceDaoImpl implements AuctionServiceDao {
    @Override
    public List<Auction> getByLotsId(Integer lotsId) throws Exception {
        AuctionDao auctionDao = new AuctionDaoImpl(JdbcUtils.getConnection());
        return auctionDao.selectByLotsId(lotsId);
    }

    @Override
    public Auction getLotsHighPrice(Integer lotsId) throws Exception {
        AuctionDao auctionDao = new AuctionDaoImpl(JdbcUtils.getConnection());
        return auctionDao.getLotsHighPrice(lotsId);
    }

    @Override
    public int add(Auction auction) throws SQLException {
        AuctionDao auctionDao = new AuctionDaoImpl(JdbcUtils.getConnection());
        return auctionDao.add(auction);
    }
}
