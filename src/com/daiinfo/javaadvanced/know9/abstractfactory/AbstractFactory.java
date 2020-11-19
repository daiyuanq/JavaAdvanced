package com.daiinfo.javaadvanced.know9.abstractfactory;

public  abstract class AbstractFactory {
	// 根据汽车类型制造汽车
	public abstract Car  manufactureCar(String carType);
	// 根据发动机类型制造发动机
	public abstract Engine  manufactureEngine(String enginetype);
}
