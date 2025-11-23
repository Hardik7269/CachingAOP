package com.caching.aop.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caching.aop.project.entity.UserInfo;

@Repository
public interface UserInfoRepo extends JpaRepository<UserInfo, Integer>{
	List<UserInfo> findALL();
}
