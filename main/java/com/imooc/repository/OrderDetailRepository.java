package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    //orderMaster表根据openId这一字段查询orderDetail表相应的详情信息,可能包括数条信息
    //所以使用List来返回
    List<OrderDetail> findByOrderId(String OrderDetail);
}
