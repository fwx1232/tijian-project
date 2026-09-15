package com.neusoft.tijian.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.tijian.po.Users;

@Mapper
public interface UsersMapper {

	//根据用户编号和密码查询用户（登录用）
	@Select("select * from users where userId=#{userId} and password=#{password}")
	public Users getUsersByUserIdByPass(Users users);

	//根据用户编号查询用户
	@Select("select * from users where userId=#{userId}")
	public Users getUsersById(String userId);

	//注册用户
	@Insert("insert into users(userId,password,realName,sex,identityCard,birthday,userType) "
			+ "values(#{userId},#{password},#{realName},#{sex},#{identityCard},#{birthday},#{userType})")
	public int saveUsers(Users users);
}
