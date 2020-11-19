/**  
* @Title: Circle.java
* @Package com.daiinfo.javaadvanced.know1.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月6日 下午9:20:03
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know1.example;

/**
 * 
* @ClassName: Circle
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月6日下午9:20:52
 */

public class Circle implements Shape {
	private double r = 0;

	public Circle(double r) {
		this.r = r;
	}

	public double getR() {
		return this.r;
	}

	public double getArea() {
		return (3.14 * this.r * this.r);
	}

	public double getCircumference() {
		return 2 * 3.14 * this.r;
	}
}
