package com.nf.theroseshop.service.imlp;

import com.nf.theroseshop.dao.RoseDao;
import com.nf.theroseshop.entity.Rose;
import com.nf.theroseshop.service.RoseServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class imlpRoseServer implements RoseServer {
    @Autowired
    RoseDao roseDao;

    public List<Rose> getAll(String rose_name, Double rose_price, int page, int limit) {
        return roseDao.getAll(rose_name,rose_price,page,limit);
    }

    public int insert(Rose rose) {
        Rose rose1=new Rose();
        rose1.setRose_story(rose.getRose_story());
        rose1.setRose_stock(rose.getRose_stock());
        rose1.setRose_reason(rose.getRose_reason());
        rose1.setRose_price(rose.getRose_price());
        rose1.setRose_name(rose.getRose_name());
        rose1.setRose_explain(rose.getRose_explain());
        rose1.setRose_content(rose.getRose_content());
        rose1.setRose_composition(rose.getRose_composition());
        rose1.setRose_code(rose.getRose_code());
        rose1.setImmortal_sale(rose.getImmortal_sale());
        return roseDao.insert(rose1);
    }

    public int updata(Rose rose) {
        Rose rose1=new Rose();
        rose1.setRose_id(rose.getRose_id());
        rose1.setRose_story(rose.getRose_story());
        rose1.setRose_stock(rose.getRose_stock());
        rose1.setRose_reason(rose.getRose_reason());
        rose1.setRose_price(rose.getRose_price());
        rose1.setRose_name(rose.getRose_name());
        rose1.setRose_explain(rose.getRose_explain());
        rose1.setRose_content(rose.getRose_content());
        rose1.setRose_composition(rose.getRose_composition());
        rose1.setRose_code(rose.getRose_code());
        rose1.setImmortal_sale(rose.getImmortal_sale());
        return roseDao.updata(rose1);
    }

    public int deleteid(int rose_id) {
        return roseDao.deleteid(rose_id);
    }

    public int deleteids(List<Integer> rose_ids) {
        return roseDao.deleteids(rose_ids);
    }
}
