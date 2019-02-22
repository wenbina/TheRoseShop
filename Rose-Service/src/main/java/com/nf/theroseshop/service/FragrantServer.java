package com.nf.theroseshop.service;

import com.nf.theroseshop.entity.Fragrant;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FragrantServer {
    //查看全部的数据
    List<Fragrant> flowerAllData(Fragrant fragrant);
    //香薰分页查询和模糊查
    List<Fragrant> getAll(String Fragrant_name,Double Fragrant_price,Integer Fragrant_Stock,Integer Fragrant_sale,int page,int limit);
    //添加香薰
    int insert(Fragrant fragrant);
    //修改香薰
    int updata(Fragrant fragrant);
    //单删除香薰
    int deleteid(int Fragrant_id);
    //多删除香薰
    int deleteids(List<Integer> Fragrant_ids);
}
