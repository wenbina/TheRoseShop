package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Goodsput;
import com.nf.theroseshop.entity.Goodsputdata;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@ContextConfiguration({"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback()  //是否回滚
public class GoodsPutDaoTest {
    @Autowired
    GoodsPutDao dao;

    @Test
    public void selectGoodsPut() {
        Map<String ,Object> objectMap = new HashMap<String, Object>();
        objectMap.put("id","");
        objectMap.put("code","");
        objectMap.put("date","");
        objectMap.put("operator","");
        objectMap.put("page",0);
        objectMap.put("limit",10);
        List<Goodsput> list = dao.selectGoodsPut(objectMap);
        System.out.println(list);
    }
    @Test
    public void selectGoodsPutCount() {
        System.out.println(dao.selectGoodsPutCount(1,1,"",1,0,3));
    }
    @Test
    public void selectGoodsPutData() {
        List<Goodsputdata> list  =dao.selectGoodsPutData(1);//1,"100101","精品香水",1,0,3
        System.out.println(list);
    }
    @Test
    public void selectGoodsPutDataCount() {
        System.out.println(dao.selectGoodsPutDataCount(1,"100101","精品香水",1,0,3));
    }
    @Test
    public void insertGoodsPut(){
        System.out.println(dao.insertGoodsPut(1,"2018-1-1",3));
    }
    @Test
    public void insertGoodsPutData(){
        System.out.println(dao.insertGoodsPutData("10015","彼岸花",100,2500,250000,3));
    }
    @Test
    public void updateGoodsPut(){
        System.out.println(dao.updateGoodsPut(1,"2019-1-1",3,3));
    }
    @Test
    public void updateGoodsPutData(){
        System.out.println(dao.updateGoodsPutData("100101","彼岸花",10,1000,10000,1,1));
    }
    @Test
    public void deleteGoodsPut(){
        System.out.println(dao.deleteGoodsPut(3));
    }
    @Test
    public void deleteGoodsPutAll(){
        List<Integer> list=new ArrayList<Integer>();
        list.add(3);
        System.out.println(dao.deleteGoodsPutAll(list));
    }
    @Test
    public void deleteGoodsPutData(){
        System.out.println(dao.deleteGoodsPutData(1));
    }
    @Test
    public void deleteGoodsPutDataAll(){
        List<Integer> list=new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        System.out.println(dao.deleteGoodsPutDataAll(list));
    }
}