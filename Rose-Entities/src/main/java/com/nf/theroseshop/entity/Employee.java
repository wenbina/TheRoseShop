package com.nf.theroseshop.entity;


import java.io.Serializable;
import java.util.Date;


public class Employee implements Serializable {

  private long employeeId;
  private String employeeName;
  private String employeeTx;
  private String employeeCode;
  private String employeeDate;
  private long employeeWorktype;
  private String employeeNumber;
  private String employeePwd;
  private long employeeState;
  private Employeetype employeetype;


  public long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(long employeeId) {
    this.employeeId = employeeId;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public String getEmployeeTx() {
    return employeeTx;
  }

  public void setEmployeeTx(String employeeTx) {
    this.employeeTx = employeeTx;
  }

  public String getEmployeeCode() {
    return employeeCode;
  }

  public void setEmployeeCode(String employeeCode) {
    this.employeeCode = employeeCode;
  }

  public String getEmployeeDate() {
    return employeeDate;
  }

  public void setEmployeeDate(String employeeDate) {
    this.employeeDate = employeeDate;
  }

  public long getEmployeeWorktype() {
    return employeeWorktype;
  }

  public void setEmployeeWorktype(long employeeWorktype) {
    this.employeeWorktype = employeeWorktype;
  }

  public String getEmployeeNumber() {
    return employeeNumber;
  }

  public void setEmployeeNumber(String employeeNumber) {
    this.employeeNumber = employeeNumber;
  }

  public String getEmployeePwd() {
    return employeePwd;
  }

  public void setEmployeePwd(String employeePwd) {
    this.employeePwd = employeePwd;
  }

  public long getEmployeeState() {
    return employeeState;
  }

  public void setEmployeeState(long employeeState) {
    this.employeeState = employeeState;
  }

  public Employeetype getEmployeetype() {
    return employeetype;
  }

  public void setEmployeetype(Employeetype employeetype) {
    this.employeetype = employeetype;
  }

  public Employee() {
  }

  public Employee(long employeeId, String employeeName, String employeeTx, String employeeCode, String employeeDate, long employeeWorktype, String employeeNumber, String employeePwd, long employeeState, Employeetype employeetype) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.employeeTx = employeeTx;
    this.employeeCode = employeeCode;
    this.employeeDate = employeeDate;
    this.employeeWorktype = employeeWorktype;
    this.employeeNumber = employeeNumber;
    this.employeePwd = employeePwd;
    this.employeeState = employeeState;
    this.employeetype = employeetype;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "employeeId=" + employeeId +
            ", employeeName='" + employeeName + '\'' +
            ", employeeTx='" + employeeTx + '\'' +
            ", employeeCode='" + employeeCode + '\'' +
            ", employeeDate=" + employeeDate +
            ", employeeWorktype=" + employeeWorktype +
            ", employeeNumber='" + employeeNumber + '\'' +
            ", employeePwd='" + employeePwd + '\'' +
            ", employeeState=" + employeeState +
            ", employeetype=" + employeetype +
            '}';
  }
}
