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
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
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
    public R usersInfopage(int skip, int size,
                           String employeeNumber, String employeeName, String employeeTypeName){
        return R.ok(employeeService.getEmployeePager(skip,size,employeeNumber,employeeName,employeeTypeName));
    }


//  根据员工账号查询
    @RequestMapping("/selectbyemployeeNumber")
    @ResponseBody
    public R selectbyemployeeNumber(String employeeNumber){
        return R.ok(employeeService.selectbyemployeeNumber(employeeNumber));
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


    //修改状态
    @RequestMapping("/updatestate")
    @ResponseBody
    public R updatestate(String employeeId,String employeeState){
        return  R.ok(employeeService.updateEmployeeState(employeeId,employeeState));
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



    //22.下载附件，导出Excel,csv
    @RequestMapping("/pushcsv")
    @ResponseBody
    public void pushcsv(String employeeNumber, String employeeName, String employeeTypeName,HttpServletResponse response) throws IOException {

        //POI
        //response.setContentType("text/html;charset=utf-8");
        //response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type","application/octet-stream;charset=utf-8");
        response.setHeader("Content-Disposition","attachment;filename=employee.csv");
        PrintWriter out = response.getWriter();
        //加上bom头,解决excel打开乱码问题
        byte[] bomStrByteArr = new byte[] { (byte) 0xef, (byte) 0xbb, (byte) 0xbf };
        String bomStr = new String(bomStrByteArr, "UTF-8");
        out.write(bomStr);

        List<Employee> list=employeeService.selectemployeeAll(employeeNumber,employeeName,employeeTypeName);

        StringBuffer str=new StringBuffer("");

        str.append("ID,账号,密码,姓名,图片,省份证号,入职时间,职位,状态\r\n");
        for (Employee employee:list) {
            str.append(employee.getEmployeeId()+","+employee.getEmployeeNumber()+","+employee.getEmployeePwd()+","+employee.getEmployeeName()+","+employee.getEmployeeTx()+","+employee.getEmployeeCode()+","+employee.getEmployeeDate()+","+employee.getEmployeetype().getEmployeeTypeName()+","
                    +employee.getEmployeeState()+"\r\n");
        }
        response.getWriter().write(str.toString());
    }






}
