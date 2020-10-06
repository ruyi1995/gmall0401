package com.atguigu.gmall0401.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0401.bean.SkuInfo;
import com.atguigu.gmall0401.bean.SpuImage;
import com.atguigu.gmall0401.bean.SpuSaleAttr;
import com.atguigu.gmall0401.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//直接返回jison
@CrossOrigin//跨平台
public class SkuManagerController {

    @Reference
    private ManageService manageService;

    @GetMapping("spuImageList")
    public List<SpuImage> getspuImageList(SpuImage spuImage) {

        return manageService.getspuImageList(spuImage);

    }

    //Request URL: http://localhost:8082/spuSaleAttrList?spuId=5
    //回显示销售属性
    @RequestMapping("spuSaleAttrList")
    public List<SpuSaleAttr> getSpuSaleAttrList(String spuId) {
        List<SpuSaleAttr> spuSaleAttrList = manageService.setSpuSaleAttrList(spuId);
        return spuSaleAttrList;
    }

    @RequestMapping("saveSkuInfo")
    public void saveSkuinfo(@RequestBody SkuInfo skuInfo) {

        if (skuInfo != null){

            manageService.saveSkuinfo(skuInfo);
        }

    }



}
