package com.wu.dao;

import java.util.List;

import com.wu.domain.User;

public interface LoginMapper {
	public User login(User user);
	
	public List<User> searchUser();
}
