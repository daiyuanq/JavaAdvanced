/**  
* @Title: BankAccount.java
* @Package com.daiinfo.javaadvanced.know6.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月12日 上午8:41:55
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know6.training;

import java.time.LocalDateTime;
import java.util.Date;

/**
* @ClassName: BankAccount
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月12日上午8:41:55
*/

public class BankAccountNotSync {
	int id;// 账号
	double balance;// 余额

	/**
	 * 
	  * Description: 创建一个新的实例 BankAccount.
	 */
	public BankAccountNotSync() {

	}

	/**
	 * 
	  * Description: 创建一个新的实例 BankAccount.
	  * @param id
	  * @param balance
	 */
	public BankAccountNotSync(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * 
	* @Title: drawAccount
	* @Description: 取钱
	* @param @param amount，金额
	* @return void
	* @throws
	 */
	public boolean drawAccount(double amount) {
		// 账户上要保留10元
		if(balance<amount+10){
			System.out.println("余额不足！");
			return false;
		}
		balance = balance - amount;
		return true;
	}

	/**
	 * 
	* @Title: depositAccount
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param amount,金额
	* @param @return 返回余额
	* @return double
	* @throws
	 */
	public boolean depositAccount(double amount) {
		 balance = balance + amount;
		 return true;
	}

	@Override
	public String toString() {
		return LocalDateTime.now()+"银行账户:[" + "账号:" + id + "\t" + "余额:" + balance + "]";

	}
}
