package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Collectiones;
import com.nf.theroseshop.entity.Member;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class CollectionDaoTest {

    @Test
    public void addCollection() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionDao collectionDao=ctx.getBean(CollectionDao.class);
        Collectiones collectiones=new Collectiones();
        collectiones.setCollectionUserid(3);
        collectiones.setCollectionCode("g10001");
        System.out.println(collectionDao.addCollection(collectiones));
    }
    @Test
    public void deleteCollection(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionDao collectionDao=ctx.getBean(CollectionDao.class);
        System.out.println(collectionDao.deleteCollection("g10001"));
    }
    @Test
    public void selectCollection(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionDao collectionDao=ctx.getBean(CollectionDao.class);
        System.out.println(collectionDao.selectCollection(1,1,1));
    }
}