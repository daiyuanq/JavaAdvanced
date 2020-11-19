/**  
* @Title: PrimeThread.java
* @Package com.daiinfo.javaadvanced.know6.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月11日 下午7:11:41
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know6.training;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
* @ClassName: PrimeThread
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月11日下午7:11:41
*/

public class PrimeThread implements Runnable {
	Map<Integer, String> map = new HashMap<Integer, String>();

	public PrimeThread(Map<Integer, String> map) {
		this.map = map;
	}

	@Override
	public void run() {
		Set<Integer> keySet = map.keySet();
		for (int k : keySet) {
			if (PrimeUtil.isPrime(k) == true) {
				map.put(k, "是");
			}
		}
		for (int k : map.keySet()) {
			System.out.println(k + "\t" + map.get(k));
		}
	}
}
