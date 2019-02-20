package com.nf.theroseshop.controller;

import com.nf.theroseshop.common.R;
import com.nf.theroseshop.entity.Fragrant;
import com.nf.theroseshop.service.imlp.imlpFragrantServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/Fragrant")
public class FragrantController {
    @Autowired
    imlpFragrantServer fragrantServer;

    //香薰分页查询和模糊查
    @RequestMapping("FragrantGetAll")
    @ResponseBody
    public R FragrantGetAll(String Fragrant_name,Double Fragrant_price,int page,int limit){
        List<Fragrant> list=fragrantServer.getAll(Fragrant_name,Fragrant_price,((page-1)*limit),limit);
        return R.ok(list);
    }

    //添加香薰
    @RequestMapping("FragrantInsert")
    @ResponseBody
    public R FragrantInsert(Fragrant fragrant, HttpServletResponse response) throws IOException {
        /*解决服务端的乱码问题*/
        response.setCharacterEncoding("utf-8");
        int list=fragrantServer.insert(fragrant);
        return R.ok(list);
    }

    //修改香薰
    @RequestMapping("FragrantUpdata")
    @ResponseBody
    public R FragrantUpdata(Fragrant fragrant, HttpServletResponse response) throws IOException {
        /*解决服务端的乱码问题*/
        response.setCharacterEncoding("utf-8");
        int list=fragrantServer.updata(fragrant);
        return R.ok(list);
    }

    //单删除香薰
    @RequestMapping("FragrantDeleteid")
    @ResponseBody
    public R FragrantDeleteid(int Fragrant_id){
        int list=fragrantServer.deleteid(Fragrant_id);
        return R.ok(list);
    }

    //多删除香薰
    @RequestMapping("FragrantDeleteids")
    @ResponseBody
    public R FragrantDeleteids(List<Integer> Fragrant_ids){
        int list=fragrantServer.deleteids(Fragrant_ids);
        return R.ok(list);
    }
}
