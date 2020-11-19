/**  
* @Title: Book.java
* @Package com.daiinfo.javaadvanced.know2.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月9日 上午10:11:52
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know2.training;

/**
* @ClassName: Book
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月9日上午10:11:52
*/

public class Book {
	int bNo;
	String bName;
	String bAuthor;

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbAuthor() {
		return bAuthor;
	}

	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}

	public Book(int no, String name, String author) {
		bNo = no;
		bName = name;
		bAuthor = author;
	}

	@Override
	public String toString() {
		return "Book[" + bNo + "," + bName + "," + bAuthor + "]";

	}

}
