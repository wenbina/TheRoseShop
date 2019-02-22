package com.nf.theroseshop.service;

import com.nf.theroseshop.entity.Usertable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsertableService {
    //用户注册
    int insertUsertable(String userPhone, String userPwd,String userName,String uuserSex);
    //用户修改
    int editUsertable(Usertable usertable);
    //修改用户状态
    int editByUserState(Usertable usertable);
    //注销用户
    int delUsertable(int userId);
    //
    List<Usertable> queryAllUsertable();
    //用户登录
    Usertable queryAllUsertable(@Param("userPhone")String userPhone);

}
