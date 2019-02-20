package com.wu.interfaces;

import java.util.List;

import com.wu.domain.User;

public interface LoginInterface {
	public User login(User user);
					
	public List<User> searchUser();
}
