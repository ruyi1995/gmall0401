package com.atguigu.gmall0401.item.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0401.bean.SkuInfo;
import com.atguigu.gmall0401.service.ManageService;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class itemController {

    @Reference
    private  ManageService manageService;

    int i=1;
    @RequestMapping("{skuId}.html")
    public String skuInfoPage(@PathVariable(value = "skuId") String skuId , HttpServletRequest servletRequest){
        SkuInfo skuInfo = manageService.getSkuInfo(skuId);
        servletRequest.setAttribute("skuInfo",skuInfo);
        i=i+1;
        System.out.println(i);
        return "item";
    }
}
