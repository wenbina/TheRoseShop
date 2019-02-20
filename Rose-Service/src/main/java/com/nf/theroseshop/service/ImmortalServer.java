package com.nf.theroseshop.service;

import com.nf.theroseshop.entity.Immortal;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImmortalServer {
    //永生花分页查询和模糊查
    List<Immortal> getAll(String immortal_name,Double immortal_price,int page,int limit);
    //添加永生花
    int insert(Immortal immortal);
    //修改永生花
    int updata(Immortal immortal);
    //单删除永生花
    int deleteid(int immortal_id);
    //多删除永生花
    int deleteids(List<Integer> ids);
}
