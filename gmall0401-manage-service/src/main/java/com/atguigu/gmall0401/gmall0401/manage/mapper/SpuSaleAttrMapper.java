package com.atguigu.gmall0401.gmall0401.manage.mapper;

import com.atguigu.gmall0401.bean.SpuSaleAttr;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SpuSaleAttrMapper extends Mapper<SpuSaleAttr>{

    //根据spuid查询销售属性
    //需要使用mapper.xml
    //SpuSaleAttrMapper.xml 写在resources目录下
    List<SpuSaleAttr> selectSpuSaleAttrList(String spuId);

     List<SpuSaleAttr>  selectSpuSaleAttrListCheckBySku(String skuId,String spuId);
}
