package com.user.dao;

import java.util.List;

import com.user.domain.User;

public interface IUserDao {

	public void save(User user);
	
	public void delete(Long id);
	
	public void update(User user);
	
	public User getById(Long id);
	
	public List<User> getByIds(Long[] ids);
	
	public List<User> findAll();

}
