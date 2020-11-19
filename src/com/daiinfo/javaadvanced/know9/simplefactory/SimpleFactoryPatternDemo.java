package com.daiinfo.javaadvanced.know9.simplefactory;

public class SimpleFactoryPatternDemo {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		
		// 生产奥迪
		Car car1 = carFactory.manufactureCar("Audi");
		car1.made();
		
		// 生产宝马
		Car car2=carFactory.manufactureCar("Bmw");
		car2.made();
	}
}
