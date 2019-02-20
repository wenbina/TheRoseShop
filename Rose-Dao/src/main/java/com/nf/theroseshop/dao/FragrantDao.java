package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Fragrant;
import com.nf.theroseshop.entity.Gift;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FragrantDao {
    //香薰分页查询和模糊查
    List<Fragrant> getAll(@Param("Fragrant_name") String Fragrant_name, @Param("Fragrant_price") Double Fragrant_price, @Param("page") int page, @Param("limit") int limit);
    //添加香薰
    int insert(Fragrant fragrant);
    //修改香薰
    int updata(Fragrant fragrant);
    //单删除香薰
    int deleteid(int Fragrant_id);
    //多删除香薰
    int deleteids(@Param("Fragrant_id") List<Integer> Fragrant_ids);
}
