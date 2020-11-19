package com.daiinfo.javaadvanced.know9.umlet;

public class Triangle extends Shape {
	double a, b, c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double getArea() {
		double p = (a + b + c) / 2;

		if ((a + b) > c && (a + c) > b && (b + c) > c) {

			return Math.sqrt(p * (p - a) * (p - b) * (p - c));

		} else {

			System.out.println("wrong values");
			return -1;

		}
	}

	@Override
	public double getPerimeter() {
		if ((a + b) > c && (a + c) > b && (b + c) > c) {

			return a + b + c;

		} else {

			System.out.println("wrong values");
			return -1;

		}

	}
}
