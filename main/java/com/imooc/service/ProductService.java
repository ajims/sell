package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService{
        ProductInfo findOne(String productId);

        //查询所有在架商品列表
        List<ProductInfo> findUpAll();

        //查询所有商品列表
        Page<ProductInfo> findAll(Pageable pageable);

        ProductInfo save(ProductInfo productInfo);

        //加减库存
        void increaseStock(List<CartDTO> cartDTOList);

        void decreaseStock(List<CartDTO> cartDTOList);
}
