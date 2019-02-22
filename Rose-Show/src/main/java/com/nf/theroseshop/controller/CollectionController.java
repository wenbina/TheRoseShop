package com.nf.theroseshop.controller;

import com.nf.theroseshop.common.R;
import com.nf.theroseshop.entity.Collectiones;
import com.nf.theroseshop.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/collections")
public class CollectionController {
    @Autowired
    CollectionService collectionService;
    //商品收藏
   @RequestMapping("/insertCollection")
    @ResponseBody
    public R insertCollection(Collectiones collectiones){
       return R.ok(collectionService.insertCollection(collectiones));
   }
   /*取消收藏*/
    @RequestMapping("/delCollection")
    @ResponseBody
    public R delCollection(String CollectionCode){
       return R.ok(collectionService.delCollection(CollectionCode));
    }
    /*根据用户编号查询收藏的商品*/
    @RequestMapping("/queryByUserId")
    @ResponseBody
    public R queryByUserId(@RequestParam(defaultValue ="1") int pageNo,
                           @RequestParam(defaultValue ="5") int pageSize,int userId){
       return R.ok(collectionService.queryByUserId(userId,pageNo,pageSize));
    }
}
