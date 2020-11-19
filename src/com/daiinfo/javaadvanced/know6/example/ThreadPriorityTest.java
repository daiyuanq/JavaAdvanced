/**  
* @Title: ThreadPri.java
* @Package com.daiinfo.javaadvanced.know6.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月13日 下午4:28:38
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know6.example;

/**
* @ClassName: ThreadPri
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月13日下午4:28:38
*/

public class ThreadPriorityTest {
	public static void main(String[] args) {

		// 创建三个线程对象
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		MyThread mt3 = new MyThread();

		// 调用方法设置线程名称
		mt1.setName("哈士奇");
		mt2.setName("萨摩耶");
		mt3.setName("短尾猫");

		// 获取默认优先级 结果都是5，证明系统默认的线程优先级是5
		System.out.println(mt1.getName() + mt1.getPriority());
		System.out.println(mt2.getName() + mt2.getPriority());
		System.out.println(mt3.getName() + mt3.getPriority());

		// 设置线程优先级
		// 数字越大的优先级越高。但是，优先级高只是意味着该线程获取的 CPU 时间片相对多一些。并不是说是先让你走完。
		mt1.setPriority(1);
		mt2.setPriority(6);
		mt3.setPriority(10);

		mt1.start();
		mt2.start();
		mt3.start();
	}

}
