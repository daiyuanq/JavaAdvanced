/**  
* @Title: FibonacciThread.java
* @Package com.daiinfo.javaadvanced.know6.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月13日 下午2:55:26
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know6.example;

/**
* @ClassName: FibonacciThread
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月13日下午2:55:26
*/

public class FibonacciThread implements Runnable {
	/**
	 * 
	* @Title: printFibonacci
	* @Description: 打印斐波那契数列
	* @param 
	* @return void
	* @throws
	 */
	public  void printFibonacci() {
		int f[] = new int[20];
		f[0] = 1;
		f[1] = 1;
		for (int i = 2; i < 20; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		System.out.println("斐波那契数列：");
		for (int i = 0; i < 20; i++) {
			if (i % 5 == 0) {
				System.out.println();
			}
			System.out.print(f[i] + "\t");
		}
	}
	/*
	 * @see java.lang.Runnable#run()
	 */

	@Override
	public void run() {
		// TODO Auto-generated method stub
		printFibonacci();
	}
}
