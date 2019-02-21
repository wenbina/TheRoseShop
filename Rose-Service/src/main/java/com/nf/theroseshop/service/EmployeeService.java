package com.nf.theroseshop.service;

import com.nf.theroseshop.entity.Employee;
import com.nf.theroseshop.entity.NoteResult;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public interface EmployeeService {


//  登录验证employeeNumber,employeePwd
    public NoteResult checkLogin(String employeeNumber, String employeePwd) throws NoSuchAlgorithmException;


//  查询所有
    List<Employee> selectemployeeAll(String employeeNumber,String employeeName, String employeeTypeName);

//    添加
    boolean addemployee( String employeeNumber,String employeePwd,
                        String employeeName, String employeeTx,
                        String employeeCode,String employeeWorktype,
                        String employeeState,String employeeDate);

//    修改
    boolean updateEmployee(String employeeId,String employeeName,
                           String employeeTx,String employeeCode,
                           String employeeWorktype,String employeeState,
                           String employeeDate);

//    删除
    boolean deletebyId(int id);

//    多删除
    boolean deleteEmployeebyList(List<Integer> ids);

//    分页查询
    List<Employee> getEmployeePager(int skip, int size, String employeeNumber,String employeeName, String employeeTypeName);

//    获取总数
    int getEmployeeCount( String employeeNumber,String employeeName, String employeeTypeName);


}
