package com.nf.theroseshop.controller;


import com.nf.theroseshop.common.R;
import com.nf.theroseshop.entity.Employee;
import com.nf.theroseshop.entity.NoteResult;
import com.nf.theroseshop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Controller
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    //员工登录账号
    @RequestMapping("/login")
    @ResponseBody
    public NoteResult login(String employeeNumber, String employeePwd, HttpServletRequest request) throws NoSuchAlgorithmException {

        HttpSession session = request.getSession();
        session.setAttribute("employeeNumber",employeeNumber);
        System.out.println(employeeNumber);

        NoteResult result = employeeService.checkLogin(employeeNumber,employeePwd);
        return result;
    }



//    分页查询
    @RequestMapping("/employeeInfopage")
    @ResponseBody
    public R usersInfopage(@RequestParam(defaultValue ="1")int param1,
                           @RequestParam(defaultValue = "4")int param2,
                           String employeeNumber, String employeeName, String employeeTypeName){
        return R.ok(employeeService.getEmployeePager(param1,param2,employeeNumber,employeeName,employeeTypeName));
    }

//    查询总数
    @RequestMapping("/employeecount")
    @ResponseBody
    public R userscount(String employeeNumber, String employeeName, String employeeTypeName){
        return R.ok(employeeService.getEmployeeCount(employeeNumber,employeeName,employeeTypeName));
    }


//添加，注册账号
    @RequestMapping("/add")
    @ResponseBody
    public R add(String employeeNumber,String employeePwd,
                 String employeeName, String employeeTx,
                 String employeeCode,String employeeWorktype,
                 String employeeState,String employeeDate){
        return  R.ok(employeeService.addemployee(employeeNumber,employeePwd,employeeName,employeeTx,
                employeeCode,employeeWorktype,employeeState,employeeDate));
    }

//修改
    @RequestMapping("/update")
    @ResponseBody
    public R update(String employeeId,String employeeName,
                    String employeeTx,String employeeCode,
                    String employeeWorktype,String employeeState,
                    String employeeDate){
        return  R.ok(employeeService.updateEmployee(employeeId,employeeName,employeeTx,employeeCode,
                employeeWorktype,employeeState,employeeDate));
    }

//  删除
    @RequestMapping("/deletebyid")
    @ResponseBody
    public R deletebyid(int id){
        return  R.ok(employeeService.deletebyId(id));
    }

//    多删除
    @RequestMapping("/deletebulist")
    @ResponseBody
    public R deletebulist(List<Integer> ids){
        return  R.ok(employeeService.deleteEmployeebyList(ids));
    }




}
