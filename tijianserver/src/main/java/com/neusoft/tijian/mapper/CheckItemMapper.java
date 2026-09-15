package com.neusoft.tijian.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.tijian.po.CheckItem;

@Mapper
public interface CheckItemMapper {

	//根据检查项编号查询检查项
	@Select("select * from checkitem where ciId=#{ciId}")
	public CheckItem getCheckItemById(Integer ciId);
}
