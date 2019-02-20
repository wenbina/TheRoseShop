package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Rose;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RoseMapper {
    List<Rose> getRosePage(@Param("rose_name") String rose_name,@Param("rose_price") Double rose_price,@Param("pages") int pages, @Param("limitt") int limitt);
    int getRoseSize(@Param("rose_name") String rose_name,@Param("rose_price") Double rose_price);
    int  roseAdd(@Param("rose_code") String rose_code,@Param("rose_name") String rose_name,@Param("rose_content") String rose_content,@Param("rose_price") Double rose_price,@Param("rose_reason") String rose_reason,@Param("rose_composition") String rose_composition,@Param("rose_story") String rose_story,@Param("rose_explain") String rose_explain,@Param("rose_stock") int rose_stock,@Param("rose_sale") int rose_sale);
    int deleteRose(@Param("rose_id") int rose_id);
    int updataRose(@Param("rose_name") String rose_name,@Param("rose_content") String rose_content,@Param("rose_price") Double rose_price,@Param("rose_reason") String rose_reason,@Param("rose_composition") String rose_composition,@Param("rose_story") String rose_story,@Param("rose_explain") String rose_explain,@Param("rose_stock") int rose_stock,@Param("rose_sale") int rose_sale,@Param("rose_code") String  rose_code,@Param("rose_id") int rose_id);
}
