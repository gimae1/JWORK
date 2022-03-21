package com.springbook.biz.user.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService{

	private UserDAO userDAO;


	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

	@Override
	public void deleteUser(UserVO vo) {
			userDAO.deleteUser(vo);
		
	}

	@Override
	public void insertUser(UserVO vo) {
			userDAO.insertUser(vo);
		
	}

	@Override
	public List<UserVO> getUserList(UserVO vo) {
		return userDAO.getUserList(vo);
	}

	@Override
	public void updateUser(UserVO vo) {
		userDAO.updateUser(vo);
	}

	@Override
	public UserVO getoneUser(UserVO vo) {
		return userDAO.getoneUser(vo);
	}
	
	
}
