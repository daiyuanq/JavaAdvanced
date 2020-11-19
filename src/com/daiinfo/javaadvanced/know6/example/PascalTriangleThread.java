/**  
* @Title: PascalTriangleThread.java
* @Package com.daiinfo.javaadvanced.know6.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月13日 下午2:43:13
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know6.example;

/**
* @ClassName: PascalTriangleThread
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月13日下午2:43:13
*/

public class PascalTriangleThread extends Thread {
	/**
	 * 
	* @Title: printPascalTriangle
	* @Description: 打印杨辉三角形，Pascal‘s Triangle
	* @param 
	* @return void
	* @throws
	 */
	public  void printPascalTriangle() {
		System.out.println("杨辉三角形：");
		int[][] array = new int[10][10];// 三角形数组
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					array[i][j] = 1;
				} else {
					array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
				}
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();// 换行
		}
	}
	
	public void run(){
		printPascalTriangle();
	}
}
