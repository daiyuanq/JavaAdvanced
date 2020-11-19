/**  
* @Title: BookService.java
* @Package com.daiinfo.javaadvanced.know8.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月16日 上午12:12:04
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know8.example.service;

import java.util.List;

import org.junit.Test;

import com.daiinfo.javaadvanced.know8.example.bean.Book;
import com.daiinfo.javaadvanced.know8.example.dao.BookDAOWithDBCPConnPool;
import com.google.gson.Gson;

/**
* @ClassName: BookService
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月16日上午12:12:04
*/

public class BookService {
	/**
	 * 
	* @Title: queryByBookname
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param bookname
	* @param @return
	* @return String
	* @throws
	 */
	public String queryByBookname(String bookname) {
		BookDAOWithDBCPConnPool bDAOPool = new BookDAOWithDBCPConnPool();
		List<Book> list = bDAOPool.queryByBookName(bookname);
		Gson gson = new Gson();
		String listJson = gson.toJson(list);
		return listJson;
	}

	/**
	 * 测试
	 */
	@Test
	public void testqueryByBookname() {
		String bookname = "Java";
		System.out.println(queryByBookname(bookname));
	}
	
}
