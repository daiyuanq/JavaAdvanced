/**  
* @Title: ThreadUserdTest.java
* @Package com.daiinfo.javaadvanced.know6.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月13日 下午2:48:37
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know6.example;

/**
* @ClassName: ThreadUserdTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月13日下午2:48:37
*/

public class ThreadUserdTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建杨辉三角形的线程对象
		PascalTriangleThread ptt = new PascalTriangleThread();
		// 设置线程的名称
		ptt.setName("打印杨辉三角形线程");
		// 线程启动
		ptt.start();
		
		// 创建斐波那契数列的线程对象
		FibonacciThread ft=new FibonacciThread();
		Thread t=new Thread(ft);
		// 线程启动
		t.start();
	}

}
