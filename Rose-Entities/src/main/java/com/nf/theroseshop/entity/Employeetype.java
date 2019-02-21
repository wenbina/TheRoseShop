package com.nf.theroseshop.entity;


public class Employeetype {

  private long eemployeeTypeId;
  private String employeeTypeName;


  public long getEemployeeTypeId() {
    return eemployeeTypeId;
  }

  public void setEemployeeTypeId(long eemployeeTypeId) {
    this.eemployeeTypeId = eemployeeTypeId;
  }


  public String getEmployeeTypeName() {
    return employeeTypeName;
  }

  public void setEmployeeTypeName(String employeeTypeName) {
    this.employeeTypeName = employeeTypeName;
  }


  @Override
  public String toString() {
    return "Employeetype{" +
            "eemployeeTypeId=" + eemployeeTypeId +
            ", employeeTypeName='" + employeeTypeName + '\'' +
            '}';
  }

}
