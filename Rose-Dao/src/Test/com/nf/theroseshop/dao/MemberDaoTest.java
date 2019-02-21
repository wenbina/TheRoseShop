package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Member;
import com.nf.theroseshop.entity.Usertable;
import com.nf.theroseshop.from.MemberFrom;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class MemberDaoTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addMember() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        MemberDao memberDao=ctx.getBean(MemberDao.class);
        Member member=new Member();
        System.out.println(member);
    }
    @Test    public void selectByIfAndPage(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        MemberDao memberDao=ctx.getBean(MemberDao.class);
        List<MemberFrom> list=memberDao.selectByIfAndPage("李",0,1);
        System.out.println(list);
    }
}