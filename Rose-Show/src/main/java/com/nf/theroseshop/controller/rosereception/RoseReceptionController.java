package com.nf.theroseshop.controller.rosereception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reception")
public class RoseReceptionController {

    //访问前台首页
    @RequestMapping("/index")
    public String index(){
        return "rosereception/index";
    }

    //访问前台登录页面
    @RequestMapping("/brutalism_login")
    public String brutalism_login(){
        return "rosereception/brutalism_login";
    }

    //访问前台注册页面
    @RequestMapping("/brutalism_register")
    public String brutalism_register(){
        return "rosereception/brutalism_register";
    }

    //访问前台基本信息页面
    @RequestMapping("/bastRose_info")
    public String bastRose_info(){
        return "rosereception/bastRose_info";
    }

    //访问前台详细信息页面
    @RequestMapping("/detailed")
    public String detailed(){
        return "rosereception/detailed";
    }

    //访问前台商品列表页面
    @RequestMapping("/floriculture")
    public String floriculture(){
        return "rosereception/floriculture";
    }

    //访问前台购物车页面
    @RequestMapping("/shopcart")
    public String shopcart(){
        return "rosereception/ShoppingCart";
    }

    //访问前台概览页面
    @RequestMapping("/overview")
    public String brutalism_overview(){
        return "rosereception/brutalism_overview";
    }

    //访问前台会员中心页面
    @RequestMapping("/memberCenter")
    public String memberCenter(){
        return "rosereception/memberCenter";
    }

    //访问前台配送地址页面
    @RequestMapping("/shippingAddress")
    public String shippingAddress(){
        return "rosereception/shippingAddress";
    }

    //访问前台用户收藏页面
    @RequestMapping("/myLike")
    public String myLike(){
        return "rosereception/user_like";
    }

    //访问前台用户订单页面
    @RequestMapping("/myOrder")
    public String myOrder(){
        return "rosereception/userOrder";
    }

    //访问前台会员说明页面
    @RequestMapping("/memberType")
    public String memberType(){
        return "rosereception/MemberType";
    }

    //访问前台香薰页面
    @RequestMapping("/fragrantShow")
    public String fragrantShow(){
        return "rosereception/fragrantShow";
    }

    //访问前台礼物页面
    @RequestMapping("/giftShow")
    public String giftShow(){
        return "rosereception/giftShow";
    }
}
