package com.daiinfo.javaadvanced.know3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
public static Properties getProperties() throws FileNotFoundException, IOException{
	Properties properties=new Properties();
	File file=new File("src/com/daiinfo/javaadvanced/know3/car.properties");
	if(file.exists()){
		properties.load(new FileInputStream(file));
	}else{
		properties.setProperty("benz", "com.daiinfo.javaadvanced.know3.Benz");
		properties.setProperty("bmw", "com.daiinfo.javaadvanced.know3.Bmw");
		properties.setProperty("bike", "com.daiinfo.javaadvanced.know3.Bike");
		//properties.store(new FileOutputStream(file), "CAR CLASS");
	}
	return properties;
}
}
