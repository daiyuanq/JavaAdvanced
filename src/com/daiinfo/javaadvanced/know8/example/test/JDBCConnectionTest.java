/**  
* @Title: ConnectionTest.java
* @Package com.daiinfo.javaadvanced.know8.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月14日 下午8:13:24
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know8.example.test;

import java.sql.SQLException;

import com.daiinfo.javaadvanced.know8.example.util.DBManager;

/**
* @ClassName: ConnectionTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月14日下午8:13:24
*/

public class JDBCConnectionTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.print(DBManager.getConn().getCatalog());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
