package com.nf.theroseshop.dao;

import com.nf.theroseshop.entity.Goodsput;
import com.nf.theroseshop.entity.Goodsputdata;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GoodsPutDao {
    //select
    List<Goodsput> selectGoodsPut(Map<String ,Object> objectMap);
    int selectGoodsPutCount(@Param("GoodsPut_id") int id,@Param("GoodsPut_supplier_code") int code,@Param("GoodsPut_goods_date") String date,@Param("GoodsPut_goods_operator") int operator,@Param("page") int page,@Param("limit") int limit);
    List<Goodsputdata> selectGoodsPutData(@Param("GoodsPutData_goods_ofCode") int id);
    int selectGoodsPutDataCount(@Param("GoodsPutData_id") int id,@Param("GoodsPutData_code") String goodsCode,@Param("GoodsPutData_goods_name") String goodsName,@Param("GoodsPutData_goods_ofCode") int goodsOfcode,@Param("page") int page,@Param("limit") int limit);
    //insert
    int insertGoodsPut(@Param("GoodsPut_supplier_code") int code,@Param("GoodsPut_goods_date") String date,@Param("GoodsPut_goods_operator") int operator);
    int insertGoodsPutData(@Param("GoodsPutData_code") String goodsId,@Param("GoodsPutData_goods_name") String goodsName,@Param("GoodsPutData_goods_count") int goodsCount,@Param("GoodsPutData_goods_price") double goodsPrice,@Param("GoodsPutData_goods_total") double goodsTotal,@Param("GoodsPutData_goods_ofCode") int goodsOfcode);
    //update
    int updateGoodsPut(@Param("GoodsPut_supplier_code") int code,@Param("GoodsPut_goods_date") String date,@Param("GoodsPut_goods_operator") int operator,@Param("GoodsPut_id") int goodsPutId);
    int updateGoodsPutData(@Param("GoodsPutData_code") String goodsId,@Param("GoodsPutData_goods_name") String goodsName,@Param("GoodsPutData_goods_count") int goodsCount,@Param("GoodsPutData_goods_price") double goodsPrice,@Param("GoodsPutData_goods_total") double goodsTotal,@Param("GoodsPutData_goods_ofCode") int goodsOfcode,@Param("GoodsPutData_id") int goodsPutDataId);
    //delete
    int deleteGoodsPut(@Param("GoodsPut_id") int id);
    int deleteGoodsPutAll(List<Integer> ids);
    int deleteGoodsPutData(@Param("GoodsPutData_id") int id);
    int deleteGoodsPutDataAll(List<Integer> ids);
}
