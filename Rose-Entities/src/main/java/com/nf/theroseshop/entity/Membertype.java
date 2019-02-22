package com.nf.theroseshop.entity;


import java.util.List;

public class Membertype {

  private long memberTypeId;
  private String memberTypeName;
  private double memberTypePrice;
  private String memberTypeDiscount;
  public long getMemberTypeId() {
    return memberTypeId;
  }

  public void setMemberTypeId(long memberTypeId) {
    this.memberTypeId = memberTypeId;
  }


  public String getMemberTypeName() {
    return memberTypeName;
  }

  public void setMemberTypeName(String memberTypeName) {
    this.memberTypeName = memberTypeName;
  }


  public double getMemberTypePrice() {
    return memberTypePrice;
  }

  public void setMemberTypePrice(double memberTypePrice) {
    this.memberTypePrice = memberTypePrice;
  }


  public String getMemberTypeDiscount() {
    return memberTypeDiscount;
  }

  public void setMemberTypeDiscount(String memberTypeDiscount) {
    this.memberTypeDiscount = memberTypeDiscount;
  }

  public Membertype() {
  }

  public Membertype(String memberTypeName, double memberTypePrice, String memberTypeDiscount) {
    this.memberTypeName = memberTypeName;
    this.memberTypePrice = memberTypePrice;
    this.memberTypeDiscount = memberTypeDiscount;
  }

  public Membertype(long memberTypeId, String memberTypeName, double memberTypePrice, String memberTypeDiscount) {
    this.memberTypeId = memberTypeId;
    this.memberTypeName = memberTypeName;
    this.memberTypePrice = memberTypePrice;
    this.memberTypeDiscount = memberTypeDiscount;
  }

  @Override
  public String toString() {
    return "Membertype{" +
            "memberTypeId=" + memberTypeId +
            ", memberTypeName='" + memberTypeName + '\'' +
            ", memberTypePrice=" + memberTypePrice +
            ", memberTypeDiscount='" + memberTypeDiscount + '\'' +
            '}';
  }
}
