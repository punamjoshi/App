package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.DAO.UserDao;
import com.DAO.UserService;
import com.EntityClassess.User;

public class UserServiceImpl implements UserService{

	 @Autowired
	 UserDao userDao;
	public UserServiceImpl()  {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> getList() {
		
		return userDao.getList();
	}

	@Override
	public void addUser(User p) {
		// TODO Auto-generated method stub
		userDao.addUser(p);
	}

	@Override
	public void updateUser(User p) {
		userDao.updateUser(p);
	}

	@Override
	public void deleteUser(String prodid) {
		// TODO Auto-generated method stub
		userDao.deleteUser(prodid);
	}

	@Override
	public User getUserbyId(String prodid) {
		// TODO Auto-generated method stub
		return userDao.getUserbyId(prodid);
	}

}
