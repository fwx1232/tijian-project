package com.neusoft.tijian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.tijian.mapper.HospitalMapper;
import com.neusoft.tijian.po.Hospital;
import com.neusoft.tijian.service.HospitalService;

@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalMapper hospitalMapper;

	@Override
	public List<Hospital> listHospital() {
		return hospitalMapper.listHospital();
	}

	@Override
	public Hospital getHospitalById(Integer hpId) {
		return hospitalMapper.getHospitalById(hpId);
	}
}
