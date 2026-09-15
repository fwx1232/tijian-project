package com.neusoft.tijian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.tijian.po.SetmealDetailed;
import com.neusoft.tijian.service.SetmealDetailedService;

@RestController
@RequestMapping("/setmealDetailed")
public class SetmealDetailedController {

	@Autowired
	private SetmealDetailedService setmealDetailedService;

	//根据套餐编号查询套餐项目明细列表（含所属检查项）
	@RequestMapping("/listSetmealDetailedBySmId")
	public List<SetmealDetailed> listSetmealDetailedBySmId(@RequestBody SetmealDetailed setmealDetailed) {
		return setmealDetailedService.listSetmealDetailedBySmId(setmealDetailed.getSmId());
	}
}
