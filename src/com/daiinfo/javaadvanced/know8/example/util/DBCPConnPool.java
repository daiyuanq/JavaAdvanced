/**  
* @Title: DBCPConnPool.java
* @Package com.daiinfo.javaadvanced.know8.example.util
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月14日 下午9:37:55
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know8.example.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

/**
* @ClassName: DBCPConnPool
* @Description: DBCP配置类
* @author 戴远泉
* @date 2020年11月14日下午9:37:55
*/

public class DBCPConnPool {
	private static Properties properties = new Properties();
	private static DataSource dataSource;

	// 加载DBCP配置文件
	static {
		try {
			FileInputStream is = new FileInputStream("config/dbcp.properties");
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			dataSource = BasicDataSourceFactory.createDataSource(properties);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 从连接池中获取一个连接
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void main(String[] args) {
		
		try {
			System.out.println(getConnection().getCatalog());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
