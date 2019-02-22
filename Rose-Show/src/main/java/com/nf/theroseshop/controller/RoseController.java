package com.nf.theroseshop.controller;

import com.nf.theroseshop.common.R;
import com.nf.theroseshop.entity.Rose;
import com.nf.theroseshop.service.imlp.imlpRoseServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/Rose")
public class RoseController {
    @Autowired
    imlpRoseServer roseServer;

    //查看全部的数据
    @RequestMapping("RoseFlowerAllData")
    @ResponseBody
    public R RoseFlowerAllData(Rose rose){
        List<Rose> list=roseServer.flowerAllData(rose);
        return R.ok(list);
    }

    //鲜花分页查询和模糊查
    @RequestMapping("RoseGetAll")
    @ResponseBody
    public R RoseGetAll(String rose_name, Double rose_price, Integer rose_stock, Integer rose_sale,
                        @RequestParam(defaultValue = "1") int page,@RequestParam(defaultValue = "10") int limit){
        List<Rose> list=roseServer.getAll(rose_name,rose_price,rose_stock,rose_sale,((page-1)*limit),limit);
        return R.ok(list);
    }

    //添加鲜花
    @RequestMapping("RoseInsert")
    @ResponseBody
    public R RoseInsert(Rose rose, HttpServletResponse response) throws IOException {
        /*解决服务端的乱码问题*/
        response.setCharacterEncoding("utf-8");
        int list=roseServer.insert(rose);
        return R.ok(list);
    }

    //修改鲜花
    @RequestMapping("RoseUpdata")
    @ResponseBody
    public R RoseUpdata(Rose rose,HttpServletResponse response) throws IOException {
        /*解决服务端的乱码问题*/
        response.setCharacterEncoding("utf-8");
        int list=roseServer.updata(rose);
        return R.ok(list);
    }

    //单删除鲜花
    @RequestMapping("RoseDeleteid")
    @ResponseBody
    public R RoseDeleteid(int rose_id){
        int list=roseServer.deleteid(rose_id);
        return R.ok(list);
    }

    //多删除鲜花
    @RequestMapping("RoseDeleteids")
    @ResponseBody
    public R RoseDeleteids(List<Integer> rose_ids){
        int list= roseServer.deleteids(rose_ids);
        return R.ok(list);
    }
}
