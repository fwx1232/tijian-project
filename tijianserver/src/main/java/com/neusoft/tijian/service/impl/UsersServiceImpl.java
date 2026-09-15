package com.neusoft.tijian.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.tijian.po.Users;
import com.neusoft.tijian.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	private UsersMapper usersMapper;

	@Override
	public Users getUsersByUserIdByPass(Users users) {
		return usersMapper.getUsersByUserIdByPass(users);
	}
	
	@Override
	public Users getUsersById(String userId) {
		return usersMapper.getUsersById(userId);
	}
	
	@Override
	public int saveUsers(Users users) {
		return usersMapper.saveUsers(users);
	}
}
