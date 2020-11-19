/**  
* @Title: ShapeTest.java
* @Package com.daiinfo.javaadvanced.know1.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月6日 下午9:23:25
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know1.example;

import java.util.Scanner;

/**
* @ClassName: ShapeTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月6日下午9:23:25
*/

public class ShapeTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		double height = 0;
		double width = 0;
		do {
			System.out.println("请输入圆的半径r：");
			r = input.nextDouble();
			if (r <= 0) {
				System.out.print("输入错误!! ");
			}
		} while (r <= 0);
		do {
			System.out.println("请输入三角形的三条边a、b、c：");
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
			if (a < 0 || b < 0 || c < 0 || a + b <= c || a - b >= c) {
				System.out.print("输入错误!!!");
			}
		} while ((a < 0 || b < 0 || c < 0 || a + b <= c || a - b >= c));
		do {
			System.out.println("请输入矩形的长和宽height、width：");
			height = input.nextDouble();
			width = input.nextDouble();
			if (height <= 0 || width <= 0) {
				System.out.print("输入错误!!!");
			}
		} while (height <= 0 || width <= 0);
		Circle C = new Circle(r);
		Triangle T = new Triangle(a, b, c);
		Rectangle R = new Rectangle(height, width);
		System.out.println("******圆*******");
		System.out.println("半径: " + C.getR());
		System.out.println("面积 : " + C.getArea());
		System.out.println("周长 : " + C.getCircumference());
		System.out.println("*******三角形*******");
		System.out.println("三边为: " + T.getA() + "," + T.getB() + "," + T.getC());
		System.out.println("面积 : " + T.getArea());
		System.out.println("周长 : " + T.getCircumference());
		System.out.println("*******矩形*******");
		System.out.println("长: " + R.getHeight());
		System.out.println("宽: " + R.getWidth());
		System.out.println("面积 : " + R.getArea());
		System.out.println("周长 : " + R.getCircumference());

	}
}
