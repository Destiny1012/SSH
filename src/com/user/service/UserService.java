package com.user.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.user.dao.IUserDao;
import com.user.domain.User;

@Service
public class UserService implements IUserService {
	
	@Resource
	private IUserDao userDao;
	
	public boolean  saveUser(User user){
		try{
			userDao.save(user);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deleteUser(long id){
		try{
			userDao.delete(id);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updateUser(User user){
		try{
			userDao.update(user);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public User getById(long id){
		try{
			return userDao.getById(id);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
}
