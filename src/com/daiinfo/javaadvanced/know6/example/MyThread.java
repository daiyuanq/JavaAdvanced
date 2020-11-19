/**  
* @Title: MyThread.java
* @Package com.daiinfo.javaadvanced.know6.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月13日 下午4:23:13
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know6.example;

/**
* @ClassName: MyThread
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月13日下午4:23:13
*/

public class MyThread extends Thread {
	public void run() {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += i;
		}
		System.out.println(this.getName() + "计算1~100之和是:" + sum);
	}
}
