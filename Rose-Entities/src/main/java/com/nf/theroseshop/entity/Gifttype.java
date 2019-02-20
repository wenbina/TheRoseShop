package com.nf.theroseshop.entity;


public class Gifttype {

  private int giftType_id;
  private String giftType_name;

  public Gifttype() {
  }

  public Gifttype(int giftType_id, String giftType_name) {
    this.giftType_id = giftType_id;
    this.giftType_name = giftType_name;
  }

  @Override
  public String toString() {
    return "Gifttype{" +
            "giftType_id=" + giftType_id +
            ", giftType_name='" + giftType_name + '\'' +
            '}';
  }

  public int getGiftType_id() {
    return giftType_id;
  }

  public void setGiftType_id(int giftType_id) {
    this.giftType_id = giftType_id;
  }

  public String getGiftType_name() {
    return giftType_name;
  }

  public void setGiftType_name(String giftType_name) {
    this.giftType_name = giftType_name;
  }
}
