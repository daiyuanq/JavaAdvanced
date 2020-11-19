/**  
* @Title: Point.java
* @Package com.daiinfo.javaadvanced.know1.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月6日 下午9:12:35
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know1.training;

/**
* @ClassName: Point
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月6日下午9:12:35
*/

public class Point {
	private int x;
	int y;

	public Point() {

	}

	/**
	 * 
	  * Description: 创建一个新的实例 Point.
	  * @param i
	  * @param j
	 */
	public Point(int i, int j) {
		// TODO Auto-generated constructor stub
		x = i;
		y = j;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
