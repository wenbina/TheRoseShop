package com.nf.theroseshop.entity;


public class Gift {

  private int gift_id;
  private String gift_code;
  private int gift_type;
  private String gift_name;
  private String gift_content;
  private double gift_price;
  private String gift_reason;
  private String gift_composition;
  private String gift_story;
  private String gift_explain;
  private int gift_stock;
  private int gift_sale;
  private int gift_supplier;
  private String gift_smallPirture;

  public Gift() {
  }

  public Gift(int gift_id, String gift_code, int gift_type, String gift_name, String gift_content, double gift_price, String gift_reason, String gift_composition, String gift_story, String gift_explain, int gift_stock, int gift_sale, int gift_supplier, String gift_smallPirture) {
    this.gift_id = gift_id;
    this.gift_code = gift_code;
    this.gift_type = gift_type;
    this.gift_name = gift_name;
    this.gift_content = gift_content;
    this.gift_price = gift_price;
    this.gift_reason = gift_reason;
    this.gift_composition = gift_composition;
    this.gift_story = gift_story;
    this.gift_explain = gift_explain;
    this.gift_stock = gift_stock;
    this.gift_sale = gift_sale;
    this.gift_supplier = gift_supplier;
    this.gift_smallPirture = gift_smallPirture;
  }

  @Override
  public String toString() {
    return "Gift{" +
            "gift_id=" + gift_id +
            ", gift_code='" + gift_code + '\'' +
            ", gift_type=" + gift_type +
            ", gift_name='" + gift_name + '\'' +
            ", gift_content='" + gift_content + '\'' +
            ", gift_price=" + gift_price +
            ", gift_reason='" + gift_reason + '\'' +
            ", gift_composition='" + gift_composition + '\'' +
            ", gift_story='" + gift_story + '\'' +
            ", gift_explain='" + gift_explain + '\'' +
            ", gift_stock=" + gift_stock +
            ", gift_sale=" + gift_sale +
            ", gift_supplier=" + gift_supplier +
            ", gift_smallPirture='" + gift_smallPirture + '\'' +
            '}';
  }

  public int getGift_id() {
    return gift_id;
  }

  public void setGift_id(int gift_id) {
    this.gift_id = gift_id;
  }

  public String getGift_code() {
    return gift_code;
  }

  public void setGift_code(String gift_code) {
    this.gift_code = gift_code;
  }

  public int getGift_type() {
    return gift_type;
  }

  public void setGift_type(int gift_type) {
    this.gift_type = gift_type;
  }

  public String getGift_name() {
    return gift_name;
  }

  public void setGift_name(String gift_name) {
    this.gift_name = gift_name;
  }

  public String getGift_content() {
    return gift_content;
  }

  public void setGift_content(String gift_content) {
    this.gift_content = gift_content;
  }

  public double getGift_price() {
    return gift_price;
  }

  public void setGift_price(double gift_price) {
    this.gift_price = gift_price;
  }

  public String getGift_reason() {
    return gift_reason;
  }

  public void setGift_reason(String gift_reason) {
    this.gift_reason = gift_reason;
  }

  public String getGift_composition() {
    return gift_composition;
  }

  public void setGift_composition(String gift_composition) {
    this.gift_composition = gift_composition;
  }

  public String getGift_story() {
    return gift_story;
  }

  public void setGift_story(String gift_story) {
    this.gift_story = gift_story;
  }

  public String getGift_explain() {
    return gift_explain;
  }

  public void setGift_explain(String gift_explain) {
    this.gift_explain = gift_explain;
  }

  public int getGift_stock() {
    return gift_stock;
  }

  public void setGift_stock(int gift_stock) {
    this.gift_stock = gift_stock;
  }

  public int getGift_sale() {
    return gift_sale;
  }

  public void setGift_sale(int gift_sale) {
    this.gift_sale = gift_sale;
  }

  public int getGift_supplier() {
    return gift_supplier;
  }

  public void setGift_supplier(int gift_supplier) {
    this.gift_supplier = gift_supplier;
  }

  public String getGift_smallPirture() {
    return gift_smallPirture;
  }

  public void setGift_smallPirture(String gift_smallPirture) {
    this.gift_smallPirture = gift_smallPirture;
  }
}
