package com.daiinfo.javaadvanced.know3;

public class User {
	int id;
	String name;
	String nickname;
	int age;
	String sex;

	private void print(String nickname, int age, String sex) {
		System.out.println("User:" + nickname + "," +age+","+ sex);
	}
}
