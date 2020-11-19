/**  
* @Title: TestMain.java
* @Package com.daiinfo.javaadvanced.know8
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月18日 上午8:52:20
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know8;

import java.util.ArrayList;

/**
* @ClassName: TestMain
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月18日上午8:52:20
*/

public class TestMain {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		BaseDAO<Person> personDao = new PerosonDAO();
		ArrayList<Person> personList = personDao.finAll( );
		for(Person p : personList){
			System.out.println(p.toString());
		}
		
		System.out.println("------");
		BaseDAO<User>  userDao=new UserDAO();
		ArrayList<User> userList=userDao.finAll( );
		for(User u:userList){
			System.out.println(u.toString());
		}
		 
		
		/*
		Person person=new Person("何凱",23,4);
		BaseDAO<Person> personDao=new PerosonDAO();
		personDao.add(person);
		
		User user=new User("牛莉", "1234", "gg@qq.com", 8);
		BaseDAO<User> userDao=new UserDAO();
		userDao.add(user);
		*/
		
		/*
		BaseDAO<Person> personDao=new PerosonDAO();
		Person person=personDao.findById(3);
		System.out.println(person.toString());
		
		BaseDAO<User> userDao=new UserDAO();
		User user=userDao.findById(22);
		System.out.println(user.toString());*/
		
		/*
		 * // 根据id删除
		BaseDAO<Person> personDao=new PerosonDAO();
		if(personDao.delete(1)){
			System.out.println("刪除成功！");
		}
		*/
		
		
		// 根据特定条件删除
		/*BaseDAO<Person> personDao=new PerosonDAO();
		if(personDao.deleteByCondition("name", "何凱")){
			System.out.println("刪除成功！");
		}*/
		
		// 更新
		/*
		 * BaseDAO<Person> personDao=new PerosonDAO();
		Person person=personDao.findById(3);
		System.out.println(person.toString());
		person.setName("王六");
		person.setAge(34);
		if(personDao.update(person)){
			System.out.println("更新成功！");
		}
		*/
	}

}
