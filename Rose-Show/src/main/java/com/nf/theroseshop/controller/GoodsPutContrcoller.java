package com.nf.theroseshop.controller;

import com.nf.theroseshop.common.R;
import com.nf.theroseshop.entity.Goodsput;
import com.nf.theroseshop.service.GoodsPutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/goodsputApi")
public class GoodsPutContrcoller {
    @Autowired
    GoodsPutService service;

    @ResponseBody
    @RequestMapping(value = "/getAllgoodsput")
    public List<Goodsput> selectGoodsPut(@RequestBody List<Object> list){
        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("id", list.get(0).toString());
        objectMap.put("code", list.get(1).toString());
        objectMap.put("date", list.get(2).toString());
        objectMap.put("operator", list.get(3).toString());
        objectMap.put("page", 0);
        objectMap.put("limit", 3);
        System.out.println(objectMap);
        return service.selectGoodsPut(objectMap);
    }

    @RequestMapping("/getAllgoodsputdata")
    @ResponseBody
    public R selectGoodsPutData(Integer id){
        return R.ok(service.selectGoodsPutData(id));
    }
}
