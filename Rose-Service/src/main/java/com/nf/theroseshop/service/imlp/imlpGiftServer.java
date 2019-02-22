package com.nf.theroseshop.service.imlp;

import com.nf.theroseshop.dao.GiftDao;
import com.nf.theroseshop.entity.Gift;
import com.nf.theroseshop.service.GiftServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class imlpGiftServer implements GiftServer {
    @Autowired
    GiftDao giftDao;

    public List<Gift> flowerAllData(Gift gift) {
        return giftDao.flowerAllData(gift);
    }

    public List<Gift> getAll(String gift_name, Double gift_price,Integer gift_stock, Integer gift_sale,int page, int limit) {
        return giftDao.getAll(gift_name,gift_price,gift_stock,gift_sale,page,limit);
    }

    public int insert(Gift gift) {
        Gift gift1=new Gift();
        gift1.setGift_code(gift.getGift_code());
        gift1.setGift_type(gift.getGift_type());
        gift1.setGift_name(gift.getGift_name());
        gift1.setGift_content(gift.getGift_content());
        gift1.setGift_price(gift.getGift_price());
        gift1.setGift_reason(gift.getGift_reason());
        gift1.setGift_composition(gift.getGift_composition());
        gift1.setGift_story(gift.getGift_story());
        gift1.setGift_explain(gift.getGift_explain());
        gift1.setGift_stock(gift.getGift_stock());
        gift1.setGift_sale(gift.getGift_sale());
        gift1.setGift_supplier(gift.getGift_supplier());
        gift1.setGift_smallPirture(gift.getGift_smallPirture());
        return giftDao.insert(gift1);
    }

    public int updata(Gift gift) {
        Gift gift1=new Gift();
        gift1.setGift_id(gift.getGift_id());
        gift1.setGift_code(gift.getGift_code());
        gift1.setGift_type(gift.getGift_type());
        gift1.setGift_name(gift.getGift_name());
        gift1.setGift_content(gift.getGift_content());
        gift1.setGift_price(gift.getGift_price());
        gift1.setGift_reason(gift.getGift_reason());
        gift1.setGift_composition(gift.getGift_composition());
        gift1.setGift_story(gift.getGift_story());
        gift1.setGift_explain(gift.getGift_explain());
        gift1.setGift_stock(gift.getGift_stock());
        gift1.setGift_sale(gift.getGift_sale());
        gift1.setGift_supplier(gift.getGift_supplier());
        gift1.setGift_smallPirture(gift.getGift_smallPirture());
        return giftDao.updata(gift1);
    }

    public int deleteid(int gift_id) {
        return giftDao.deleteid(gift_id);
    }

    public int deleteids(List<Integer> gift_ids) {
        return giftDao.deleteids(gift_ids);
    }
}
