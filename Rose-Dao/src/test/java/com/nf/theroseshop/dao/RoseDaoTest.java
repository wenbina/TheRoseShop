package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Rose;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class RoseDaoTest {
    @Autowired
    RoseDao roseDao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAll() {
        List<Rose> getAll=roseDao.getAll("",1.0,1,10);
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
        List<Integer> list=new ArrayList<Integer>();
        list.add(41);
        list.add(42);
        int deleteids=roseDao.deleteids(list);
        System.out.println(deleteids);
    }
}