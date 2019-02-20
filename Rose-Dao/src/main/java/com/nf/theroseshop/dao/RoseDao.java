package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Fragrant;
import com.nf.theroseshop.entity.Rose;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoseDao {
    //香薰分页查询和模糊查
    List<Rose> getAll(@Param("rose_name") String rose_name, @Param("rose_price") Double rose_price, @Param("page") int page, @Param("limit") int limit);
    //添加香薰
    int insert(Rose rose);
    //修改香薰
    int updata(Rose rose);
    //单删除香薰
    int deleteid(int rose_id);
    //多删除香薰
    int deleteids(@Param("ids") List<Integer> rose_ids);
}
