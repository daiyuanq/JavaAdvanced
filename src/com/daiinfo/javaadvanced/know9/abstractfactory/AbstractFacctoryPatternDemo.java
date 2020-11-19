package com.daiinfo.javaadvanced.know9.abstractfactory;

public class AbstractFacctoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 生产发动机
		// 获取工厂类的对象
		AbstractFactory engineFactory = FactoryProducer.getFactory("Engine");
		// 获取产品类的对象
		Engine engine1 = engineFactory.manufactureEngine("HondaEngine");
		// 调用Engine类的对象的made()方法制造发动机
		engine1.made();

		// 2.生产汽车
		// 获取工厂类的对象
		AbstractFactory carFactory = FactoryProducer.getFactory("Car");

		// 获取产品类的对象
		Car car1 = carFactory.manufactureCar("Benz");

		// 调用Engine类的对象的made()方法制造发动机
		car1.made();
	}

}
