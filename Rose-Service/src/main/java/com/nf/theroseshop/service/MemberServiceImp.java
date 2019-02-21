package com.nf.theroseshop.service;

import com.nf.theroseshop.dao.MemberDao;
import com.nf.theroseshop.entity.Member;
import com.nf.theroseshop.from.MemberFrom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImp implements MemberService {
    @Autowired
    MemberDao memberDao;

    public int insertMember(Member member) {
        return memberDao.addMember(member);
    }

    public List<MemberFrom> queryByIfAndPage(String userName, int pageNo, int pageSize) {
        pageNo=(pageNo-1)*pageSize;
        return memberDao.selectByIfAndPage(userName,pageNo,pageSize);
    }
}
