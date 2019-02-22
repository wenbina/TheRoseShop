package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Immortal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ImmortalDaoTest {
    @Autowired
    ImmortalDao immortalDao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAll() {
        List<Immortal> list=immortalDao.getAll("",null,null,null,1,10);
        System.out.println(list);
    }

    @Test
    public void insert() {
        Immortal immortal=new Immortal();
        immortal.setImmortal_code("34");
        immortal.setImmortal_name("爱你一辈子");
        immortal.setImmortal_content("");
        immortal.setImmortal_price(1314);
        immortal.setImmortal_reason("我爱你一辈子，守护你一辈子！");
        immortal.setImmortal_composition("直径12.5cm x 高14cm");
        immortal.setImmortal_story("为了你我什么都不要，我只要和你在一起到永远。");
        immortal.setImmortal_explain("每天都要用阳光和水！");
        immortal.setImmortal_stock(100);
        immortal.setImmortal_sale(99);
        immortal.setImmortal_supplier(10000);
        immortal.setImmortal_smallPirture("123.jpg");
        int insert=immortalDao.insert(immortal);
        System.out.println(insert);
    }

    @Test
    public void updata() {
        Immortal immortal=new Immortal();
        immortal.setImmortal_id(34);
        immortal.setImmortal_code("34");
        immortal.setImmortal_name("我爱死你了");
        immortal.setImmortal_content("5201314.jpg");
        immortal.setImmortal_price(1314);
        immortal.setImmortal_reason("我爱你一辈子，守护你一辈子！");
        immortal.setImmortal_composition("直径12.5cm x 高14cm");
        immortal.setImmortal_story("为了你我什么都不要，我只要和你在一起到永远。");
        immortal.setImmortal_explain("每天都要用阳光和水！");
        immortal.setImmortal_stock(100);
        immortal.setImmortal_sale(99);
        immortal.setImmortal_supplier(10000);
        immortal.setImmortal_smallPirture("123.jpg");
        int updata=immortalDao.updata(immortal);
        System.out.println(updata);
    }

    @Test
    public void deleteid() {
      int deleteid=immortalDao.deleteid(31);
        System.out.println(deleteid);
    }

    @Test
    public void deleteids() {
        List<Integer> list=new ArrayList<Integer>();
        list.add(32);
        list.add(33);
        int deleteids=immortalDao.deleteids(list);
        System.out.println(deleteids);
    }
}