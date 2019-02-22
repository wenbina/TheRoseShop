package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Member;
import com.nf.theroseshop.from.MemberFrom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberDao {
    int addMember(Member member);
    List<MemberFrom> selectByIfAndPage(@Param("userName") String userName, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
}
