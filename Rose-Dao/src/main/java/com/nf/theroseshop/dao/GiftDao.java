package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Gift;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GiftDao {
    //查看全部的数据
    List<Gift> flowerAllData(Gift gift);
    //礼物分页查询和模糊查
    List<Gift> getAll(@Param("gift_name") String gift_name, @Param("gift_price") Double gift_price,@Param("gift_stock") Integer gift_stock,@Param("gift_sale") Integer gift_sale ,@Param("page") int page, @Param("limit") int limit);
    //添加礼物
    int insert(Gift gift);
    //修改礼物
    int updata(Gift gift);
    //单删除礼物
    int deleteid(int gift_id);
    //多删除礼物
    int deleteids(@Param("gift_id") List<Integer> gift_ids);
}
