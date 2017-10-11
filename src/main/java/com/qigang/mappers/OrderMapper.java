package com.qigang.mappers;

import com.qigang.model.Order;
import com.qigang.model.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE= Mappers.getMapper(OrderMapper.class);

    Order dtoToModel(OrderDto dto);
    OrderDto modelToDto(Order order);
}
