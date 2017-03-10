package com.holo.service;

import com.holo.common.bean.User;
import com.holo.common.exception.HoException;

/**
 * 
 * @author Holo
 *
 */
public interface UserService{
	User loginCheck(User user) throws HoException;
}
