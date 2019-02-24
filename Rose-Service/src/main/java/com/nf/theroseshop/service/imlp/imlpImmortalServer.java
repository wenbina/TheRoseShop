package com.nf.theroseshop.service.imlp;

import com.nf.theroseshop.dao.ImmortalDao;
import com.nf.theroseshop.entity.Immortal;
import com.nf.theroseshop.service.ImmortalServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class imlpImmortalServer implements ImmortalServer {
    @Autowired
    ImmortalDao immortalDao;

    public List<Immortal> getAll(String immortal_name, Double immortal_price,Integer immortal_stock,Integer immortal_sale,int page, int limit) {
        return immortalDao.getAll(immortal_name,immortal_price,immortal_stock,immortal_sale,page,limit);
    }

    public List<Immortal> flowerAllData(Immortal immortal) {
        return immortalDao.flowerAllData(immortal);
    }

    public int insert(Immortal immortal) {
        Immortal immortal1=new Immortal();
        immortal1.setImmortal_code(immortal.getImmortal_code());
        immortal1.setImmortal_name(immortal.getImmortal_name());
        immortal1.setImmortal_content(immortal.getImmortal_content());
        immortal1.setImmortal_price(immortal.getImmortal_price());
        immortal1.setImmortal_reason(immortal.getImmortal_reason());
        immortal1.setImmortal_composition(immortal.getImmortal_composition());
        immortal1.setImmortal_story(immortal.getImmortal_story());
        immortal1.setImmortal_explain(immortal.getImmortal_explain());
        immortal1.setImmortal_stock(immortal.getImmortal_stock());
        immortal1.setImmortal_sale(immortal.getImmortal_sale());
        immortal1.setImmortal_supplier(immortal.getImmortal_supplier());
        immortal1.setImmortal_smallPirture(immortal.getImmortal_smallPirture());
        return immortalDao.insert(immortal1);
    }

    public int updata(Immortal immortal) {
        Immortal immortal1=new Immortal();
        immortal1.setImmortal_id(immortal.getImmortal_id());
        immortal1.setImmortal_code(immortal.getImmortal_code());
        immortal1.setImmortal_name(immortal.getImmortal_name());
        immortal1.setImmortal_content(immortal.getImmortal_content());
        immortal1.setImmortal_price(immortal.getImmortal_price());
        immortal1.setImmortal_reason(immortal.getImmortal_reason());
        immortal1.setImmortal_composition(immortal.getImmortal_composition());
        immortal1.setImmortal_story(immortal.getImmortal_story());
        immortal1.setImmortal_explain(immortal.getImmortal_explain());
        immortal1.setImmortal_stock(immortal.getImmortal_stock());
        immortal1.setImmortal_sale(immortal.getImmortal_sale());
        immortal1.setImmortal_supplier(immortal.getImmortal_supplier());
        immortal1.setImmortal_smallPirture(immortal.getImmortal_smallPirture());
        return immortalDao.updata(immortal1);
    }

    public int deleteid(int immortal_id) {
        return immortalDao.deleteid(immortal_id);
    }

    public int deleteids(List<Integer> ids) {
        return immortalDao.deleteids(ids);
    }
}
