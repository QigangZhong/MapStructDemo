package com.qigang;

import com.qigang.mappers.OrderMapper;
import com.qigang.model.Order;
import com.qigang.model.OrderDto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        OrderDto order=new OrderDto();
        order.setOutorderid("jd001");
        order.setSosource(1);
        order.setStatus(1);
        order.setDeliverystatus(1);
        order.setInvoicestatus(1);
        order.setPaystatus(1);
        order.setPaytime(new Date());
        order.setBuyerid("001");
        order.setOrderdate(new Date());
        order.setDeliverydate(new Date());
        order.setShiptype(1);
        order.setShipprice(BigDecimal.ONE);
        order.setPaytype(1);
        order.setSoamt(BigDecimal.ONE);
        order.setDiscountamt(BigDecimal.ONE);
        order.setCouponamt(BigDecimal.ONE);
        order.setPointamt(BigDecimal.ONE);
        order.setCashpayamt(BigDecimal.ONE);
        order.setReceivename("zhangsan");
        order.setReceivephone("13057271932");
        order.setReceivemobile("020798465");
        order.setReceiveaddress("大众大厦");
        order.setFreightusersysno(1);

        Order order1 = OrderMapper.INSTANCE.dtoToModel(order);

        System.out.println(order1.getReceiveaddress());

        System.out.println("ok");
    }
}
