package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {
    //卖家端使用的方法
    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();

    //用户端使用的方法
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
