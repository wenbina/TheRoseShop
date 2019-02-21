package com.nf.theroseshop.service;

import com.nf.theroseshop.dao.CollectionDao;
import com.nf.theroseshop.entity.Collectiones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CollectionServiceImp implements CollectionService {
    @Autowired
    CollectionDao collectionDao;
    /*收藏商品*/
    public int insertCollection(Collectiones collectiones) {
        return  collectionDao.addCollection(collectiones);
    }
    /*取消收藏*/
    public int delCollection(String CollectionCode) {
        return collectionDao.deleteCollection(CollectionCode);
    }
    /*根据用户编号查询收藏商品*/
    public List<Collectiones> queryByUserId(int userId, int pageNo, int pageSize) {
        pageNo=(pageNo-1)*pageSize;
        return collectionDao.selectCollection(userId,pageNo,pageSize);
    }


}
