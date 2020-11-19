/**  
* @Title: BookDAOWithDBCPConnPool.java
* @Package com.daiinfo.javaadvanced.know8.example.dao
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月14日 下午10:07:48
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know8.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.daiinfo.javaadvanced.know8.example.bean.Book;
import com.daiinfo.javaadvanced.know8.example.util.DBCPConnPool;
import com.daiinfo.javaadvanced.know8.example.util.DBManager;

/**
* @ClassName: BookDAOWithDBCPConnPool
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月14日下午10:07:48
*/

public class BookDAOWithDBCPConnPool {
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement ps;
	private Statement st;

	/**
	 * 添加图书
	 * 
	 * @param book
	 * @return 布尔类型值
	 */
	public boolean addBook(Book book) {
		boolean flag = false;
		String sql = "insert into Book(bookNo,bookname,author,publisher,price,publishtime,ISBN,amount) values(?,?,?,?,?,?,?,?)";
		try {
			conn = DBCPConnPool.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, book.getBookNo());
			ps.setString(2, book.getBookname());
			ps.setString(3, book.getAuthor());
			ps.setString(4, book.getPublisher());
			ps.setDouble(5, book.getPrice());
			ps.setString(6, book.getPublishtime());
			ps.setString(7, book.getISBN());
			ps.setInt(8, book.getAmount());
			flag = ps.executeUpdate() != 0 ? true : false;
			conn.commit();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;

	}

	/**
	 * 根据图书名查询
	 * 
	 * @param bname
	 * @return 图书列表
	 */
	public List<Book> queryByBookName(String bname) {
		List<Book> books = new ArrayList<Book>();
		conn = DBCPConnPool.getConnection();
		String sqlString = "select * from Book where bookname like ?";

		try {
			ps = conn.prepareStatement(sqlString);
			bname = "%" + bname + "%";
			ps.setString(1, bname);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int bookId = rs.getInt("ID");
				String bookNo = rs.getString("bookNo");
				String bookname = rs.getString("bookname");
				String author = rs.getString("author");
				String publisher = rs.getString("publisher");
				String publishtime = rs.getString("publishtime");
				double price = rs.getFloat("price");
				String ISBN = rs.getString("ISBN");
				int amount = rs.getInt("amount");

				Book book = new Book(bookNo, bookname, author);
				book.setId(bookId);
				book.setPublisher(publisher);
				book.setPublishtime(publishtime);
				book.setISBN(ISBN);
				book.setPrice(price);
				book.setAmount(amount);
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}

	/**
	 * 查询所有的图书
	 * 
	 * @return 图书结果集
	 */
	public List<Book> findAll() {
		List<Book> books = new ArrayList<Book>();
		conn = DBCPConnPool.getConnection();
		String sql = "select * from Book";
		try {

			/*
			 * st = conn.createStatement(); rs = st.executeQuery(sql);
			 */
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt(1));
				book.setBookNo(rs.getString(2));
				book.setBookname(rs.getString(3));
				book.setAuthor(rs.getString(4));
				book.setPublisher(rs.getString(5));
				book.setPrice(rs.getDouble(6));
				book.setPublishtime(rs.getString(7));
				book.setISBN(rs.getString(8));
				book.setAmount(rs.getInt(9));
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;

	}

	/**
	 * 根据图书的ID删除图书
	 * 
	 * @param id
	 * @return
	 */
	public boolean delBookById(int id) {
		boolean flag = false;
		String sql = "delete from Book where ID=?";
		try {
			conn = DBCPConnPool.getConnection();
			// 创建一个PreparedStatement对象，用于将参数化的SQL语句发送到数据库。
			// sql - 可能包含一个或多个“？”的SQL语句 IN参数占位符
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			if (ps.executeUpdate() >= 1) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;
	}

	/**
	 * 根据图书进行修改其信息
	 * 
	 * @param book
	 * @return
	 */
	public boolean updateBook(Book book) {
		boolean flag = false;
		conn = DBCPConnPool.getConnection();
		String sql = "update Book set bookNo = ?,bookname = ?,author=?,publisher=?,price=?,publishtime=?,ISBN=?,amount=? where ID=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, book.getBookNo());
			ps.setString(2, book.getBookname());
			ps.setString(3, book.getAuthor());
			ps.setString(4, book.getPublisher());
			ps.setDouble(5, book.getPrice());
			ps.setString(6, book.getPublishtime());
			ps.setString(7, book.getISBN());
			ps.setInt(8, book.getAmount());
			ps.setInt(9, book.getId());
			flag = ps.executeUpdate() > 0 ? true : false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * 批量删除 将图书的ID组合成字符串，并用“，”隔开
	 * 
	 * @param param
	 * @return
	 */
	public boolean deleteBatch(String param) {
		Boolean flag = false;
		conn = DBCPConnPool.getConnection();

		String[] strings = param.split(",");

		try {
			conn.setAutoCommit(false);
			conn.commit();// 提交事务
			for (String s : strings) {
				int id = Integer.parseInt(s);
				delBookById(id);
			}
			flag = true;
		} catch (SQLException e) {
			try {
				conn.rollback(); // 进行事务回滚
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return flag;
	}
	/**
	 * 
	* @Title: statisticAmountByPublisher
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @return
	* @return Map<String,Integer>
	* @throws
	 */
	public Map<String, Integer> statisticAmountByPublisher() {
		Map<String, Integer> map = new HashMap<String, Integer>();

		conn = DBCPConnPool.getConnection();
		String sql = "select publisher,sum(amount)  from Book GROUP BY publisher";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				map.put(rs.getString(1), rs.getInt(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;

	}


}
