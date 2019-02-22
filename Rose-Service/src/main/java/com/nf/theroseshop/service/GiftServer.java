package com.nf.theroseshop.service;

import com.nf.theroseshop.entity.Gift;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GiftServer {
    //礼物分页查询和模糊查
    List<Gift> getAll(String gift_name,Double gift_price,int page,int limit);
    //添加礼物
    int insert(Gift gift);
    //修改礼物
    int updata(Gift gift);
    //单删除礼物
    int deleteid(int gift_id);
    //多删除礼物
    int deleteids(List<Integer> gift_ids);
}
