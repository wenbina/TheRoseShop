package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Ordergoods;
import com.nf.theroseshop.entity.Ordertable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderTableDao {
    //sel
    List<Ordertable> selectOrder();
    int selectOrderCount();
    List<Ordergoods> selectOrderGoods(@Param("orderTableId") int orderTableId);
    int selectOrderGoodsCount();
    //del
    int deleteOrder(@Param("id") int id);
    int deleteOrderAll(List<Integer> ids);
    //ins
    int insertOrder(Ordertable ordertable);
    //update
    int updateOrder(Ordertable ordertable);
}
