package com.jyt.soft.service.impl;

import javax.annotation.Resource;

import com.jyt.soft.dao.UserDao;
import com.jyt.soft.service.UserService;

public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
}
