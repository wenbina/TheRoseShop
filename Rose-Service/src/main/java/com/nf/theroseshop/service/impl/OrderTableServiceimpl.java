package com.nf.theroseshop.service.impl;

import com.nf.theroseshop.dao.OrderTableDao;
import com.nf.theroseshop.entity.Ordergoods;
import com.nf.theroseshop.entity.Ordertable;
import com.nf.theroseshop.service.OrderTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderTableServiceimpl implements OrderTableService {
    @Autowired
    OrderTableDao dao;

    @Override
    public List<Ordertable> selectOrder() {
        return dao.selectOrder();
    }

    @Override
    public int selectOrderCount() {
        return dao.selectOrderCount();
    }

    @Override
    public List<Ordergoods> selectOrderGoods(int orderTableId) {
        return dao.selectOrderGoods(orderTableId);
    }

    @Override
    public int selectOrderGoodsCount() {
        return dao.selectOrderGoodsCount();
    }

    @Override
    public int deleteOrder(int id) {
        return dao.deleteOrder(id);
    }

    @Override
    public int deleteOrderAll(List<Integer> ids) {
        return dao.deleteOrderAll(ids);
    }

    @Override
    public int insertOrder(Ordertable ordertable) {
        return dao.insertOrder(ordertable);
    }
}
