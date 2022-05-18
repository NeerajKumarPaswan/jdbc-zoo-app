package com.ty.zoo.controller;

import com.ty.zoo.dao.UserDao;
import com.ty.zoo.dto.User;

public class TestSaveUser {
public static void main(String[] args) {
	User user=new User();
	user.setId(2);
	user.setName("Sandeep");
	user.setEmail("sand@mail.com");
	user.setPassword("suchi");
	user.setPhone("123456");
	user.setRole("Chaprasi");
	UserDao userdao=new UserDao();
	
	userdao.saveUser(user);
	
}
}
