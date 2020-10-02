package com.atguigu.gmall0401.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0401.bean.BaseCatalog1;
import com.atguigu.gmall0401.bean.BaseCatalog2;
import com.atguigu.gmall0401.bean.BaseCatalog3;
import com.atguigu.gmall0401.service.ManageService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


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

}
