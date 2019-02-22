package com.nf.theroseshop.entity;



public class Usertable {

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

    public Usertable() {
  }

    public Usertable(String userPhone, String userPwd) {
        this.userPhone = userPhone;
        this.userPwd = userPwd;
    }

    public Usertable(String userPhone, String userPwd, String userName, String uuserSex) {
        this.userPhone = userPhone;
        this.userPwd = userPwd;
        this.userName = userName;
        this.uuserSex = uuserSex;
    }

    public Usertable(String userPhone, String userPwd, String userName, String uuserSex, String userBirthday, String userProvince, String userCity, String userDistrict, String userDetailedAddress) {
        this.userPhone = userPhone;
        this.userPwd = userPwd;
        this.userName = userName;
        this.uuserSex = uuserSex;
        this.userBirthday = userBirthday;
        this.userProvince = userProvince;
        this.userCity = userCity;
        this.userDistrict = userDistrict;
        this.userDetailedAddress = userDetailedAddress;
    }

    public Usertable(String userPhone, String userPwd, String userName, String uuserSex, String userBirthday, long userState, String userProvince, String userCity, String userDistrict, String userDetailedAddress) {
        this.userPhone = userPhone;
        this.userPwd = userPwd;
        this.userName = userName;
        this.uuserSex = uuserSex;
        this.userBirthday = userBirthday;
        this.userState = userState;
        this.userProvince = userProvince;
        this.userCity = userCity;
        this.userDistrict = userDistrict;
        this.userDetailedAddress = userDetailedAddress;
    }

    public Usertable(long userId, String userPhone, String userPwd, String userName, String uuserSex, String userBirthday, long userState, String userProvince, String userCity, String userDistrict, String userDetailedAddress) {
        this.userId = userId;
        this.userPhone = userPhone;
        this.userPwd = userPwd;
        this.userName = userName;
        this.uuserSex = uuserSex;
        this.userBirthday = userBirthday;
        this.userState = userState;
        this.userProvince = userProvince;
        this.userCity = userCity;
        this.userDistrict = userDistrict;
        this.userDetailedAddress = userDetailedAddress;
    }


    @Override
    public String toString() {
        return "Usertable{" +
                "userId=" + userId +
                ", userPhone='" + userPhone + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userName='" + userName + '\'' +
                ", uuserSex='" + uuserSex + '\'' +
                ", userBirthday='" + userBirthday + '\'' +
                ", userState=" + userState +
                ", userProvince='" + userProvince + '\'' +
                ", userCity='" + userCity + '\'' +
                ", userDistrict='" + userDistrict + '\'' +
                ", userDetailedAddress='" + userDetailedAddress + '\'' +
                '}';
    }
}
