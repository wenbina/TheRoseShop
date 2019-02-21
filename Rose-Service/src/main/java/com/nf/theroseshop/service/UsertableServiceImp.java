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

    public int insertUsertable(Usertable usertable) {
        return usertableDao.addUsertable(usertable);
    }

    public int editUsertable(Usertable usertable) {
        return usertableDao.updateUsertable(usertable);
    }

    public int editByUserState(Usertable usertable) {
        return usertableDao.updateByUserState(usertable);
    }

    public int delUsertable(int userId) {
        return usertableDao.deleteUsertable(userId);
    }

    public List<Usertable> queryAllUsertable() {
        return usertableDao.selectByIfAndPage();
    }

    public Usertable selectUsertable(String userPhone) {
        return usertableDao.loginUsertable(userPhone);
    }

}
