/**  
* @Title: BankAccountTest.java
* @Package com.daiinfo.javaadvanced.know6.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月12日 上午10:35:16
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know6.training;

import java.time.LocalDateTime;

/**
* @ClassName: BankAccountTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月12日上午10:35:16
*/

public class BankAccountTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		// 1.使用非同步方法
		BankAccountNotSync account = new BankAccountNotSync(20200978, 10);
		BankUser user1=new BankUser("张三", account);
		BankUser user2=new BankUser("张四",account);
		Thread t1=new Thread(user1);
		Thread t2=new Thread(user2);
		t1.start();
		t2.start();
		System.out.println(LocalDateTime.now());
		*/
		
		// 2.使用同步方法
		BankAccountWithSyncMethod account = new BankAccountWithSyncMethod(20200978, 10);
		BankUser user1=new BankUser("张三", account);
		BankUser user2=new BankUser("张四",account);
		Thread t1=new Thread(user1);
		Thread t2=new Thread(user2);
		t1.start();
		t2.start();
		
		// 3.使用同步块
		// 4.使用Volatile
		// 5.使用ReentrantLock
		
	}

}
