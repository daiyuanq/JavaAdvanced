/**  
* @Title: Addr.java
* @Package com.daiinfo.javaadvanced.know5.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月11日 下午1:41:20
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know5.example;

import java.io.Serializable;

/**
* @ClassName: Addr
* @Description: 表示地址
* @author 戴远泉
* @date 2020年11月11日下午1:41:20
*/

public class Address implements Serializable{
	private static final long serialVersionUID = 1L;
	private String state; // 表示员工所在的国家
	private String province; // 表示员工所在的省
	private String city; // 表示员工所在的市

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String state, String province, String city) {// 利用构造方法初始化各个域
		this.state = state;
		this.province = province;
		this.city = city;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {// 使用地址属性表示地址对象
		StringBuilder sb = new StringBuilder();
		sb.append("国家：" + state + ", ");
		sb.append("省：" + province + ", ");
		sb.append("市：" + city);
		return sb.toString();
	}

}
