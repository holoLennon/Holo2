package com.holo.service.impl;

import org.springframework.stereotype.Service;

import com.holo.common.bean.User;
import com.holo.common.exception.HoException;
import com.holo.service.BaseService;
import com.holo.service.UserService;


@Service
public class UserServiceImpl extends BaseService<User> implements UserService{
	UserService userService;
	@Override
	public User loginCheck(User user) throws HoException {
		if(user==null){
			throw new HoException("xxx");
		}
		User userDb=getFirst(null, "username = ?0",null,new Object[]{user.getUsername()});
		if(userDb==null){
			throw new HoException("fuc");
		}
		System.err.println(userDb);
		return userDb;
	}	
}
