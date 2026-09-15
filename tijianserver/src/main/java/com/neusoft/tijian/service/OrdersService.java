package com.neusoft.tijian.service;

import java.util.List;

import com.neusoft.tijian.dto.CalendarRequestDto;
import com.neusoft.tijian.dto.CalendarResponseDto;
import com.neusoft.tijian.po.Orders;

public interface OrdersService {

	public int getOrdersByUserId(String userId);
	public List<CalendarResponseDto> listOrdersAppointmentNumber(CalendarRequestDto calendarRequestDto);
	public int saveOrders(Orders orders);
	public List<Orders> listOrdersByUserId(Orders orders);
	public int removeOrders(Integer orderId);
	public Orders getOrdersById(Integer orderId);
}
