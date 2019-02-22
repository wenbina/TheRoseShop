package com.nf.theroseshop.test;

import com.nf.theroseshop.dao.EmployeeDao;
import com.nf.theroseshop.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
//@Transactional
//@Rollback(true)  //是否回滚
public class EmployeeDaoTest {

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void selectemployeeAll(){
        List<Employee> list=employeeDao.selectemployeeAll("","","");
        System.out.println(list);
    }

    @Test
    public void selectbyemployeeNumber(){
        Employee employee=employeeDao.selectbyemployeeNumber("223366");
        System.out.println(employee);
    }

    @Test
    public void update(){
//        Employee employee=new Employee();

//
//        employee.setEmployeeId(75);
//        employee.setEmployeePwd("123456789");
//        employee.setEmployeeName("龚凡99");
//        employee.setEmployeeCode("4409211199010183568");
//        employee.setEmployeeState(1);
//        String string = "2016-10-24";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        try {
//            System.out.println(sdf.parse(string));
//            employee.setEmployeeDate(sdf.parse(string));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        employee.setEmployeeTx("3245345.jpg");
//        employee.setEmployeeWorktype(3);

        System.out.println(employeeDao.updateEmployee("75","龚凡000",
                "765432.jpg","4409211199010183568","3",
                "0","2019-10-10"));



    }

    @Test
    public void add(){


//        Employee employee=new Employee();
//
//        employee.setEmployeeNumber("223367");
//        employee.setEmployeePwd("123456789");
//        employee.setEmployeeName("龚凡8");
//        employee.setEmployeeCode("4409211199010183568");
//        employee.setEmployeeState(1);
//        String string = "2016-10-24";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        try {
//            System.out.println(sdf.parse(string));
//            employee.setEmployeeDate(sdf.parse(string));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        employee.setEmployeeDate("");
//        employee.setEmployeeTx("98765.jpg");
//        employee.setEmployeeWorktype(3);

        System.out.println(employeeDao.addemployee("667788","12345678",
                "龚凡0", "765432.jpg","4409211199010183568",
                "3", "1","2019-10-10"));

    }


    @Test
    public void updateemployeeState(){

        System.out.println(employeeDao.updateEmployeeState("18","0"));



    }




}
