package com.nf.theroseshop.controller;

import com.nf.theroseshop.common.R;
import com.nf.theroseshop.entity.Usertable;
import com.nf.theroseshop.service.UsertableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/usertable")
public class UsertableController {
    @Autowired
    UsertableService usertableService;
    /*用户注册*/
        @RequestMapping("/insertUsertable")
    @ResponseBody
    public R insertUsertable(Usertable usertable){
        return R.ok(usertableService.insertUsertable(usertable));
    }
    /*登录*/
    @RequestMapping("/queryAllUsertable")
    @ResponseBody
    public R queryAllUsertable(String userPhone, String userPwd, HttpSession session){
        Usertable usertable = usertableService.selectUsertable(userPhone);
        if (usertable != null){

            if (usertable.getUserPwd() != null && usertable.getUserPwd().equals(userPwd)) {
                session.setAttribute("usertable",usertable);
                return R.ok();
            } else {
                return R.error("密码不正确，请检查后重试！");
            }
        } else {
            return R.error("账号未注册，请先注册！");
        }
    }
    @RequestMapping("/getUserSession")
    @ResponseBody
    public R getUserSession(HttpServletRequest request) {
        Usertable usertable = (Usertable) request.getSession().getAttribute("usertable");
        return R.ok(usertable);
    }
    /*用户修改*/
    @RequestMapping("/editUsertable")
    @ResponseBody
    public R editUsertable(Usertable usertable){
        return R.ok(usertableService.editUsertable(usertable));
    }
    /*修改用户状态*/
    @RequestMapping("/editByUserState")
    @ResponseBody
    public R editByUserState(Usertable usertable){
        return R.ok(usertableService.editByUserState(usertable));
    }
    /*用户注销*/
    @RequestMapping("/delUsertable")
    @ResponseBody
    public R delUsertable(int userId){
        return R.ok(usertableService.delUsertable(userId));
    }

}
