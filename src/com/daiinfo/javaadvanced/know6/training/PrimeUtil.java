/**  
* @Title: PrimeUtil.java
* @Package com.daiinfo.javaadvanced.know6.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月11日 下午7:12:29
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know6.training;

/**
* @ClassName: PrimeUtil
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月11日下午7:12:29
*/

public class PrimeUtil {
	/**
	 * 
	* @Title: isPrime
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param m
	* @param @return
	* @return boolean
	* @throws
	 */
	public static boolean isPrime(int m) {
		for (int i = 2; i <= (int) Math.sqrt(m); i++) {
			if (m % i == 0) {
				return false;
			}
		}
		return true;
	}
}
