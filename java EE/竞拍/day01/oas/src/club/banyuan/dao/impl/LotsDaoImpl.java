package club.banyuan.dao.impl;

import club.banyuan.dao.LotsDao;
import club.banyuan.entity.Lots;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LotsDaoImpl extends BaseDaoImpl implements LotsDao {
    public LotsDaoImpl(Connection connection) {
        super(connection);
    }


    @Override
    public List<Lots> getLotsByOpinion(String sql) throws Exception {
        List<Lots> lotsList = new ArrayList<>();
        ResultSet rs = executeQuery(sql, new Object[]{});
        while(rs.next()){
            Lots Lots = new Lots();
            Lots = tableToClass(rs);
            lotsList.add(Lots);
        }
        this.closeResource(rs);
        this.closeResource();
        return lotsList;
    }

    @Override
    public Lots getLotsById(Integer id) throws Exception {
        Lots lots = null;
        String sql = "select * from Lots where id = ?";
        ResultSet rs = executeQuery(sql, new Object[]{id});
        if(rs.next()){
            lots = tableToClass(rs);
        }
        this.closeResource(rs);
        this.closeResource();
        return lots;
    }

    @Override
    public List<Lots> getLotsBySell(Integer isSelled) throws Exception {
        List<Lots> lotsList = new ArrayList<>();
        String sql = "select * from Lots where isSelled = ?";
        ResultSet rs = executeQuery(sql, new Object[]{isSelled});
        while(rs.next()){
            Lots lots = new Lots();
            lots = tableToClass(rs);
            lotsList.add(lots);
        }
        this.closeResource(rs);
        this.closeResource();
        return lotsList;
    }

    @Override
    public int updateLots(Lots lots) throws Exception {
        String sql = "update Lots set name = ? , description = ?, startTime = ?, finishTime = ?,startPrice = ?, basePrice = ?,fileName = ? where id = ?";
        Object[] params = new Object[]{lots.getName(),lots.getDescription(),lots.getStartTime(),
        lots.getFinishTime(),lots.getStartPrice(),lots.getBasePrice(),lots.getFileName(),lots.getId()};
        int i = executeUpdate(sql, params);
        this.closeResource();
        return i;
    }

    @Override
    public int addLots(Lots lots) throws Exception {
        String sql = "insert into Lots values(null,?,?,?,?,?,?,?,?)";
        Object[] params = new Object[]{lots.getName(),lots.getDescription(),lots.getStartTime(),lots.getFinishTime()
        ,lots.getStartPrice(),lots.getBasePrice(),lots.getFileName(),lots.getIsSelled()};
        System.out.println(lots);
        int i = executeInsert(sql, params);
        this.closeResource();
        return i;
    }

    @Override
    public int deleteLots(Integer id) throws Exception {
        String sql = "delete from Lots where id = ?";
        int i = executeUpdate(sql, new Object[]{id});
        this.closeResource();
        return i;
    }

    @Override
    public Lots tableToClass(ResultSet rs) throws Exception {
        Lots lots = new Lots();
        lots.setId(rs.getInt(1));
        lots.setName(rs.getString(2));
        lots.setDescription(rs.getString(3));
        lots.setStartTime(rs.getTimestamp(4));
        lots.setFinishTime(rs.getTimestamp(5));
        lots.setStartPrice(rs.getDouble(6));
        lots.setBasePrice(rs.getDouble(7));
        lots.setFileName(rs.getString(8));
        lots.setIsSelled(rs.getInt(9));
        return lots;
    }
}
