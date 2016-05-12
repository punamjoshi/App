package com.DAO;

import java.util.List;

import com.EntityClassess.Product;
import com.EntityClassess.User;

public interface UserDao {

	public List<User> getList();
	public void addUser(User p);
	public void updateUser(User p);
	public void deleteUser(String prodid);
	public User getUserbyId(String prodid);
   
	
	
}
