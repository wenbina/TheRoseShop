package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Collectiones;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollectionDao {
    //收藏
    int addCollection(Collectiones collectiones);
    //取消收藏
    int deleteCollection(String CollectionCode);
    //根据用户编号查询收藏商品
    List<Collectiones> selectCollection(@Param("userId") int userId,@Param("pageNo") int pageNo, @Param("pageSize")int pageSize);
}
