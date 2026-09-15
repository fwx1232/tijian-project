package com.neusoft.tijian.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.tijian.po.Hospital;

@Mapper
public interface HospitalMapper {

	//查询医院列表
	@Select("select * from hospital")
	public List<Hospital> listHospital();

	//根据医院编号查询医院
	@Select("select * from hospital where hpId=#{hpId}")
	public Hospital getHospitalById(Integer hpId);
}
