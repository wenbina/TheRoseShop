package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Ordergoods;
import com.nf.theroseshop.entity.Ordertable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@ContextConfiguration({"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback()  //是否回滚
public class OrderTableDaoTest {
    @Autowired
    OrderTableDao dao;

    @Test
    public void selectOrder() {
        List<Ordertable> list =dao.selectOrder();
        System.out.println(list);
    }
    @Test
    public void selectOrderCount() {
        System.out.println(dao.selectOrderCount());
    }
    @Test
    public void selectOrderGoods(){
        List<Ordergoods> list = dao.selectOrderGoods(0);
        System.out.println(list);
    }
    @Test
    public void selectOrderGoodsCount(){
        System.out.println(dao.selectOrderGoodsCount());
    }
    @Test
    public void deleteOrder() {
        System.out.println(dao.deleteOrder(1));
    }
    @Test
    public void deleteOrderAll() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        System.out.println(dao.deleteOrderAll(list));
    }
    @Test
    public void insertOrderAll() {
        Ordertable list = new Ordertable();
        list.setOrderTableId(78900987);
        list.setOrderTableBuild(new Date());
        list.setOrderTableStatus(1);
        list.setOrderTableGetName("吴小姐");
        list.setOrderTableGetPhone("123456789012");
        list.setOrderTableGetAdress("广东省深圳市龙华365花园D栋504");
        list.setOrderTableGettime(new Date());
        list.setOrderTableGetType("0");
        list.setOrderTableExpressCode("1234567890567");
        list.setOrderTableExpressCompany("花宫坊极速配送");
        list.setOrderTableRejectReason("");
        list.setOrderTableMoney(20000);
        list.setOrderTableDiscount("不打折");
        list.setOrderTableTotalMoney(20000);
        list.setOrderTableUsercode(1);
        list.setOrderTableClose("1");
        System.out.println(dao.insertOrder(list));
    }
    @Test
    public void updateOrderAll() {
        Ordertable list = new Ordertable();
        list.setOrderTableStatus(2);
        list.setOrderTableGetName("吴小姐");
        list.setOrderTableGetPhone("123456789012");
        list.setOrderTableGetAdress("广东省深圳市龙华365花园D栋504");
        list.setOrderTableClose("1");
        list.setOrderTableId(12341234);
        System.out.println(dao.updateOrder(list));
    }
}