package com.nf.theroseshop.service;

import com.nf.theroseshop.entity.Goodsput;
import com.nf.theroseshop.entity.Goodsputdata;

import java.util.List;
import java.util.Map;

public interface GoodsPutService {
    List<Goodsput> selectGoodsPut(Map<String,Object> objectMap);//
    List<Goodsputdata> selectGoodsPutData( int id);//int id,String goodsCode,String goodsName,int goodsOfcode,int page,int limit
}
