package com.neusoft.tijiancms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.tijiancms.po.Doctor;
import com.neusoft.tijiancms.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;

	@RequestMapping("/getDoctorByCodeByPass")
	public Doctor getDoctorByCodeByPass(@RequestBody Doctor doctor) {
		return doctorService.getDoctorByCodeByPass(doctor);
	}
}
