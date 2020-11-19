package com.daiinfo.javaadvanced.know9.builder;

public abstract class Product {

	public String productName;// 作品名称
	public String author;// 作者
	public double fundraising = 0.0;// 耗资
	public String content;// 故事情节

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getFundraising() {
		return fundraising;
	}

	public void setFundraising(double fundraising) {
		this.fundraising = fundraising;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "产品：[" + "产品名称:" + productName + ",作者:" + author + ",故事情节:" + content 
				+ ",耗资:" + fundraising + "]";
	}
}
