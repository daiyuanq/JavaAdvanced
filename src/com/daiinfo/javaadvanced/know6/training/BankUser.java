/**  
* @Title: BankUser.java
* @Package com.daiinfo.javaadvanced.know6.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月12日 上午8:53:26
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know6.training;

import java.time.LocalDateTime;
import java.util.Date;

import javax.swing.JOptionPane;

/**
* @ClassName: BankUser
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月12日上午8:53:26
*/

public class BankUser implements Runnable {
	String name;
	// 1.使用非同步方法的银行账号
	// BankAccountNotSync bankAccount;
	// 2.使用同步方法的用户账号
	BankAccountWithSyncMethod bankAccount;

	public BankUser() {

	}

	public BankUser(String name, BankAccountWithSyncMethod bankAccount) {
		this.name = name;
		this.bankAccount = bankAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BankAccountWithSyncMethod getAccount() {
		return bankAccount;
	}

	public void setAccount(BankAccountWithSyncMethod account) {
		this.bankAccount = account;
	}

	/*
	 * @see java.lang.Runnable#run()
	 */

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			int money = (int) (Math.random() * 100);
			if (bankAccount.drawAccount(money)) {
				System.out.println(name + LocalDateTime.now() + "本次取出：" + money);
				System.out.println(name + "操作之后" + bankAccount.toString());
			}
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			money = (int) (Math.random() * 100);
			if (bankAccount.depositAccount(money)) {
				System.out.println(name + LocalDateTime.now() + "本次存入：" + money);
				System.out.println(name + "操作之后" + bankAccount.toString());
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
