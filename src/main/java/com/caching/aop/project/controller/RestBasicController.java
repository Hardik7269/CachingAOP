package com.caching.aop.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caching.aop.project.entity.UserInfo;
import com.caching.aop.project.service.ServiceLayer;

@RestController
public class RestBasicController {
	
	@Autowired
	private ServiceLayer serviceLayer;
	
	@GetMapping(value = "/getMapping")
	public List<UserInfo> getAllUsers() {
		return serviceLayer.getALLUsers();
	}
	
}
