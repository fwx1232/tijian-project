package com.neusoft.tijian.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.tijian.po.SetmealDetailed;

@Mapper
public interface SetmealDetailedMapper {

	//根据套餐编号查询套餐项目明细列表（SQL 定义在 SetmealDetailedMapper.xml）
	public List<SetmealDetailed> listSetmealDetailedBySmId(Integer smId);
}
