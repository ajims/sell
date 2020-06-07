package com.imooc.dto;

/*
数据传输对象
由于不推介使用@transient注解,所以使用dto来传输数据
如果不使用dto而是传入dao层的orderMaster,
而新添了一个List<OrderDetail> orderDetailList,会导致数据库和dao层的变量不同而报错,
所以新建一个orderDTO文件
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.Utils.serialize.Date2LongSerializer;
import com.imooc.dataobject.OrderDetail;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)   //为了orderDetailList为空时不显示在前端页面上，如果不想显示null但也是有值的话，就为其初始化
public class OrderDTO {

    /** 订单id. */
    private String orderId;

    /** 买家名字. */
    private String buyerName;

    /** 买家手机号. */
    private String buyerPhone;

    /** 买家地址. */
    private String buyerAddress;

    /** 买家微信Openid. */
    private String buyerOpenid;

    /** 订单总金额. */
    private BigDecimal orderAmount;

    /** 订单状态, 默认为0新下单. */
    private Integer orderStatus;

    /** 支付状态, 默认为0未支付. */
    private Integer payStatus;

    /** 创建时间. */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /** 更新时间. */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    //一个订单可能包括多个详情，如订了两个或以上的商品。
    List<OrderDetail> orderDetailList;
}
