/**  
* @Title: BeeLine.java
* @Package com.daiinfo.javaadvanced.know1.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月6日 下午9:14:19
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know1.training;

import java.awt.geom.Line2D;

/**
* @ClassName: BeeLine
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月6日下午9:14:19
*/

public class BeeLine {
	Point start;
	Point end;

	public BeeLine() {

	}

	/**
	 * 
	  * Description: 创建一个新的实例 BeeLine.
	  * @param p1
	  * @param p2
	 */
	public BeeLine(Point p1, Point p2) {
		// TODO Auto-generated constructor stub
		start = p1;
		end = p2;
	}

	/**
	 * 
	* @Title: getDistance
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @return
	* @return double
	* @throws
	 */
	public double getDistance() {
		// TODO Auto-generated method stub
		int m2 = (start.getX() - end.getX()) * (start.getX() - end.getX());
		int n2 = (start.getY() - end.getY()) * (start.getY() - end.getY());

		double l = Math.sqrt(m2 + n2);
		return l;

	}

	/**
	 * 
	* @Title: isIntersect
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param l2
	* @param @return
	* @return boolean
	* @throws
	 */
	public boolean isIntersect(BeeLine l2) {
		// TODO Auto-generated method stub
		int arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7;
		arg0 = start.getX();
		arg1 = start.getY();
		arg2 = end.getX();
		arg3 = end.getY();

		arg4 = l2.start.getX();
		arg5 = l2.start.getY();
		arg6 = l2.end.getX();
		arg7 = l2.end.getY();

		if (Line2D.linesIntersect(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	* @Title: pLineDistance
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param p
	* @param @return
	* @return double
	* @throws
	 */
	public double pLineDistance(Point p) {
		// TODO Auto-generated method stub
		return Line2D.ptLineDist(start.getX(), start.getY(), end.getX(), end.getY(), p.getX(), p.getX());
	}
}