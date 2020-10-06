package com.atguigu.gmall0401.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0401.bean.*;
import com.atguigu.gmall0401.service.ManageService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.swing.plaf.SpinnerUI;
import java.util.List;


@RestController
@CrossOrigin
public class ManageController {


    @Reference
    ManageService manageService;

    @PostMapping("getCatalog1")
    public List getCatalog1() {


        return manageService.getCatalog1();

    }

    @PostMapping("getCatalog2")
    public List getCatalog2(String catalog1Id) {


        List<BaseCatalog2> catalog2List = manageService.getCatalog2(catalog1Id);
        return catalog2List;
    }

    @PostMapping("getCatalog3")
    public List getCatalog3(String catalog2Id) {
        List<BaseCatalog3> catalog3list = manageService.getCatalog3(catalog2Id);

        return catalog3list;

    }

    @GetMapping("attrInfoList")
    public List<BaseAttrInfo> attrInfoList(String catalog3Id) {

        List<BaseAttrInfo> attrList = manageService.getAttrList(catalog3Id);
        return attrList;
        //  http://localhost:8082/spuList?catalog3Id=64
    }

    @PostMapping("saveAttrInfo")
    public String savAttrInfo(@RequestBody BaseAttrInfo baseAttrInfo) {
        // Request URL: http://localhost:8082/attrInfoList?catalog3Id=61

        manageService.saveBaseAttrInfo(baseAttrInfo);
        return "success";
    }

    @PostMapping("getAttrValueList")
    public List getAttrValueList(String attrId) {
        // http://localhost:8082/getAttrValueList?attrId=23
        BaseAttrInfo manageServiceBaseAttrInfo = manageService.getBaseAttrInfo(attrId);
        List<BaseAttrValue> attrValueList = manageServiceBaseAttrInfo.getAttrValueList();
        return attrValueList;
    }


    //增加商品的保存POST http://localhost:8082/saveSpuInfo net::ERR_FAILED
    @PostMapping("saveSpuInfo")
    public String saveSpuInfo(@RequestBody SpuInfo spuInfo) {
        manageService.saveSpuinfo(spuInfo);

        return "sucess";
    }

    //加载基本销售属性值
    @PostMapping("baseSaleAttrList")
    public List<BaseSaleAttr> baseSaleAttrList() {


        return manageService.getbaseSaleAttrList();
    }

    //查询spulist  catalog3Id=2
    //http://localhost:8082/spuList?catalog3Id=2 net::ERR_FAILED
    @GetMapping("spuList")
    public List<SpuInfo> getspuList(String catalog3Id) {


        return manageService.getSpuList(catalog3Id);
    }

    //http://localhost:8082/spuImageList?spuId=5

}
