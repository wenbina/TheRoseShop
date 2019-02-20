package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Ordertable;

import java.util.List;

public interface OrderTableDao {
    List<Ordertable> selectOrder();
    int selectOrderCount();
    //del
    int deleteOrder(int id);
    int deleteOrderAll(List<Integer> ids);
}
