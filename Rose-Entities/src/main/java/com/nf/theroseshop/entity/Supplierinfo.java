package com.nf.theroseshop.entity;


public class Supplierinfo {

  private int Supplier_id;
  private String Supplier_name;
  private String Supplier_adress;
  private String Supplier_person;
  private String Supplier_phone;
  private String Supplier_account;

  public Supplierinfo() {
  }

  public Supplierinfo(int supplier_id, String supplier_name, String supplier_adress, String supplier_person, String supplier_phone, String supplier_account) {
    Supplier_id = supplier_id;
    Supplier_name = supplier_name;
    Supplier_adress = supplier_adress;
    Supplier_person = supplier_person;
    Supplier_phone = supplier_phone;
    Supplier_account = supplier_account;
  }

  @Override
  public String toString() {
    return "Supplierinfo{" +
            "Supplier_id=" + Supplier_id +
            ", Supplier_name='" + Supplier_name + '\'' +
            ", Supplier_adress='" + Supplier_adress + '\'' +
            ", Supplier_person='" + Supplier_person + '\'' +
            ", Supplier_phone='" + Supplier_phone + '\'' +
            ", Supplier_account='" + Supplier_account + '\'' +
            '}';
  }

  public int getSupplier_id() {
    return Supplier_id;
  }

  public void setSupplier_id(int supplier_id) {
    Supplier_id = supplier_id;
  }

  public String getSupplier_name() {
    return Supplier_name;
  }

  public void setSupplier_name(String supplier_name) {
    Supplier_name = supplier_name;
  }

  public String getSupplier_adress() {
    return Supplier_adress;
  }

  public void setSupplier_adress(String supplier_adress) {
    Supplier_adress = supplier_adress;
  }

  public String getSupplier_person() {
    return Supplier_person;
  }

  public void setSupplier_person(String supplier_person) {
    Supplier_person = supplier_person;
  }

  public String getSupplier_phone() {
    return Supplier_phone;
  }

  public void setSupplier_phone(String supplier_phone) {
    Supplier_phone = supplier_phone;
  }

  public String getSupplier_account() {
    return Supplier_account;
  }

  public void setSupplier_account(String supplier_account) {
    Supplier_account = supplier_account;
  }
}
