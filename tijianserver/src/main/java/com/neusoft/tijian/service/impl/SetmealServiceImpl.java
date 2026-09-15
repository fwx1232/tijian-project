package com.neusoft.tijian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.tijian.mapper.SetmealMapper;
import com.neusoft.tijian.po.Setmeal;
import com.neusoft.tijian.service.SetmealService;

@Service
public class SetmealServiceImpl implements SetmealService {

	@Autowired
	private SetmealMapper setmealMapper;

	@Override
	public List<Setmeal> listSetmealByType(int type) {
		return setmealMapper.listSetmealByType(type);
	}

	@Override
	public Setmeal getSetmealById(Integer smId) {
		return setmealMapper.getSetmealById(smId);
	}
}
