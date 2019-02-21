package com.nf.theroseshop.from;


import java.sql.Date;

public class MemberFrom {

    private long memberId;
    private Date memberOpenDate;
    private Date memberOverdue;
    private long memberStatus;
    private long memberCode;
    private long memberUserid;
    private long memberTypeId;
    private String memberTypeName;
    private double memberTypePrice;
    private String memberTypeDiscount;
    private long userId;
    private String userPhone;
    private String userPwd;
    private String userName;
    private String uuserSex;
    private String userBirthday;
    private long userState;
    private String userProvince;//省份
    private String userCity;//城市
    private String userDistrict ;//区
    private String userDetailedAddress ;//详细地址

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public Date getMemberOpenDate() {
        return memberOpenDate;
    }

    public void setMemberOpenDate(Date memberOpenDate) {
        this.memberOpenDate = memberOpenDate;
    }

    public Date getMemberOverdue() {
        return memberOverdue;
    }

    public void setMemberOverdue(Date memberOverdue) {
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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUuserSex() {
        return uuserSex;
    }

    public void setUuserSex(String uuserSex) {
        this.uuserSex = uuserSex;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public long getUserState() {
        return userState;
    }

    public void setUserState(long userState) {
        this.userState = userState;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserDistrict() {
        return userDistrict;
    }

    public void setUserDistrict(String userDistrict) {
        this.userDistrict = userDistrict;
    }

    public String getUserDetailedAddress() {
        return userDetailedAddress;
    }

    public void setUserDetailedAddress(String userDetailedAddress) {
        this.userDetailedAddress = userDetailedAddress;
    }
}
