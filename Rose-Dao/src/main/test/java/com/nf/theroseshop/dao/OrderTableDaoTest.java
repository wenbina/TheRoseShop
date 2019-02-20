package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Ordertable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
}