/**  
* @Title: PointGenericsTest.java
* @Package com.daiinfo.javaadvanced.know4.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月9日 下午6:12:57
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know4.training;

/**
* @ClassName: PointGenericsTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月9日下午6:12:57
*/

public class PointGenericsTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建Point对象，类型作为类的参数
		Point<Integer, Integer> p1 = new Point<>(10, 20);
		Point<Integer, Integer> p11 = new Point<Integer, Integer>(10, 20);
		Point<Double, Double> p2 = new Point<Double, Double>(10.0, 20.0);
		Point<String, String> p3 = new Point<String, String>("东经:116°23′17〃", "北纬:39°54′27〃");

		// 输出
		System.out.println("点1的坐标：" + p1.getX() + "," + p1.getY());
		System.out.println("点3的坐标：" + p3.getX() + "," + p3.getY());
		p2.printPoint();
		System.out.println(p2.toString());
		// 类型相同的两点才能比较
		// System.out.println(PointUtil.compare(p1, p2));
		// 可以在类Point中设置比较方法
		// p1.compare(p11);
		System.out.println("点1和点11比较：" + PointUtil.compare(p1, p11));
	}

}
