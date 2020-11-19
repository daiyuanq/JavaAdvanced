/**  
* @Title: Rectangle.java
* @Package com.daiinfo.javaadvanced.know1.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月6日 下午9:21:27
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know1.example;

/**
 * 
* @ClassName: Rectangle
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月6日下午9:22:00
 */

public class Rectangle implements Shape {
	public double height = 0;
	public double width = 0;

	/**
	 * 
	  * Description: 创建一个新的实例 Rectangle.
	  * @param height
	  * @param width
	 */
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return this.height;
	}

	public double getWidth() {
		return this.width;
	}

	public double getArea() {
		return this.height * this.width;
	}

	public double getCircumference() {
		return 2 * (this.height + this.width);
	}

}
