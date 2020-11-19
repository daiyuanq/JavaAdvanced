package com.daiinfo.javaadvanced.know3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CarFactory {
	public static Car getInstance(String className) {
		Car car = null;
		Properties properties = new Properties();
		File file = null;
		String fullClassName=null;  // 包含路径的完整类名

		try {
			// 加载配置文件并根据className读取配置文件中指定的类
			file=new File("src/com/daiinfo/javaadvanced/know3/car.properties");
			properties.load(new FileInputStream(file));
			fullClassName=properties.getProperty(className);
			 
			// 加载该类并实例化
			car = (Car) Class.forName(fullClassName).newInstance();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return car;
	}

}
