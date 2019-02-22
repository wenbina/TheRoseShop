package com.nf.theroseshop.controller;

import com.nf.theroseshop.common.R;
import com.nf.theroseshop.service.OrderTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/orderApi")
public class OrderTableContrcoller {
    @Autowired
    OrderTableService service;
    @ResponseBody
    @RequestMapping(value = "/selectOrderTableCount")
    public int selectOrderCount(){
        return service.selectOrderCount();
    }
    @ResponseBody
    @RequestMapping(value = "/selectOrder")
    public R selectOrder(){
        return R.ok(service.selectOrder());
    }
    @ResponseBody
    @RequestMapping(value = "/selectOrderGoodsCount")
    public int selectOrderGoodsCount(){
        return service.selectOrderGoodsCount();
    }
    @ResponseBody
    @RequestMapping(value = "/selectOrderGoods")
    public R selectOrderGoods(Integer orderTableId){
        return R.ok(service.selectOrderGoods(orderTableId));
    }
}
