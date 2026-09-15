package com.neusoft.tijiancms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.tijiancms.dto.OrdersPageRequestDto;
import com.neusoft.tijiancms.po.Orders;

@Mapper
public interface OrdersMapper {

	//根据查询条件统计预约订单总数（SQL 定义在 OrdersMapper.xml）
	public int getOrdersCount(OrdersPageRequestDto dto);

	//根据查询条件和分页参数查询预约订单列表（SQL 定义在 OrdersMapper.xml）
	public List<Orders> listOrders(OrdersPageRequestDto dto);

	//根据订单编号查询预约订单（SQL 定义在 OrdersMapper.xml）
	public Orders getOrdersById(Integer orderId);
}
