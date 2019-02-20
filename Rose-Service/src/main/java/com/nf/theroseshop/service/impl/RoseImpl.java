package com.nf.theroseshop.service.impl;


import com.nf.theroseshop.dao.RoseMapper;
import com.nf.theroseshop.entity.Rose;
import com.nf.theroseshop.service.Interfaces.RoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoseImpl implements RoseService {
    @Autowired
    RoseMapper rosemapper;

    public List<Rose> getRosePage(String rose_name, Double rose_price, int pages, int limitt) {
        return rosemapper.getRosePage( rose_name,rose_price,pages, limitt);
    }

    public int getRoseSize(String rose_name, Double rose_price) {
        return rosemapper.getRoseSize(rose_name,rose_price);
    }

    public int roseAdd(String rose_code, String rose_name, String rose_content, Double rose_price, String rose_reason, String rose_composition, String rose_story, String rose_explain, int rose_stock, int rose_sale) {
        return rosemapper.roseAdd(rose_code,rose_name, rose_content, rose_price,rose_reason, rose_composition, rose_story,  rose_explain,  rose_stock, rose_sale);
    }

    public int deleteRose(int rose_id) {
        return rosemapper.deleteRose(rose_id);
    }

    public int updataRose(String rose_name, String rose_content, Double rose_price, String rose_reason, String rose_composition, String rose_story, String rose_explain, int rose_stock, int rose_sale, String rose_code,int rose_id) {
        return rosemapper.updataRose(rose_name, rose_content, rose_price,rose_reason, rose_composition, rose_story,  rose_explain,  rose_stock, rose_sale,rose_code,rose_id);
    }
}
