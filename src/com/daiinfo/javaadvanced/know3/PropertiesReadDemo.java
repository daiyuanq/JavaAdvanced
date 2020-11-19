package com.daiinfo.javaadvanced.know3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//方式一
		InputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream("src/com/daiinfo/javaadvanced/know3/config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties p = new Properties();
		try {
			p.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p.getProperty("args"));
		
		
		//方式二
		InputStream ins = PropertiesReadDemo.class.getResourceAsStream("/com/daiinfo/javaadvanced/know3/config.properties");
		Properties ps = new Properties();
		try {
			ps.load(ins);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ps.getProperty("args"));
		
		//方式三
		InputStream inss = PropertiesReadDemo.class.getClassLoader().getResourceAsStream("./com/daiinfo/javaadvanced/know3/config.properties");
		Properties pss = new Properties();
		try {
			pss.load(inss);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pss.getProperty("args"));
		
		
		//方式四
		InputStream insss = ClassLoader.getSystemResourceAsStream("com/daiinfo/javaadvanced/know3/config.properties");
		Properties psss = new Properties();
		try {
			psss.load(insss);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(psss.getProperty("args"));
	}

}
