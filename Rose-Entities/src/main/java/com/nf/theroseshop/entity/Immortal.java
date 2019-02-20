package com.nf.theroseshop.entity;


public class Immortal {

  private int immortal_id;
  private String immortal_code;
  private String immortal_name;
  private String immortal_content;
  private double immortal_price;
  private String immortal_reason;
  private String immortal_composition;
  private String immortal_story;
  private String immortal_explain;
  private int immortal_stock;
  private int immortal_sale;
  private int immortal_supplier;

  public Immortal() {
  }

  public Immortal(int immortal_id, String immortal_code, String immortal_name, String immortal_content, double immortal_price, String immortal_reason, String immortal_composition, String immortal_story, String immortal_explain, int immortal_stock, int immortal_sale, int immortal_supplier) {
    this.immortal_id = immortal_id;
    this.immortal_code = immortal_code;
    this.immortal_name = immortal_name;
    this.immortal_content = immortal_content;
    this.immortal_price = immortal_price;
    this.immortal_reason = immortal_reason;
    this.immortal_composition = immortal_composition;
    this.immortal_story = immortal_story;
    this.immortal_explain = immortal_explain;
    this.immortal_stock = immortal_stock;
    this.immortal_sale = immortal_sale;
    this.immortal_supplier = immortal_supplier;
  }

  @Override
  public String toString() {
    return "Immortal{" +
            "immortal_id=" + immortal_id +
            ", immortal_code='" + immortal_code + '\'' +
            ", immortal_name='" + immortal_name + '\'' +
            ", immortal_content='" + immortal_content + '\'' +
            ", immortal_price=" + immortal_price +
            ", immortal_reason='" + immortal_reason + '\'' +
            ", immortal_composition='" + immortal_composition + '\'' +
            ", immortal_story='" + immortal_story + '\'' +
            ", immortal_explain='" + immortal_explain + '\'' +
            ", immortal_stock=" + immortal_stock +
            ", immortal_sale=" + immortal_sale +
            ", immortal_supplier=" + immortal_supplier +
            '}';
  }

  public int getImmortal_id() {
    return immortal_id;
  }

  public void setImmortal_id(int immortal_id) {
    this.immortal_id = immortal_id;
  }

  public String getImmortal_code() {
    return immortal_code;
  }

  public void setImmortal_code(String immortal_code) {
    this.immortal_code = immortal_code;
  }

  public String getImmortal_name() {
    return immortal_name;
  }

  public void setImmortal_name(String immortal_name) {
    this.immortal_name = immortal_name;
  }

  public String getImmortal_content() {
    return immortal_content;
  }

  public void setImmortal_content(String immortal_content) {
    this.immortal_content = immortal_content;
  }

  public double getImmortal_price() {
    return immortal_price;
  }

  public void setImmortal_price(double immortal_price) {
    this.immortal_price = immortal_price;
  }

  public String getImmortal_reason() {
    return immortal_reason;
  }

  public void setImmortal_reason(String immortal_reason) {
    this.immortal_reason = immortal_reason;
  }

  public String getImmortal_composition() {
    return immortal_composition;
  }

  public void setImmortal_composition(String immortal_composition) {
    this.immortal_composition = immortal_composition;
  }

  public String getImmortal_story() {
    return immortal_story;
  }

  public void setImmortal_story(String immortal_story) {
    this.immortal_story = immortal_story;
  }

  public String getImmortal_explain() {
    return immortal_explain;
  }

  public void setImmortal_explain(String immortal_explain) {
    this.immortal_explain = immortal_explain;
  }

  public int getImmortal_stock() {
    return immortal_stock;
  }

  public void setImmortal_stock(int immortal_stock) {
    this.immortal_stock = immortal_stock;
  }

  public int getImmortal_sale() {
    return immortal_sale;
  }

  public void setImmortal_sale(int immortal_sale) {
    this.immortal_sale = immortal_sale;
  }

  public int getImmortal_supplier() {
    return immortal_supplier;
  }

  public void setImmortal_supplier(int immortal_supplier) {
    this.immortal_supplier = immortal_supplier;
  }
}
