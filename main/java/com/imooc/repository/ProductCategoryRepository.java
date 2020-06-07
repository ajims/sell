package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    //按照类目类型来查找相应的列表
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}