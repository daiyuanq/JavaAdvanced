/**  
* @Title: TicketLobbyTest.java
* @Package com.daiinfo.javaadvanced.know6.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月13日 下午4:42:42
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know6.example;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
* @ClassName: TicketLobbyTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月13日下午4:42:42
*/

public class TicketLobbyTest {
	public static void main(String[] args) {
		// 初始化票池：<票编号,是否已出售>
		Map<String, Boolean> ticketMap = new HashMap<String, Boolean>();
		// 生成1000张火车票到票池
		for (int i = 1; i <= 1000; i++) {
			ticketMap.put("T" + i, false);
		}

				
		// 生成4个售票窗口
		TicketWindow s1 = new TicketWindow(ticketMap, "张三");
		TicketWindow s2 = new TicketWindow(ticketMap, "李四");
		TicketWindow s3 = new TicketWindow(ticketMap, "王五");
		TicketWindow s4 = new TicketWindow(ticketMap, "何六");

		// 每个窗口创建一个线程
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		Thread t3 = new Thread(s3);
		Thread t4 = new Thread(s4);

		// Java通过Executors提供一个可缓存线程池
		ExecutorService service = Executors.newCachedThreadPool();
		service.execute(t1);
		service.execute(t2);
		service.execute(t3);
		service.execute(t4);

		// 执行完线程池中的线程后尽快退出
		service.shutdown();
	}
}


