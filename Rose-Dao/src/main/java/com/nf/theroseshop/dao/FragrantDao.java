package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Fragrant;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FragrantDao {
    //查看全部的数据
    List<Fragrant> flowerAllData(Fragrant fragrant);
    //香薰分页查询和模糊查
    List<Fragrant> getAll(@Param("Fragrant_name") String Fragrant_name, @Param("Fragrant_price") Double Fragrant_price,@Param("Fragrant_Stock") Integer Fragrant_Stock,@Param("Fragrant_sale") Integer Fragrant_sale , @Param("page") int page, @Param("limit") int limit);
    //添加香薰
    int insert(Fragrant fragrant);
    //修改香薰
    int updata(Fragrant fragrant);
    //单删除香薰
    int deleteid(int Fragrant_id);
    //多删除香薰
    int deleteids(@Param("Fragrant_id") List<Integer> Fragrant_ids);
}
