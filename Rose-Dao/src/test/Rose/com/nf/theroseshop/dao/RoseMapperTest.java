package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Rose;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

@ContextConfiguration({"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback()  //是否回滚
public class RoseMapperTest {
    @Autowired
    RoseMapper roseMapper;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRosePage() {
        List<Rose> setUp=roseMapper.getRosePage("",1.0,0,6);
        System.out.println(setUp);
    }

    @Test
    public void getRoseSize() {
        int size = roseMapper.getRoseSize("",1.0);
        System.out.println(size);
    }

    @Test
    public void roseAdd() {
        int result = roseMapper.roseAdd("","","",1.0,"","","","",1,1);
        System.out.println(result);
    }

    @Test
    public void deleteRose() {
        int result = roseMapper.deleteRose(1);
        System.out.println(result);
    }

    @Test
    public void updataRose() {
         int result = roseMapper.updataRose("","",1.0,"","","","",1,1,"",1);
         System.out.println(result);
    }
}