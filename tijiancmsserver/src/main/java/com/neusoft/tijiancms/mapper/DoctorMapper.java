package com.neusoft.tijiancms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.tijiancms.po.Doctor;

@Mapper
public interface DoctorMapper {

	@Select("select * from doctor where docCode=#{docCode} and password=#{password}")
	public Doctor getDoctorByCodeByPass(Doctor doctor);
}
