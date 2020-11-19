/**  
* @Title: TicketWindow.java
* @Package com.daiinfo.javaadvanced.know6.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月13日 下午4:38:37
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know6.example;

import java.util.Iterator;
import java.util.Map;

/**
 * 
* @ClassName: TicketWindow
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月13日下午4:40:33
 */

public class TicketWindow implements Runnable {

	private Map<String, Boolean> ticketMap;// 票池
	private String salerName;// 售票员姓名

	public TicketWindow(Map<String, Boolean> ticketMap, String salerName) {
		this.ticketMap = ticketMap;
		this.salerName = salerName;
	}

	// 售票
	private void saleTicket() {
		for (Iterator<String> it = ticketMap.keySet().iterator();;) {
			// 同步票池
			synchronized (ticketMap) {
				if (it.hasNext()) {
					String ticketNo = it.next();
					if (!ticketMap.get(ticketNo)) {
						System.out.println(salerName + ":" + ticketNo + "已被售出。");
						ticketMap.put(ticketNo, true);
						try {
							// 让当前线程睡眠片刻，使得别的线程有机会执行
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				} else {
					break;
				}
			}
		}
	}

	/*
	 * @see java.lang.Runnable#run()
	 */

	@Override
	public void run() {
		// TODO Auto-generated method stub
		saleTicket();
	}

}
