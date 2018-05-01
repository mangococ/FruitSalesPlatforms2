package com.fruitsalesplatform.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fruitsalesplatform.test.dao.TestDao;
import com.fruitsalesplatform.test.entity.User;
import com.fruitsalesplatform.test.service.TestService;

@Service//为了包扫描的时候这个Service被扫描到
public class TestServiceImpl implements TestService{

	@Autowired
    private TestDao testDao;	
	
	public List<User> findUserByName(User user) {
		return testDao.findUserByName(user);
	}

}
