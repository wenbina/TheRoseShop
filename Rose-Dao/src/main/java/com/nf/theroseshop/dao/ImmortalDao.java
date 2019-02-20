package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Immortal;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface   ImmortalDao {
    //永生花分页查询和模糊查
    List<Immortal> getAll(@Param("immortal_name") String immortal_name,@Param("immortal_price") Double immortal_price,@Param("page") int page,@Param("limit") int limit);
    //添加永生花
    int insert(Immortal immortal);
    //修改永生花
    int updata(Immortal immortal);
    //单删除永生花
    int deleteid(int immortal_id);
    //多删除永生花
    int deleteids(@Param("immortal_id") List<Integer> ids);
}
