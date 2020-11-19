/**  
* @Title: Point.java
* @Package com.daiinfo.javaadvanced.know4.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月9日 下午6:04:13
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know4.training;

/**
* @ClassName: Point
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月9日下午6:04:13
*/

public class Point<T, S> {
	T x;
	S y;

	public Point(T t, S s) {
		x = t;
		y = s;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public S getY() {
		return y;
	}

	public void setY(S y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point[" + x + "," + y + "]";
	}
	
	public void printPoint() {
		// TODO Auto-generated method stub
		System.out.println("点的横坐标是"+getX()+","+"纵坐标是"+getY());
	}
}
