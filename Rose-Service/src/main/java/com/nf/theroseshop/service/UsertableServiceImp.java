package com.nf.theroseshop.service;

import com.nf.theroseshop.dao.UsertableDao;
import com.nf.theroseshop.entity.Usertable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsertableServiceImp implements UsertableService {
    @Autowired
    UsertableDao usertableDao;
/*用户注册*/
    public int insertUsertable(String userPhone, String userPwd,String userName,String uuserSex) {
        System.out.println("!!!"+userPhone);
        System.out.println("!!!"+userPwd);
        System.out.println("!!!"+uuserSex);
        System.out.println("!!!"+userName);
        return usertableDao.addUsertable(userPhone, userPwd, uuserSex, userName);
    }
/*用户修改*/
    public int editUsertable(Usertable usertable) {
        return usertableDao.updateUsertable(usertable);
    }
/*根据用户编号修改用户状态*/
    public int editByUserState(Usertable usertable) {
        return usertableDao.updateByUserState(usertable);
    }
/*注销用户*/
    public int delUsertable(int userId) {
        return usertableDao.deleteUsertable(userId);
    }
/*查询所有*/
    public List<Usertable> queryAllUsertable() {
        return usertableDao.selectByIfAndPage();
    }
/*用户登录*/
    public Usertable queryAllUsertable(String userPhone) {
       // System.out.println("qwqw"+userPhone);
        return usertableDao.loginUsertable(userPhone);
    }


}
