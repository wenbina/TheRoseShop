package com.nf.theroseshop.controller;

import com.nf.theroseshop.common.R;
import com.nf.theroseshop.entity.Member;
import com.nf.theroseshop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/members")
public class MemberController {
    @Autowired
    MemberService memberService;
    /*购买会员*/
    @RequestMapping("/insertMember")
    @ResponseBody
    public R insertMember(Member member){
      return R.ok(memberService.insertMember(member));
    }
    /*分页*/
    @RequestMapping("/queryByIfAndPage")
    @ResponseBody
    public R queryByIfAndPage(@RequestParam(defaultValue ="1") int pageNo,
                              @RequestParam(defaultValue ="10") int pageSize,String  userName){
        return R.ok(memberService.queryByIfAndPage(userName,pageNo,pageSize));
    }
}
