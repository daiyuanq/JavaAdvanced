package com.daiinfo.javaadvanced.know9.umlet;

/**
 * 抽象类Shape 是其他三个形状的父类 其他三个类要继承重写getArea()和getPerimeter()方法
 *
 */
public abstract class Shape {
	public static final double PI = 3.14;

	public abstract double getArea();

	public abstract double getPerimeter();
}