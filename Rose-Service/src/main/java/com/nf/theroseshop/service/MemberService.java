package com.nf.theroseshop.service;

import com.nf.theroseshop.entity.Member;
import com.nf.theroseshop.from.MemberFrom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberService  {
    int insertMember(Member member);
    List<MemberFrom> queryByIfAndPage(@Param("userName")String userName, @Param("pageNo") int pageNo, @Param("pageSize")int pageSize);
}
