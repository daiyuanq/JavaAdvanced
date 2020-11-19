/**  
* @Title: BookDAOWithConnPoolJUnitTest.java
* @Package com.daiinfo.javaadvanced.know8.example.dao
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月14日 下午11:35:42
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know8.example.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.daiinfo.javaadvanced.know8.example.bean.Book;
import com.daiinfo.javaadvanced.know8.example.dao.BookDAO;
import com.daiinfo.javaadvanced.know8.example.dao.BookDAOWithDBCPConnPool;

/**
* @ClassName: BookDAOWithConnPoolJUnitTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月14日下午11:35:42
*/

public class BookDAOWithConnPoolJUnitTest {
/**
 * 
* @Title: testaddBook
* @Description: TODO(这里用一句话描述这个方法的作用)
* @param 
* @return void
* @throws
 */
	@Test
	public void testaddBook(){
		BookDAOWithDBCPConnPool bp=new BookDAOWithDBCPConnPool();
		Book book=new Book();
		book.setBookNo("TP/234");
		book.setBookname("大数据技术应用");
		book.setAuthor("戴远泉");
		book.setPublisher("人民邮电出版社");
		book.setPrice(58.5);
		book.setPublishtime("2019-09-09");
		book.setISBN("234892348");
		book.setAmount(10);
		if(bp.addBook(book)){
			System.out.println("添加成功！");
		}else{
			System.out.println("添加失败！");
		}

	}
	
	@Test
	public void testqueryByBookName(){
		BookDAOWithDBCPConnPool bp=new BookDAOWithDBCPConnPool();
		List<Book> bookList=new ArrayList<>();
		bookList=bp.queryByBookName("程序设计");
		for(Book b:bookList){
			System.out.println(b.toString());
		}
			
	}
	
	@Test
	public void testfindAll(){
		List<Book> bookList=new ArrayList<>();
		BookDAOWithDBCPConnPool bp=new BookDAOWithDBCPConnPool();
		bookList=bp.findAll();
		for(Book b:bookList){
			System.out.println(b.toString());
		}
	}

	@Test
	public void testdelBookById(){
		//BookDAOWithDBCPConnPool bp=new BookDAOWithDBCPConnPool();
		BookDAO bd=new BookDAO();
		boolean flag=bd.delBookById(53);
		System.out.println(flag);
		if(flag){
			System.out.println("删除成功！");
		}else{
			System.out.println("删除失败！");
		}
	}
	
}
