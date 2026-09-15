package com.neusoft.tijian.service;

import java.util.List;

import com.neusoft.tijian.po.Setmeal;

public interface SetmealService {

	public List<Setmeal> listSetmealByType(int type);
	public Setmeal getSetmealById(Integer smId);
}
