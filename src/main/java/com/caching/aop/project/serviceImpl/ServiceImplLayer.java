package com.caching.aop.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caching.aop.project.entity.UserInfo;
import com.caching.aop.project.repository.UserInfoRepo;
import com.caching.aop.project.service.ServiceLayer;

@Service
public class ServiceImplLayer implements ServiceLayer {

	@Autowired
	private UserInfoRepo userInfoRepo;
	
	@Override
	public List<UserInfo> getALLUsers() {
		return userInfoRepo.findALL();
	}

}
