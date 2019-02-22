package com.nf.theroseshop.controller;

import com.nf.theroseshop.common.QcloudSms;
import com.nf.theroseshop.common.R;
import com.nf.theroseshop.entity.Usertable;
import com.nf.theroseshop.service.UsertableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/usertable")
public class UsertableController {
    @Autowired
    UsertableService usertableService;
    //取到短信码
    @ResponseBody
    @RequestMapping("/getCode")
    public R getCode(@RequestParam("userPhone") String userPhone, HttpSession session) {
        String code = QcloudSms.getCode();//获取随机验证码
        System.out.print(userPhone);
        try {
            //调用接口方法，发送短信到手机 --phone接收短信的手机号码
            if (QcloudSms.sendCode(userPhone,code) == false) {
                session.setAttribute("codePhone", code);//写入session用于验证
                return R.ok("验证码发送成功！");
            } else {
                session.setAttribute("codePhone", 0);//写入session用于验证
                return R.error("验证码发送失败，请稍后重试！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return R.error("出错了。");
    }

    //短信验证注册
    @ResponseBody
    @RequestMapping("/insertUsertable")
    public R insertUsertable(String userPhone, String userPwd,String userName,String uuserSex , String phoneCode,HttpSession session) {
        String code = (String) session.getAttribute("codePhone");
        System.out.println("code:"+code);
        System.out.println("yz:"+phoneCode);
        if (code.equals(0)) {
            return R.error("验证码发送失败！");
        }
        if (code.equals(phoneCode) == true) {
            int count = usertableService.insertUsertable(userPhone,userPwd,userName,uuserSex);
            System.out.println("yanzheng"+phoneCode);
            System.out.println("phone"+userPhone);
            System.out.println(userPwd);
            System.out.println(uuserSex);
            System.out.println(userName);
            if (count > 0) {
                return R.ok("注册成功");
            } else {
                return R.error("注册失败");
            }
        } else {
            System.out.println("验证码："+phoneCode);
            return R.error("验证码输入错误");
        }
    }

    /*用户注册*/
   /*     @RequestMapping("/insertUsertable")
    @ResponseBody
    public R insertUsertable(String userPhone, String userPwd,String uuserSex,String userName){
        return R.ok(usertableService.insertUsertable(usertable));
    }*/

    /*登录*/
    @RequestMapping("/queryAllUsertable")
    @ResponseBody
    public R queryAllUsertable(String userPhone, String userPwd, HttpSession session){
        Usertable usertable = usertableService.queryAllUsertable(userPhone);

        if (usertable!= null){
            System.out.println("!!"+userPhone);
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
    /*session*/
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
