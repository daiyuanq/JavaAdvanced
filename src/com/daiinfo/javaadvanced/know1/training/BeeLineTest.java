/**  
* @Title: BeeLineTest.java
* @Package com.daiinfo.javaadvanced.know1.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月6日 下午9:15:58
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know1.training;

/**
* @ClassName: BeeLineTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月6日下午9:15:58
*/

public class BeeLineTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(3, 6);
		Point p2 = new Point(9, 6);

		BeeLine l1 = new BeeLine(p1, p2);

		Point p3 = new Point(6, 2);
		Point p4 = new Point(6, 8);

		BeeLine l2 = new BeeLine(p3, p4);

		System.out.println("l1的长度：" + l1.getDistance());
		System.out.println("l2的长度：" + l2.getDistance());
		System.out.println("l1和l2相交：" + l1.isIntersect(l2));

		Point p = new Point(7, 4);

		System.out.println(l1.pLineDistance(p));

		System.out.println(l2.pLineDistance(p));
	}
}
