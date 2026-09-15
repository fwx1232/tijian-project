package com.neusoft.tijian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.tijian.po.Hospital;
import com.neusoft.tijian.service.HospitalService;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

	@Autowired
	private HospitalService hospitalService;

	//查询医院列表
	@RequestMapping("/listHospital")
	public List<Hospital> listHospital() {
		return hospitalService.listHospital();
	}

	//根据医院编号查询医院
	@RequestMapping("/getHospitalById")
	public Hospital getHospitalById(@RequestBody Hospital hospital) {
		return hospitalService.getHospitalById(hospital.getHpId());
	}
}
