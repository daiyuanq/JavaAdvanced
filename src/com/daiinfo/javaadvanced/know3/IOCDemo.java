package com.daiinfo.javaadvanced.know3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class IOCDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = CarFactory.getInstance("Benz");
		if (car != null) {
			car.driver();
		}
	}
}
