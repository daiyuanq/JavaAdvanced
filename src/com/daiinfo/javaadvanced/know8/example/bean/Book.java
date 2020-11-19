/**  
* @Title: Bookinfo.java
* @Package com.daiinfo.javaadvanced.know8.example.bean
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月14日 下午8:28:50
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know8.example.bean;

import java.io.Serializable;

/**
* @ClassName: Book
* @Description: 图书信息类，实体类，封装图书的基本信息及setter和getter方法
* @author 戴远泉
* @date 2020年11月14日下午8:28:50
*/

public class Book implements Serializable{
	int id;
	String bookNo;
	String bookname;
	String author;
	String publisher;
	double price;
	String publishtime;
	String ISBN;
	int amount;

	public Book() {

	}

	public Book(String bookNo, String bookname, String author) {
		this.bookNo = bookNo;
		this.bookname = bookname;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookNo() {
		return bookNo;
	}

	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double d) {
		this.price = d;
	}

	public String getPublishtime() {
		return publishtime;
	}

	public void setPublishtime(String publishtime) {
		this.publishtime = publishtime;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Book["+bookNo+"," + bookname+"," + author+"]";
	}

}
