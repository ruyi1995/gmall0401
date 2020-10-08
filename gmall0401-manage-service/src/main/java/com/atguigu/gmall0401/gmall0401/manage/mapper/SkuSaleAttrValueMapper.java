package com.atguigu.gmall0401.gmall0401.manage.mapper;

import com.atguigu.gmall0401.bean.SkuSaleAttrValue;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SkuSaleAttrValueMapper extends Mapper<SkuSaleAttrValue> {


      List<SkuSaleAttrValue> selectSkuSaleAttrValueListBySpu( String spuId);
}
