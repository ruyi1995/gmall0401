package com.atguigu.gmall0401.gmall0401.manage.mapper;

import com.atguigu.gmall0401.bean.BaseAttrInfo;
import com.atguigu.gmall0401.bean.BaseAttrValue;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BaseAttrInfoMapper  extends Mapper<BaseAttrInfo>{

   // baseAttrInfoMapper.BaseAttrInfoMapper(catalog3Id);

    /**
     * 根据三级平台id查询平台集合属性
     * @param catalog3Id
     * @return
     */
    public List<BaseAttrInfo> getBaseAttrInfoListByCatalog3Id(String catalog3Id);
}
