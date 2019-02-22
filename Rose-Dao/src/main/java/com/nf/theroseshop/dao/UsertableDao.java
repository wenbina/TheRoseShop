package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Usertable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsertableDao {
    //用户注册
    int addUsertable(@Param("userPhone") String userPhone,@Param("userPwd") String userPwd,@Param("userName")String userName,@Param("uuserSex")String uuserSex);
    //用户修改
    int updateUsertable(Usertable usertable);
    //根据用户编号查询
    List<Usertable>  selectByUserId();
    //修改用户状态
    int updateByUserState(Usertable usertable);
    //注销用户
    int deleteUsertable(int userId);
   //List<Usertable> selectByIfAndPage(@Param("name") String name, @Param("pageNo") int pageNo, @Param("pageSize")int pageSize);
   //用户登录
    Usertable loginUsertable (String userPhone);
    //根据用户编号查询
    int SelectByUserId( int userId);
    List<Usertable> selectByIfAndPage();
}
