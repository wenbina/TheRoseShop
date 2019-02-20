package com.nf.theroseshop.service.impl;

import com.nf.theroseshop.dao.GoodsPutDao;
import com.nf.theroseshop.entity.Goodsput;
import com.nf.theroseshop.entity.Goodsputdata;
import com.nf.theroseshop.service.GoodsPutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GoodsPutServiceimpl implements GoodsPutService {
    @Autowired
    GoodsPutDao dao;

    @Override
    public List<Goodsput> selectGoodsPut(Map<String,Object> objectMap) {//
        return dao.selectGoodsPut(objectMap);//
    }

    @Override
    public List<Goodsputdata> selectGoodsPutData(int id) {//int id, String goodsCode, String goodsName, int goodsOfcode, int page, int limit
        return dao.selectGoodsPutData(id);//id, goodsCode, goodsName, goodsOfcode, page, limit
    }
}
