package com.user.service;

import com.user.domain.User;

public interface IUserService {
	
	public boolean saveUser(User user);
	
	public boolean deleteUser(long id);
	
	public boolean updateUser(User user);
	
	public User getById(long id);
	
}
