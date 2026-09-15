package com.neusoft.tijiancms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.tijiancms.po.Hospital;

@Mapper
public interface HospitalMapper {

	//根据医院编号查询医院
	@Select("select * from hospital where hpId=#{hpId}")
	public Hospital getHospitalById(Integer hpId);
}
