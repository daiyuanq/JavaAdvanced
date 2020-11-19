/**  
* @Title: DeleteBookTest.java
* @Package com.daiinfo.javaadvanced.know8.example.test
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月14日 下午8:55:00
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know8.example.test;

import java.util.List;

import com.daiinfo.javaadvanced.know8.example.bean.Book;
import com.daiinfo.javaadvanced.know8.example.dao.BookDAO;

/**
* @ClassName: DeleteBookTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月14日下午8:55:00
*/

public class DeleteBookTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDAO bookDAO = new BookDAO();
		int bookid = 50;
		boolean flag=bookDAO.delBookById(bookid);
		System.out.println(flag);
		if (flag) {
			System.out.println("删除成功！");
		} else {
			System.out.println("删除失败！");
		}
	}
}
