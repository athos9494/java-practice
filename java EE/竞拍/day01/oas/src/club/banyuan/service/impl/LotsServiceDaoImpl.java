package club.banyuan.service.impl;

import club.banyuan.dao.LotsDao;
import club.banyuan.dao.impl.LotsDaoImpl;
import club.banyuan.entity.Lots;
import club.banyuan.service.LotsServiceDao;
import club.banyuan.utils.JdbcUtils;

import java.util.List;

public class LotsServiceDaoImpl implements LotsServiceDao {

    @Override
    public List<Lots> getLotsByOpinion(String sql) throws Exception {
        LotsDao lotsDao = new LotsDaoImpl(JdbcUtils.getConnection());
        return lotsDao.getLotsByOpinion(sql);
    }

    @Override
    public Lots getLotsById(Integer id) throws Exception {
        LotsDao lotsDao = new LotsDaoImpl(JdbcUtils.getConnection());
        return lotsDao.getLotsById(id);
    }

    @Override
    public List<Lots> getLotsBySell(Integer isSelled) throws Exception {
        LotsDao lotsDao = new LotsDaoImpl(JdbcUtils.getConnection());
        return  lotsDao.getLotsBySell(isSelled);
    }

    @Override
    public int updateLots(Lots lots) throws Exception {
        LotsDao lotsDao = new LotsDaoImpl(JdbcUtils.getConnection());
        return lotsDao.updateLots(lots);
    }

    @Override
    public int addLots(Lots lots) throws Exception {
        LotsDao lotsDao = new LotsDaoImpl(JdbcUtils.getConnection());
        return lotsDao.addLots(lots);
    }

    @Override
    public int deleteLots(Integer id) throws Exception {
        LotsDao lotsDao = new LotsDaoImpl(JdbcUtils.getConnection());
        return lotsDao.deleteLots(id);
    }
}
