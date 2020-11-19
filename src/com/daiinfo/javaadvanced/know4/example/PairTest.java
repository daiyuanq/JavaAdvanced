/**  
* @Title: PairTest.java
* @Package com.daiinfo.javaadvanced.know4.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月9日 下午3:21:10
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know4.example;



/**
* @ClassName: PairTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月9日下午3:21:10
*/

public class PairTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建两个Pair的对象，并实现比较
		Pair<String, String> p1 = new Pair<String, String>("name", "zhang");
		Pair<String, String> p2 = new Pair<String, String>("name", "liu");
		BaseInterface utilBase = new PairUtil();
		System.out.println("比较结果：p1=p2\t" + utilBase.compare(p1, p2));

		Pair<String, Integer> p3 = new Pair<String, Integer>("age", 67);
		Pair<String, Integer> p4 = new Pair<String, Integer>("age", 67);
		System.out.println("比较结果：p3=p4\t" + utilBase.compare(p3, p4));

		Pair<Integer, String> p5 = new Pair<Integer, String>(1, "apple");
		Pair<Integer, String> p6 = new Pair<Integer, String>(2, "pear");
		boolean same = utilBase.compare(p5, p6);
		System.out.print("比较结果:p5=p6\t" + same);

	}

}
