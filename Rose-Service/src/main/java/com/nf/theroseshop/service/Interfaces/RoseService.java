package com.nf.theroseshop.service.Interfaces;

import com.nf.theroseshop.entity.Rose;

import java.util.List;

public interface RoseService {
//=====================================================================================    鲜花

    List<Rose> getRosePage(String rose_name, Double rose_price, int pages, int limitt);
    //主题查询条件
    int getRoseSize(String rose_name, Double rose_price);
    //鲜花总条数
    int  roseAdd(String rose_code,String rose_name,String rose_content,Double rose_price,String rose_reason,String rose_composition,String rose_story,String rose_explain,int rose_stock,int rose_sale);
    //添加鲜花
    int deleteRose(int rose_id);
    //删除鲜花
    int updataRose(String rose_name,String rose_content,Double rose_price,String rose_reason,String rose_composition,String rose_story,String rose_explain,int rose_stock,int rose_sale,String  rose_code,int rose_id);
    //修改鲜花







}
