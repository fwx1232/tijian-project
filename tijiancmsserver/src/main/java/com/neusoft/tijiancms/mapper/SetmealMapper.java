package com.neusoft.tijiancms.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.tijiancms.po.Setmeal;

@Mapper
public interface SetmealMapper {

	//根据套餐编号查询体检套餐（SQL 定义在 SetmealMapper.xml）
	public Setmeal getSetmealByIdByMapper(Integer smId);
}
