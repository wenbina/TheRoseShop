package com.nf.theroseshop.service;

import com.nf.theroseshop.entity.Rose;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoseServer {
    //查看全部的数据
    List<Rose> flowerAllData(Rose rose);
    //香薰分页查询和模糊查
    List<Rose> getAll(String rose_name,Double rose_price,Integer rose_stock,Integer rose_sale,int page,int limit);
    //添加香薰
    int insert(Rose rose);
    //修改香薰
    int updata(Rose rose);
    //单删除香薰
    int deleteid(int rose_id);
    //多删除香薰
    int deleteids(List<String> rose_ids);
}
