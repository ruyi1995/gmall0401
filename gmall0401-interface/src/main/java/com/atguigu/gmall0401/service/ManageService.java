package com.atguigu.gmall0401.service;

import com.atguigu.gmall0401.bean.*;

import java.util.List;

public interface ManageService {


    //查询一级分类
    public List<BaseCatalog1> getCatalog1();

    //根据一级分类查询二级分类
    public List<BaseCatalog2> getCatalog2(String catalog1Id);

    //根据二级分类查询三级分类
    public List<BaseCatalog3> getCatalog3(String catalog2Id);

    //根据三级分类查询平台属性

    //根据平台属性id查询平台属性的详情
    public List<BaseAttrInfo> getAttrList(String catalog3Id);


    //添加平台属性
    public void saveBaseAttrInfo(BaseAttrInfo baseAttrInfo);
    //删除平台属性

    //根据平台属性id查询平台属性值的详情
    public List<BaseAttrValue> getAttrValueList(String attrId);
    //public List getAttrValueList( String attrId)

    //根据平台属性id查询平台属性值的详情
    public BaseAttrInfo getBaseAttrInfo(String attrId);

    //查询平台属性public List<BaseSaleAttr> baseSaleAttrList()
    public List<BaseSaleAttr> getbaseSaleAttrList();

    //保存spu信息
    public  void saveSpuinfo(SpuInfo spuInfo);

    //根据三级分类查询spu列表
    public  List<SpuInfo> getSpuList(String catalog3Id);

    List<SpuImage> getspuImageList(SpuImage spuImage);

    List<SpuSaleAttr> setSpuSaleAttrList(String spuId);

    /**
     * 保存sku数据
     * @param skuInfo
     */
    void saveSkuinfo(SkuInfo skuInfo);


    /**
     *
     *根据skuid查询skuInfo
     * @param skuId
     * @return
     */
    SkuInfo getSkuInfo(String skuId);

    /**
     * 根据传入的skuinfo查询spu销售属性值
     *
     * @param skuInfo
     * @return
     */
    List<SpuSaleAttr> getSpuSaleAttrListCheckBySku(SkuInfo skuInfo);

    /**
     * 根据spuid查询销售属性值
     * @param spuId
     * @return
     */
    List<SkuSaleAttrValue> getSkuSaleAttrValueListBySpu(String spuId);
}
