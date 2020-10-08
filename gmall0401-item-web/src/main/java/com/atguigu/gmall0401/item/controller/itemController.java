package com.atguigu.gmall0401.item.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.atguigu.gmall0401.bean.SkuImage;
import com.atguigu.gmall0401.bean.SkuInfo;
import com.atguigu.gmall0401.bean.SkuSaleAttrValue;
import com.atguigu.gmall0401.bean.SpuSaleAttr;
import com.atguigu.gmall0401.service.ManageService;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.stereotype.Controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;


@Controller
public class itemController {

    @Reference
    private ManageService manageService;


    @RequestMapping("{skuId}.html")
    @Transactional
    public String skuInfoPage(@PathVariable(value = "skuId") String skuId, HttpServletRequest servletRequest) {
        SkuInfo skuInfo = manageService.getSkuInfo(skuId);
        servletRequest.setAttribute("skuInfo", skuInfo);

        //查询销售属性值集合
        List<SpuSaleAttr> spuSaleAttrList = manageService.getSpuSaleAttrListCheckBySku(skuInfo);
        servletRequest.setAttribute("spuSaleAttrList", spuSaleAttrList);

        //获取销售属性值集合

        List<SkuSaleAttrValue> skuSaleAttrValueList = manageService.getSkuSaleAttrValueListBySpu(skuInfo.getSpuId());
        //遍历集合拼接字符串

        HashMap<String, Object> map = new HashMap<>();
        String key = "";
        for (int i = 0; i < skuSaleAttrValueList.size(); i++) {
            SkuSaleAttrValue skuSaleAttrValue = skuSaleAttrValueList.get(i);
            if (key.length() > 0) {
                key += "|";
            }
            key += skuSaleAttrValue.getSaleAttrValueId();
            if ((i + 1) == skuSaleAttrValueList.size() || !skuSaleAttrValue.getSkuId().equals(skuSaleAttrValueList.get(i + 1).getSkuId())){
                map.put(key, skuSaleAttrValue.getSkuId());
                key = "";
            };



        }

        String valuesSkuJson = JSON.toJSONString(map);
        servletRequest.setAttribute("valuesSkuJson",valuesSkuJson);
        return "item";

    }
}
