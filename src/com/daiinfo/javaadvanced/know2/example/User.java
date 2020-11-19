/**  
* @Title: User.java
* @Package com.daiinfo.javaadvanced.know2.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月6日 下午9:40:14
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know2.example;

/**
* @ClassName: User
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月6日下午9:40:14
*/

public class User {
	String name;
	String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	@Override
	public String toString(){
		return "User["+name+","+email+"]";
	}
}
