package com.nf.theroseshop.service.imlp;

import com.nf.theroseshop.dao.FragrantDao;
import com.nf.theroseshop.entity.Fragrant;
import com.nf.theroseshop.service.FragrantServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class imlpFragrantServer implements FragrantServer {
    @Autowired
    FragrantDao fragrantDao;

    public List<Fragrant> getAll(String Fragrant_name, Double Fragrant_price,Integer Fragrant_Stock,Integer Fragrant_sale,int page, int limit) {
        return fragrantDao.getAll(Fragrant_name,Fragrant_price,Fragrant_Stock,Fragrant_sale,page,limit);
    }

    public List<Fragrant> flowerAllData(Fragrant fragrant) {
        return fragrantDao.flowerAllData(fragrant);
    }

    public int insert(Fragrant fragrant) {
        Fragrant fragrant1=new Fragrant();
        fragrant1.setFragrant_code(fragrant.getFragrant_code());
        fragrant1.setFragrant_type(fragrant.getFragrant_type());
        fragrant1.setFragrant_name(fragrant.getFragrant_name());
        fragrant1.setFragrant_content(fragrant.getFragrant_content());
        fragrant1.setFragrant_price(fragrant.getFragrant_price());
        fragrant1.setFragrant_reason(fragrant.getFragrant_reason());
        fragrant1.setFragrant_composition(fragrant.getFragrant_composition());
        fragrant1.setFragrant_story(fragrant.getFragrant_story());
        fragrant1.setFragrant_explain(fragrant.getFragrant_explain());
        fragrant1.setFragrant_Stock(fragrant.getFragrant_Stock());
        fragrant1.setFragrant_sale(fragrant.getFragrant_sale());
        fragrant1.setFragrant_supplier(fragrant.getFragrant_supplier());
        fragrant1.setFragrant_smallPirture(fragrant.getFragrant_smallPirture());
        return fragrantDao.insert(fragrant1);
    }

    public int updata(Fragrant fragrant) {
        Fragrant fragrant1=new Fragrant();
        fragrant1.setFragrant_id(fragrant.getFragrant_id());
        fragrant1.setFragrant_code(fragrant.getFragrant_code());
        fragrant1.setFragrant_type(fragrant.getFragrant_type());
        fragrant1.setFragrant_name(fragrant.getFragrant_name());
        fragrant1.setFragrant_content(fragrant.getFragrant_content());
        fragrant1.setFragrant_price(fragrant.getFragrant_price());
        fragrant1.setFragrant_reason(fragrant.getFragrant_reason());
        fragrant1.setFragrant_composition(fragrant.getFragrant_composition());
        fragrant1.setFragrant_story(fragrant.getFragrant_story());
        fragrant1.setFragrant_explain(fragrant.getFragrant_explain());
        fragrant1.setFragrant_Stock(fragrant.getFragrant_Stock());
        fragrant1.setFragrant_sale(fragrant.getFragrant_sale());
        fragrant1.setFragrant_supplier(fragrant.getFragrant_supplier());
        fragrant1.setFragrant_smallPirture(fragrant.getFragrant_smallPirture());
        return fragrantDao.updata(fragrant1);
    }

    public int deleteid(int Fragrant_id) {
        return fragrantDao.deleteid(Fragrant_id);
    }

    public int deleteids(List<Integer> Fragrant_ids) {
        return fragrantDao.deleteids(Fragrant_ids);
    }
}
