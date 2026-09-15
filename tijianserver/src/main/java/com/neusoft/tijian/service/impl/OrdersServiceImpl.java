package com.neusoft.tijian.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.tijian.dto.CalendarRequestDto;
import com.neusoft.tijian.dto.CalendarResponseDto;
import com.neusoft.tijian.dto.OrdersMapperDto;
import com.neusoft.tijian.mapper.HospitalMapper;
import com.neusoft.tijian.mapper.OrdersMapper;
import com.neusoft.tijian.po.Hospital;
import com.neusoft.tijian.po.Orders;
import com.neusoft.tijian.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersMapper ordersMapper;

	@Autowired
	private HospitalMapper hospitalMapper;

	//预约日历展示的天数（从今天起算）
	private static final int CALENDAR_DAYS = 30;

	@Override
	public int getOrdersByUserId(String userId) {
		return ordersMapper.getOrdersByUserId(userId);
	}

	@Override
	public List<CalendarResponseDto> listOrdersAppointmentNumber(CalendarRequestDto calendarRequestDto) {
		//说明：入参中的 year、month 供前端渲染月份用，后端统一返回从今天起 CALENDAR_DAYS 天的预约情况

		//1.根据医院编号取预约人数规则（如"每日限约50人"），提取其中的每日最大预约人数
		Integer total = 0;
		Hospital hospital = hospitalMapper.getHospitalById(calendarRequestDto.getHpId());
		if (hospital != null && hospital.getRule() != null) {
			Matcher matcher = Pattern.compile("\\d+").matcher(hospital.getRule());
			if (matcher.find()) {
				total = Integer.parseInt(matcher.group());
			}
		}

		//2.生成从今天起 CALENDAR_DAYS 天的日期列表，作为返回结果的骨架
		List<CalendarResponseDto> calendarList = new ArrayList<CalendarResponseDto>();
		List<OrdersMapperDto> paramList = new ArrayList<OrdersMapperDto>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		for (int i = 0; i < CALENDAR_DAYS; i++) {
			String ymd = sdf.format(calendar.getTime());
			calendarList.add(new CalendarResponseDto(ymd));

			//每一天一个查询参数，供 mapper 的 union 查询使用
			OrdersMapperDto dto = new OrdersMapperDto();
			dto.setDate(ymd);
			dto.setHpId(calendarRequestDto.getHpId());
			paramList.add(dto);

			calendar.add(Calendar.DAY_OF_MONTH, 1);
		}

		//3.查询这些天每天的已预约人数，回填到骨架中
		List<CalendarResponseDto> existingList = ordersMapper.listOrdersAppointmentNumber(paramList);
		for (CalendarResponseDto existing : existingList) {
			for (CalendarResponseDto item : calendarList) {
				if (item.getYmd().equals(existing.getYmd())) {
					item.setExisting(existing.getExisting());
					break;
				}
			}
		}

		//4.计算剩余可预约人数 = 每日最大预约人数 - 已预约人数
		for (CalendarResponseDto item : calendarList) {
			item.setTotal(total);
			int existing = item.getExisting() == null ? 0 : item.getExisting();
			item.setRemainder(total - existing);
		}
		return calendarList;
	}

	@Override
	public int saveOrders(Orders orders) {
		//凡是有未归档的预约记录（state=1）的用户，不能再次预约
		if (ordersMapper.getOrdersByUserId(orders.getUserId()) > 0) {
			return 0;
		}
		return ordersMapper.saveOrders(orders);
	}

	@Override
	public List<Orders> listOrdersByUserId(Orders orders) {
		return ordersMapper.listOrdersByUserId(orders);
	}

	@Override
	public int removeOrders(Integer orderId) {
		return ordersMapper.removeOrders(orderId);
	}

	@Override
	public Orders getOrdersById(Integer orderId) {
		return ordersMapper.getOrdersById(orderId);
	}
}
