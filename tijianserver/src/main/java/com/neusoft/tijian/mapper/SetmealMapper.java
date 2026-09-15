package com.neusoft.tijian.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.tijian.po.Setmeal;

@Mapper
public interface SetmealMapper {

	//根据套餐类型查询体检套餐列表（SQL 定义在 SetmealMapper.xml）
	public List<Setmeal> listSetmealByType(int type);

	//根据套餐编号查询体检套餐
	@Select("select * from setmeal where smId=#{smId}")
	public Setmeal getSetmealById(Integer smId);
}
