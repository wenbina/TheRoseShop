package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Usertable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class UsertableDaoTest {

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UsertableDao usertableDao=ctx.getBean(UsertableDao.class);

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addUsertable() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UsertableDao usertableDao=ctx.getBean(UsertableDao.class);
        Usertable usertable=new Usertable();
        usertable.setUserPhone("13110236784");
        usertable.setUserPwd("qweery");
        usertable.setUserName("李四");
        usertable.setUuserSex("男");

//        String string = "2016-10-24";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       /* usertable.setUserBirthday("2018-11-22");
        usertable.setUserState(0);*/
       // System.out.println(usertableDao.addUsertable(usertable));
    }

    @Test
    public void updateUsertable() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UsertableDao usertableDao=ctx.getBean(UsertableDao.class);
        /*Usertable usertable=usertableDao.SelectByUserId(1);
        usertable.setUserProvince("广东省");
        usertable.setUserCity("珠海市");
        usertable.setUserDistrict("斗门区");
        usertable.setUserDetailedAddress("南方IT学院");
        System.out.println(usertableDao.updateUsertable(usertable));*/
    }

    @Test
    public void deleteUsertable() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UsertableDao usertableDao=ctx.getBean(UsertableDao.class);
        System.out.println(usertableDao.deleteUsertable(2));
    }
    @Test
    public void selectByIfAndPage(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UsertableDao usertableDao=ctx.getBean(UsertableDao.class);
        System.out.println(usertableDao.selectByIfAndPage());
    }
    @Test
    public void loginUsertable(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UsertableDao usertableDao=ctx.getBean(UsertableDao.class);
        System.out.println(usertableDao.loginUsertable("18319273648"));
    }

    @Test
    public void updateByUserState() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UsertableDao usertableDao=ctx.getBean(UsertableDao.class);
        Usertable usertable=new Usertable();
        usertable.setUserId(5);
        usertable.setUserState(1);
        System.out.println(usertableDao.updateByUserState(usertable));
    }
}