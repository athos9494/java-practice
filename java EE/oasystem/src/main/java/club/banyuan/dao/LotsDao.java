package club.banyuan.dao;

import club.banyuan.entity.Lots;

import java.util.List;

public interface LotsDao {
    public List<Lots> getLots();
    public int updateLots(Lots Lots) throws Exception;
    public int addLots(Lots Lots) throws Exception;
    public int deleteLots(Integer id) throws  Exception;
}
