/**  
* @Title: Book.java
* @Package com.daiinfo.javaadvanced.know4.example.bean
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月10日 上午9:19:15
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know4.example.bean;

/**
* @ClassName: Book
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月10日上午9:19:15
*/

public class Book {
	private int id;
	private String name;
	private String publisher;
	private String author;
	
	public Book(){
		
	}

	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book[" + id + "," + name + "," + author + "," + publisher + "," + "]";

	}

}
