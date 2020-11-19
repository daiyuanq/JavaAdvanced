/**  
* @Title: DAOGenericityTest.java
* @Package com.daiinfo.javaadvanced.know4.example.test
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月10日 下午3:08:30
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know4.example.test;

import java.util.ArrayList;
import java.util.List;

import com.daiinfo.javaadvanced.know4.example.bean.Book;
import com.daiinfo.javaadvanced.know4.example.bean.Person;
import com.daiinfo.javaadvanced.know4.example.bean.Student;
import com.daiinfo.javaadvanced.know4.example.bean.Teacher;
import com.daiinfo.javaadvanced.know4.example.bean.User;
import com.daiinfo.javaadvanced.know4.example.dao.BaseDAO;
import com.daiinfo.javaadvanced.know4.example.impl.BaseDAOImpl;
import com.daiinfo.javaadvanced.know4.example.impl.BookDAOImpl;
import com.daiinfo.javaadvanced.know4.example.impl.PersonDAOImpl;
import com.daiinfo.javaadvanced.know4.example.impl.StudentDAOImpl;
import com.daiinfo.javaadvanced.know4.example.impl.TeacherDAOImpl;
import com.daiinfo.javaadvanced.know4.example.impl.UserDAOImpl;

/**
* @ClassName: DAOGenericityTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月10日下午3:08:30
*/

public class DAOGenericityTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.查询所有记录
		// (1)查询Person表
		BaseDAOImpl<Person> personDaoImpl = new PersonDAOImpl();
		ArrayList<Person> personList = personDaoImpl.findAll();
		for (Person p : personList) {
			System.out.println(p.toString());
		}

		System.out.println("------");
		// （2）查询User表
		BaseDAOImpl<User> userDaoImpl = new UserDAOImpl();
		ArrayList<User> userList = userDaoImpl.findAll();
		for (User u : userList) {
			System.out.println(u.toString());
		}

		System.out.println("--------");
		// (3)查询Teacher表
		BaseDAOImpl<Teacher> teacherDaoImpl = new TeacherDAOImpl();
		ArrayList<Teacher> teacherList = teacherDaoImpl.findAll();
		for (Teacher t : teacherList) {
			System.out.println(t.toString());
		}

		// (4)查询Book表
		BaseDAOImpl<Book> bookDaoImpl = new BookDAOImpl();
		ArrayList<Book> bookList = bookDaoImpl.findAll();
		for (Book b : bookList) {
			System.out.println(b.toString());
		}

		// (5)查询Student表
		BaseDAOImpl<Student> studentDaoImpl = new StudentDAOImpl();
		ArrayList<Student> studentList = studentDaoImpl.findAll();
		for (Student s : studentList) {
			System.out.println(s.toString());
		}

		// 2.添加记录
		/*
		 * Person person=new Person("何凯",23,4); BaseDAOImpl<Person>
		 * personDao=new BaseDAOImpl<Person>(); if(personDao.add(person)){
		 * System.out.println("添加记录成功！"); }
		 */

		/*
		 * User user=new User("牛莉", "1234", "gg@qq.com", 8); BaseDAOImpl<User>
		 * userDaoImpl=new UserDAOImpl(); userDaoImpl.add(user);
		 */

		/*
		 * BaseDAOImpl<Teacher> tBaseDAOImpl = new TeacherDAOImpl(); Teacher t =
		 * new Teacher("吴敏", "nv"); t.setProfessional("教授");
		 * tBaseDAOImpl.add(t);
		 */

		// 3.根据id查找
		/*
		 * BaseDAOImpl<Person> pDaoImpl = new PersonDAOImpl(); Person person =
		 * pDaoImpl.findById(3); System.out.println(person.toString());
		 */

		/*
		 * BaseDAOImpl<User> uDaoImpl = new UserDAOImpl(); User user =
		 * uDaoImpl.findById(22); System.out.println(user.toString());
		 */

		// 4.根据id删除
		/*
		 * BaseDAOImpl<Person> perDaoImpl = new PersonDAOImpl(); if
		 * (perDaoImpl.delete(11)) { System.out.println("刪除成功！"); }else{
		 * System.out.println("刪除失败！"); }
		 */
		/*
		 * BaseDAOImpl<Teacher> tBaseDAOImpl=new TeacherDAOImpl();
		 * if(tBaseDAOImpl.delete(2)){ System.out.println("刪除成功！"); }else{
		 * System.out.println("刪除失败！"); }
		 */

		// 5.根据特定条件删除
		/*
		 * BaseDAOImpl<Book> bDaoImplDao = new BookDAOImpl(); if
		 * (bDaoImplDao.deleteByCondition("name", "C++")) {
		 * System.out.println("刪除成功！"); } else { System.out.println("刪除失败！"); }
		 */

		// 6.更新
		// 首先查找要修改的记录，找到后重新设置其字段的值，再保存
		BaseDAOImpl<Student> sDaoImplDao = new StudentDAOImpl();
		Student student = studentDaoImpl.findById(2);
		System.out.println(student.toString());
		student.setName("王六");
		student.setAge(34);
		if (sDaoImplDao.update(student)) {
			System.out.println("更新成功！");
		} else {
			System.out.println("删除失败！");
		}

	}

}
