package com.atguigu.gmall0401.service;

import com.atguigu.gmall0401.bean.BaseCatalog1;
import com.atguigu.gmall0401.bean.BaseCatalog2;
import com.atguigu.gmall0401.bean.BaseCatalog3;

import java.util.List;

public interface ManageService {


    //查询一级分类
    public List<BaseCatalog1> getCatalog1();

    //根据一级分类查询二级分类
    public List<BaseCatalog2> getCatalog2(String catalog1Id);

    //根据二级分类查询三级分类
    public List<BaseCatalog3> getCatalog3(String catalog2Id);


}
