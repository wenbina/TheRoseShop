package com.nf.theroseshop.controller;

import com.nf.theroseshop.common.R;
import com.nf.theroseshop.entity.Immortal;
import com.nf.theroseshop.service.imlp.imlpImmortalServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/Immortal")
public class ImmortalController {
    @Autowired
    imlpImmortalServer immortalServer;

    //查看全部的数据
    @RequestMapping("ImmortalFlowerAllData")
    @ResponseBody
    public R ImmortalFlowerAllData(Immortal immortal){
        List<Immortal> list=immortalServer.flowerAllData(immortal);
        return R.ok(list);
    }

    //永生花分页查询和模糊查
    @RequestMapping("ImmortalGetAll")
    @ResponseBody
    public R ImmortalGetAll(String immortal_name, Double immortal_price, Integer immortal_stock, Integer immortal_sale, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit){
        List<Immortal> list=immortalServer.getAll(immortal_name,immortal_price,immortal_stock,immortal_sale,((page-1)*limit),limit);
        return R.ok(list);
    }

    //添加永生花
    @RequestMapping("ImmortalInsert")
    @ResponseBody
    public R ImmortalInsert(Immortal immortal, HttpServletResponse response) throws IOException {
        /*解决服务端的乱码问题*/
        response.setCharacterEncoding("utf-8");
        int list=immortalServer.insert(immortal);
        return R.ok(list);
    }

    //修改永生花
    @RequestMapping("ImmortalUpdata")
    @ResponseBody
    public R ImmortalUpdata(Immortal immortal,HttpServletResponse response) throws IOException {
        /*解决服务端的乱码问题*/
        response.setCharacterEncoding("utf-8");
        int list=immortalServer.updata(immortal);
        return R.ok(list);
    }

    //单删除永生花
    @RequestMapping("ImmortalDeleteid")
    @ResponseBody
    public R ImmortalDeleteid(int immortal_id){
        int list=immortalServer.deleteid(immortal_id);
        return R.ok(list);
    }

    //多删除永生花
    @RequestMapping("ImmortalDeleteids")
    @ResponseBody
    public R ImmortalDeleteids(List<Integer> immortal_id){
        int list= immortalServer.deleteids(immortal_id);
        return R.ok(list);
    }
}
