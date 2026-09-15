package com.neusoft.tijiancms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.tijiancms.mapper.DoctorMapper;
import com.neusoft.tijiancms.po.Doctor;
import com.neusoft.tijiancms.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	private DoctorMapper doctorMapper;
	
	@Override
	public Doctor getDoctorByCodeByPass(Doctor doctor) {
		return doctorMapper.getDoctorByCodeByPass(doctor);
	}
}
