package com.nf.theroseshop.service.Impl;

import com.nf.theroseshop.common.MD5Util;
import com.nf.theroseshop.dao.EmployeeDao;
import com.nf.theroseshop.entity.Employee;
import com.nf.theroseshop.entity.NoteResult;
import com.nf.theroseshop.service.EmployeeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;


    public NoteResult checkLogin(String employeeNumber, String employeePwd) throws NoSuchAlgorithmException {
        NoteResult result = new NoteResult();
        Employee employee = employeeDao.selectbyemployeeNumber(employeeNumber);

        if(employee==null){
            result.setStatus(1);
            result.setMsg("账号不存在");
            return result;
        }
        //将用户输入的pwd密码加密
        String md5_pwd=MD5Util.md5(employeePwd);
        //与数据库密码比对
        if(!employee.getEmployeePwd().equals(md5_pwd)){
            result.setStatus(2);
            result.setMsg("密码不正确");
            return  result;
        }
        result.setStatus(0);
        result.setMsg("账号和密码正确");
        result.setData(employee.getEmployeeNumber());//返回loginId
        return  result;
    }

    public Employee selectbyemployeeNumber(String employeeNumber) {
        if (StringUtils.isEmpty(employeeNumber)){
            employeeNumber=null;
        }
        Employee employee=employeeDao.selectbyemployeeNumber(employeeNumber);
        return employee;
    }

    public boolean updateEmployeeState(String employeeId, String employeeState) {
        return employeeDao.updateEmployeeState(employeeId,employeeState);
    }

    //    查询所有
    public List<Employee> selectemployeeAll(String employee_number, String employee_name, String employeeType_name) {
        List<Employee> list=employeeDao.selectemployeeAll(employee_number,employee_name,employeeType_name);
        return list;
    }

//    添加
    public boolean addemployee( String employeeNumber,String employeePwd,
                                String employeeName, String employeeTx,
                                String employeeCode,String employeeWorktype,
                                String employeeState,String employeeDate) {
        return employeeDao.addemployee(employeeNumber,employeePwd,employeeName,employeeTx,
                employeeCode,employeeWorktype,employeeState,employeeDate);
    }

//    修改
    public boolean updateEmployee(String employeeId,String employeeName,
                                  String employeeTx,String employeeCode,
                                  String employeeWorktype,String employeeState,
                                  String employeeDate) {
        if (StringUtils.isEmpty(employeeName)){
            employeeName=null;
        }
        if (StringUtils.isEmpty(employeeTx)){
            employeeTx=null;
        }
        if (StringUtils.isEmpty(employeeCode)){
            employeeCode=null;
        }
        if (StringUtils.isEmpty(employeeWorktype)){
            employeeWorktype=null;
        }
        if (StringUtils.isEmpty(employeeState)){
            employeeState=null;
        }
        if (StringUtils.isEmpty(employeeDate)){
            employeeDate=null;
        }
        return employeeDao.updateEmployee(employeeId,employeeName,employeeTx,employeeCode,employeeWorktype,employeeState,employeeDate);
    }

//    删除
    public boolean deletebyId(int id) {
        return employeeDao.deletebyId(id);
    }

//    多删除
    public boolean deleteEmployeebyList(List<Integer> ids) {
        if(ids==null||ids.size()<=0) {
            return false;
        }
        return employeeDao.deleteEmployeebyList(ids);
    }

//    分页查询
    public List<Employee> getEmployeePager(int skip, int size, String employeeNumber,String employeeName, String employeeTypeName) {
        if (StringUtils.isEmpty(employeeNumber)){
            employeeNumber=null;
        }
        if (StringUtils.isEmpty(employeeName)){
            employeeName=null;
        }
        if (StringUtils.isEmpty(employeeTypeName)){
            employeeTypeName=null;
        }
//        int skip=(pageNO-1)*size;
        return employeeDao.getEmployeePager(skip,size,employeeNumber,employeeName,employeeTypeName);
    }

//    获取总数
    public int getEmployeeCount(String employeeNumber,String employeeName, String employeeTypeName) {
            if (StringUtils.isEmpty(employeeNumber)){
                employeeNumber=null;
            }
            if (StringUtils.isEmpty(employeeName)){
                employeeName=null;
            }
            if (StringUtils.isEmpty(employeeTypeName)){
                employeeTypeName=null;
            }
        return employeeDao.getEmployeeCount(employeeNumber,employeeName,employeeTypeName);
    }
}
