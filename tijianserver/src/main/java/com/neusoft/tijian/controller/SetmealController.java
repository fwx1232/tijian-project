package com.neusoft.tijian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.tijian.po.Setmeal;
import com.neusoft.tijian.service.SetmealService;

@RestController
@RequestMapping("/setmeal")
public class SetmealController {

	@Autowired
	private SetmealService setmealService;

	//根据套餐类型查询体检套餐列表（1：男士套餐；0：女士套餐），含套餐明细
	@RequestMapping("/listSetmealByType")
	public List<Setmeal> listSetmealByType(@RequestBody Setmeal setmeal) {
		return setmealService.listSetmealByType(setmeal.getType());
	}

	//根据套餐编号查询体检套餐
	@RequestMapping("/getSetmealById")
	public Setmeal getSetmealById(@RequestBody Setmeal setmeal) {
		return setmealService.getSetmealById(setmeal.getSmId());
	}
}
