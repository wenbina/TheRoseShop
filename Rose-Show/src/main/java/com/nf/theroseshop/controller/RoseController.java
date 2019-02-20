package com.nf.theroseshop.controller;


import com.nf.theroseshop.entity.Rose;
import com.nf.theroseshop.service.Interfaces.RoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Rose")
public class RoseController {
    @Autowired
    RoseService roseService;

    //鲜花条件分页查询 getRosePage
    @RequestMapping("/getRosePage")
    @ResponseBody
    public List<Rose> getRosePage(String rose_name, Double rose_price, Integer curr, Integer limit){
        int page=curr;
        int limitt=limit;
        int pages=(page-1)*limitt;
        return roseService.getRosePage(rose_name,rose_price,pages,limitt);
    }

    //鲜花总页数 getRoseSize
    @RequestMapping("getRoseSize")
    @ResponseBody
    public int getRoseSize(String rose_name, Double rose_price){
        return roseService.getRoseSize(rose_name,rose_price);
    }


    //更新鲜花信息 updataRose
    @RequestMapping("updataRose")
    @ResponseBody
    public int updataRose(String rose_name,String rose_content,Double rose_price,String rose_reason,String rose_composition,String rose_story,String rose_explain,int rose_stock,int rose_sale,String  rose_code,int rose_id){
        return roseService.updataRose(rose_name, rose_content, rose_price,rose_reason, rose_composition, rose_story,  rose_explain,  rose_stock, rose_sale,rose_code,rose_id);
    }

    //删除鲜花信息 deleteRose
    @RequestMapping("deleteRose")
    @ResponseBody
    public int deleteRose(int rose_id){
        int result= roseService.deleteRose(rose_id);
        return  result;
    }

    //增加鲜花  roseAdd
    @RequestMapping("roseAdd")
    @ResponseBody
    public int roseAdd(String rose_code,String rose_name,String rose_content,Double rose_price,String rose_reason,String rose_composition,String rose_story,String rose_explain,int rose_stock,int rose_sale){
        System.out.println(rose_code +"玫瑰花编号");
        return roseService.roseAdd(rose_code,rose_name, rose_content, rose_price,rose_reason, rose_composition, rose_story,  rose_explain,  rose_stock, rose_sale);
    }





}
