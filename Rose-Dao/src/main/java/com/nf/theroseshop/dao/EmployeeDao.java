package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {

    List<Employee> selectemployeeAll(@Param("employeeNumber") String employeeNumber,@Param("employeeName") String employeeName,@Param("employeeTypeName") String employeeTypeName);

    Employee selectbyemployeeNumber(@Param("employeeNumber") String employeeNumber);

    boolean addemployee(@Param("employeeNumber") String employeeNumber,@Param("employeePwd")String employeePwd,
                        @Param("employeeName")String employeeName, @Param("employeeTx")String employeeTx,
                        @Param("employeeCode")String employeeCode, @Param("employeeWorktype")String employeeWorktype,
                        @Param("employeeState")String employeeState,@Param("employeeDate")String employeeDate);

//    employeeId
//    employeeName
//    employeeTx
//    employeeCode
//    employeeWorktype
//    employeeState
//    employeeDate
    boolean updateEmployee(@Param("employeeId") String employeeId,@Param("employeeName")String employeeName,
                           @Param("employeeTx")String employeeTx,@Param("employeeCode")String employeeCode,
                           @Param("employeeWorktype")String employeeWorktype,@Param("employeeState")String employeeState,
                           @Param("employeeDate")String employeeDate);

    boolean updateEmployeeState(@Param("employeeId") String employeeId,@Param("employeeState")String employeeState);


    boolean deletebyId(int id);

    boolean deleteEmployeebyList(List<Integer> ids);

    List<Employee> getEmployeePager(@Param("skip")int skip,@Param("size") int size,@Param("employeeNumber") String employeeNumber,@Param("employeeName") String employeeName,@Param("employeeTypeName") String employeeTypeName);

    int getEmployeeCount(@Param("employeeNumber") String employeeNumber,@Param("employeeName") String employeeName,@Param("employeeTypeName") String employeeTypeName);


}
