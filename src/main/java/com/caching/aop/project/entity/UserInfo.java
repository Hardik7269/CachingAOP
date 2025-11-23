package com.caching.aop.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "users_info", schema = "caching")
public class UserInfo {

	private int uid;
	private String uname;

	public UserInfo() {
		super();
	}

	public UserInfo(int uid, String uname) {
		super();
		this.uid = uid;
		this.uname = uname;
	}

}
