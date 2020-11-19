package com.daiinfo.javaadvanced.know9.umlet;

public class Rectangle extends Shape {
	double m, n;

	public Rectangle(double m, double n) {

		this.m = m;
		this.n = n;

	}

	@Override
	public double getArea() {
		return m * n;
	}

	@Override
	public double getPerimeter() {
		return 2 * (m + n);
	}
}
