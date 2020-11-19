/**  
* @Title: PointUtil.java
* @Package com.daiinfo.javaadvanced.know4.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月9日 下午6:07:23
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know4.training;

/**
* @ClassName: PointUtil
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月9日下午6:07:23
*/

public class PointUtil {
	public static <T,S> boolean compare(Point<T, S> p1, Point<T, S> p2) {
		return (p1.getX()==p2.getX())&&(p1.getY()==p2.getY());

	}
}
