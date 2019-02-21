package com.nf.theroseshop.service;

import com.nf.theroseshop.entity.Collectiones;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollectionService {
//收藏商品
    int insertCollection(Collectiones collectiones);
 //取消收藏
    int delCollection(String CollectionCode);
 //根据用户编号查询收藏商品
    List<Collectiones> queryByUserId(@Param("userId") int userId,@Param("pageNo") int pageNo, @Param("pageSize")int pageSize);
}
