package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Gift;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class GiftDaoTest {
    @Autowired
    GiftDao giftDao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAll() {
        List<Gift> getAll=giftDao.getAll("",1314.0,1,10);
        System.out.println(getAll);
    }

    @Test
    public void insert() {
    }

    @Test
    public void updata() {
    }

    @Test
    public void deleteid() {
    }

    @Test
    public void deleteids() {
    }
}