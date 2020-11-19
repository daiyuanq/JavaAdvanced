/**  
* @Title: PrimeThreadTest.java
* @Package com.daiinfo.javaadvanced.know6.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月11日 下午7:13:32
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know6.training;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
* @ClassName: PrimeThreadTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月11日下午7:13:32
*/

public class PrimeThreadTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> primeMap=new HashMap<Integer, String>();
		// 初始化Map。产生1~100的随机数，初始其素数为"否"
		for(int i=0;i<3;i++){
			int k=(int)(Math.random()*100);
			primeMap.put(k, "否");
		}
		for(Entry<Integer, String> s:primeMap.entrySet()){
			System.out.println(s.getKey()+"\t"+s.getValue());
		}
		System.out.println("判定以后......");
		PrimeThread pt = new PrimeThread(primeMap);
		Thread t=new Thread(pt);
		t.start();
	}
}
