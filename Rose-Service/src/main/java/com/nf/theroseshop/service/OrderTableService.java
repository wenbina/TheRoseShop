package com.nf.theroseshop.service;

import com.nf.theroseshop.entity.Ordergoods;
import com.nf.theroseshop.entity.Ordertable;

import java.util.List;

public interface OrderTableService {
    //sel
    List<Ordertable> selectOrder();
    int selectOrderCount();
    List<Ordergoods> selectOrderGoods(int orderTableId);
    int selectOrderGoodsCount();
    //del
    int deleteOrder(int id);
    int deleteOrderAll(List<Integer> ids);
    //ins
    int insertOrder(Ordertable ordertable);
}
