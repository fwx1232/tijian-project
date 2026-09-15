package com.neusoft.tijian.service;

import java.util.List;

import com.neusoft.tijian.po.Hospital;

public interface HospitalService {

	public List<Hospital> listHospital();
	public Hospital getHospitalById(Integer hpId);
}
