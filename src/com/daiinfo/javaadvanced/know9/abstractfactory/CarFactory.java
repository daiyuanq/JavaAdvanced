package com.daiinfo.javaadvanced.know9.abstractfactory;

import javax.sound.sampled.AudioFileFormat;

public class CarFactory extends AbstractFactory{
	
	@Override
	public Car manufactureCar(String carType) {
		// TODO Auto-generated method stub
				if (carType == null) {
					return null;
				}
				if (carType.equalsIgnoreCase("Bmw")) {
					return new Bmw();
				}
				if (carType.equalsIgnoreCase("Benz")) {
					return new Benz();
				}
				if (carType.equalsIgnoreCase("Audi")) {
					return new Audi();
				}
				return null;
	}

	@Override
	public Engine manufactureEngine(String enginetype) {
		// TODO Auto-generated method stub
		return null;
	}
}
