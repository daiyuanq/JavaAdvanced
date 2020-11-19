/**  
* @Title: Triangle.java
* @Package com.daiinfo.javaadvanced.know1.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月6日 下午9:22:46
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know1.example;

/**
* @ClassName: Triangle
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月6日下午9:22:46
*/

public class Triangle implements Shape {

	private double a = 0;
	private double b = 0;
	private double c = 0;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return this.a;
	}

	public double getB() {
		return this.b;
	}

	public double getC() {
		return this.c;
	}

	public double getArea() {
		// 根据海伦公式求三角形的面积
		double p = (a + b + c) / 2;
		return Math.pow(p * (p - a) * (p - b) * (p - c), 0.5);
	}

	public double getCircumference() {
		return this.a + this.b + this.c;
	}
}
