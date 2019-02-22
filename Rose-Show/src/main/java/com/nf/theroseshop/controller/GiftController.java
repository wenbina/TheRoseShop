package com.nf.theroseshop.controller;

import com.nf.theroseshop.common.R;
import com.nf.theroseshop.entity.Gift;
import com.nf.theroseshop.service.imlp.imlpGiftServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/Gift")
public class GiftController {
    @Autowired
    imlpGiftServer giftServer;

    //查看全部的数据
    @RequestMapping("GiftFlowerAllData")
    @ResponseBody
    public R GiftFlowerAllData(Gift gift){
        List<Gift> list=giftServer.flowerAllData(gift);
        return R.ok(list);
    }

    //礼物分页查询和模糊查
    @RequestMapping("GiftGetAll")
    @ResponseBody
    public R GiftGetAll(String gift_name, Double gift_price, Integer gift_stock, Integer gift_sale, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit){
        List<Gift> list=giftServer.getAll(gift_name,gift_price,gift_stock,gift_sale,((page-1)*limit),limit);
        return R.ok(list);
    }

    //添加礼物
    @RequestMapping("GiftInsert")
    @ResponseBody
    public R GiftInsert(Gift gift,HttpServletResponse response) throws IOException {
        /*解决服务端的乱码问题*/
        response.setCharacterEncoding("utf-8");
        int list=giftServer.insert(gift);
        return R.ok(list);
    }

    //修改礼物
    @RequestMapping("GiftUpdata")
    @ResponseBody
    public R GiftUpdata(Gift gift,HttpServletResponse response) throws IOException {
        /*解决服务端的乱码问题*/
        response.setCharacterEncoding("utf-8");
        int list=giftServer.updata(gift);
        return R.ok(list);
    }

    //单删除礼物
    @RequestMapping("GiftDeleteid")
    @ResponseBody
    public R GiftDeleteid(int gift_id){
        int list=giftServer.deleteid(gift_id);
        return R.ok(list);
    }

    //多删除礼物
    @RequestMapping("GiftDeleteids")
    @ResponseBody
    public R GiftDeleteids(List<Integer> gift_ids){
        int list=giftServer.deleteids(gift_ids);
        return R.ok(list);
    }
}
