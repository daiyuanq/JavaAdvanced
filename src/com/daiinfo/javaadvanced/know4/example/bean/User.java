/**  
* @Title: User.java
* @Package com.daiinfo.javaadvanced.know4.example.bean
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月10日 下午3:24:06
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know4.example.bean;

/**
* @ClassName: User
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月10日下午3:24:06
*/

public class User {
	private int id;
	private String username;
	private String password;
	private String email;
	private int grade;

	public User() {

	}

	public User(String username, String password, String email, int grade) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "User[" + id + "," + username + "," + password + "," + email + "," + grade + "]";

	}
}
