package com.daiinfo.javaadvanced.know9.abstractfactory;

public class FactoryProducer {
	/**
	 * 根据工厂类型获取具体工厂
	 * <p>Title: getFactory</p>  
	 * <p>Description: </p>  
	 * @param factoryType
	 * @return
	 */
	public static AbstractFactory getFactory(String factoryType) {
		if (factoryType.equalsIgnoreCase("Car")) {
			return new CarFactory();
		} else if (factoryType.equalsIgnoreCase("Engine")) {
			return new EngineFactory();
		}
		return null;
	}
}
