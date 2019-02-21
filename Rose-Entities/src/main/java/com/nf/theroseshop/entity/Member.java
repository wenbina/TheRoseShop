package com.nf.theroseshop.entity;


import java.sql.Date;
import java.util.List;

public class Member {

  private long memberId;
  private java.sql.Date memberOpenDate;
  private java.sql.Date memberOverdue;
  private long memberStatus;
  private long memberCode;
  private long memberUserid;
  private Membertype membertypeList;
  private Usertable usertableList;

  public long getMemberId() {
    return memberId;
  }

  public void setMemberId(long memberId) {
    this.memberId = memberId;
  }


  public java.sql.Date getMemberOpenDate() {
    return memberOpenDate;
  }

  public void setMemberOpenDate(java.sql.Date memberOpenDate) {
    this.memberOpenDate = memberOpenDate;
  }


  public java.sql.Date getMemberOverdue() {
    return memberOverdue;
  }

  public void setMemberOverdue(java.sql.Date memberOverdue) {
    this.memberOverdue = memberOverdue;
  }


  public long getMemberStatus() {
    return memberStatus;
  }

  public void setMemberStatus(long memberStatus) {
    this.memberStatus = memberStatus;
  }


  public long getMemberCode() {
    return memberCode;
  }

  public void setMemberCode(long memberCode) {
    this.memberCode = memberCode;
  }


  public long getMemberUserid() {
    return memberUserid;
  }

  public void setMemberUserid(long memberUserid) {
    this.memberUserid = memberUserid;
  }

  public Membertype getMembertypeList() {
    return membertypeList;
  }

  public void setMembertypeList(Membertype membertypeList) {
    this.membertypeList = membertypeList;
  }

  public Usertable getUsertableList() {
    return usertableList;
  }
  public void setUsertableList(Usertable usertableList) {
    this.usertableList = usertableList;
  }
  public Member() {
  }

  public Member(Date memberOpenDate, Date memberOverdue, long memberStatus, long memberCode, long memberUserid, Membertype membertypeList, Usertable usertableList) {
    this.memberOpenDate = memberOpenDate;
    this.memberOverdue = memberOverdue;
    this.memberStatus = memberStatus;
    this.memberCode = memberCode;
    this.memberUserid = memberUserid;
    this.membertypeList = membertypeList;
    this.usertableList = usertableList;
  }

  public Member(long memberId, Date memberOpenDate, Date memberOverdue, long memberStatus, long memberCode, long memberUserid,Membertype membertypeList, Usertable usertableList) {
    this.memberId = memberId;
    this.memberOpenDate = memberOpenDate;
    this.memberOverdue = memberOverdue;
    this.memberStatus = memberStatus;
    this.memberCode = memberCode;
    this.memberUserid = memberUserid;
    this.membertypeList = membertypeList;
    this.usertableList = usertableList;
  }

  @Override
  public String toString() {
    return "Member{" +
            "memberId=" + memberId +
            ", memberOpenDate=" + memberOpenDate +
            ", memberOverdue=" + memberOverdue +
            ", memberStatus=" + memberStatus +
            ", memberCode=" + memberCode +
            ", memberUserid=" + memberUserid +
            ", membertypeList=" + membertypeList +
            ", usertableList=" + usertableList +
            '}';
  }
}
