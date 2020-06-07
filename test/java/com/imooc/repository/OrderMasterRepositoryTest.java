package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private final String OPENID = "110110";

    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123");
        orderMaster.setBuyerName("ajims");
        orderMaster.setBuyerPhone("987654321987");
        orderMaster.setBuyerAddress("新浪");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(12.5));

        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenId() throws Exception{
        //参数的意思是第0页开始的第一条信息
        PageRequest request = new PageRequest(1,3);
        Page<OrderMaster> result = repository.findByBuyerOpenid(OPENID,request);

        Assert.assertNotEquals(0,result.getTotalElements());
        System.out.println(result.getTotalElements());
    }
}