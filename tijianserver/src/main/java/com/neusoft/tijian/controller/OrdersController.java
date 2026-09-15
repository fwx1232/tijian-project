package com.neusoft.tijian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.tijian.dto.CalendarRequestDto;
import com.neusoft.tijian.dto.CalendarResponseDto;
import com.neusoft.tijian.po.Orders;
import com.neusoft.tijian.service.OrdersService;

@RestController
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private OrdersService ordersService;

	//查询是否预约过（凡是有未归档的预约记录的用户，不能再次预约）
	@RequestMapping("/getOrdersByUserId")
	public int getOrdersByUserId(@RequestBody Orders orders) {
		return ordersService.getOrdersByUserId(orders.getUserId());
	}

	//查询30天预约日期中，每一天的已预约人数（预约日历）
	@RequestMapping("/listOrdersAppointmentNumber")
	public List<CalendarResponseDto> listOrdersAppointmentNumber(@RequestBody CalendarRequestDto calendarRequestDto) {
		return ordersService.listOrdersAppointmentNumber(calendarRequestDto);
	}

	//创建体检预约订单
	@RequestMapping("/saveOrders")
	public int saveOrders(@RequestBody Orders orders) {
		return ordersService.saveOrders(orders);
	}

	//根据用户编号查询预约体检订单列表
	@RequestMapping("/listOrdersByUserId")
	public List<Orders> listOrdersByUserId(@RequestBody Orders orders) {
		return ordersService.listOrdersByUserId(orders);
	}

	//取消预约体检订单
	@RequestMapping("/removeOrders")
	public int removeOrders(@RequestBody Orders orders) {
		return ordersService.removeOrders(orders.getOrderId());
	}

	//根据订单编号查询预约体检订单
	@RequestMapping("/getOrdersById")
	public Orders getOrdersById(@RequestBody Orders orders) {
		return ordersService.getOrdersById(orders.getOrderId());
	}
}
