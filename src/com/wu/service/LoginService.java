package com.wu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wu.dao.LoginMapper;
import com.wu.domain.User;
import com.wu.interfaces.LoginInterface;

@Service("loginService")
public class LoginService implements LoginInterface {
	@Autowired
	private LoginMapper loginMapper;
	@Override
	public User login(User user) {
		return loginMapper.login(user);
	}
	@Override
	public List<User> searchUser() {
		
		return loginMapper.searchUser();
	}

}
