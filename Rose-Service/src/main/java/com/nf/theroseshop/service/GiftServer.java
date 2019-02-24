package com.nf.theroseshop.service;

import com.nf.theroseshop.entity.Gift;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GiftServer {
    //查看全部的数据
    List<Gift> flowerAllData(Gift gift);
    //礼物分页查询和模糊查
    List<Gift> getAll(String gift_name,Double gift_price,Integer gift_stock,Integer gift_sale,int page,int limit);
    //添加礼物
    int insert(Gift gift);
    //修改礼物
    int updata(Gift gift);
    //单删除礼物
    int deleteid(int gift_id);
    //多删除礼物
    int deleteids(List<Integer> gift_ids);
}
