package com.neusoft.tijian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.tijian.mapper.SetmealDetailedMapper;
import com.neusoft.tijian.po.SetmealDetailed;
import com.neusoft.tijian.service.SetmealDetailedService;

@Service
public class SetmealDetailedServiceImpl implements SetmealDetailedService {

	@Autowired
	private SetmealDetailedMapper setmealDetailedMapper;

	@Override
	public List<SetmealDetailed> listSetmealDetailedBySmId(Integer smId) {
		return setmealDetailedMapper.listSetmealDetailedBySmId(smId);
	}
}
