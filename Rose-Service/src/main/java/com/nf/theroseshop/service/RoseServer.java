package com.nf.theroseshop.service;

import com.nf.theroseshop.entity.Rose;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoseServer {
    //鲜花分页查询和模糊查
    List<Rose> getAll(@Param("rose_name") String rose_name, @Param("rose_price") Double rose_price,@Param("rose_stock") Integer rose_stock,@Param("rose_sale") Integer rose_sale, @Param("page") int page, @Param("limit") int limit);
    //添加鲜花
    int insert(Rose rose);
    //修改鲜花
    int updata(Rose rose);
    //单删除鲜花
    int deleteid(int rose_id);
    //多删除鲜花
    int deleteids(List<Integer> rose_ids);
}
