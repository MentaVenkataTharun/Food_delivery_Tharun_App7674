package com.tapfood.dao;

import java.util.ArrayList;

import com.tapfood.model.user;

public interface userdao {

	int addUser(user u);
	ArrayList<user> getAllUsers();
	user getUser(String email);
	int updateUser(user u);
	int deleteUser(String email);
	
}
