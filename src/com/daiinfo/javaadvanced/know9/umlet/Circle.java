package com.daiinfo.javaadvanced.know9.umlet;

public class Circle extends Shape{
	double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return Shape.PI * r * r;
	}

	@Override
	public double getPerimeter() {
		return Shape.PI * r * 2;
	}

}
