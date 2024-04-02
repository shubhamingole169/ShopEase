package com.ShopeEase.service;

import com.ShopeEase.exception.UserException;
import com.ShopeEase.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
