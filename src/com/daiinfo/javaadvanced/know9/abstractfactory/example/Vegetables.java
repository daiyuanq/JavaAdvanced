/**  
* <p>Title: Vegetables.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: www.daiinfo.net</p>  
* @author 戴远泉
* @date 2020年11月3日 
* @version 1.0  
*/
package com.daiinfo.javaadvanced.know9.abstractfactory.example;

/**
 * <p>
 * Title: Vegetables
 * </p>
 * <p>
 * Description: 具体产品，蔬菜类
 * </p>
 * 
 * @author 戴远泉
 * @date 2020年11月3日
 * @version V1.0
 */
public class Vegetables implements Plant {
	String floristics;// 植物种类

	public Vegetables() {
		// TODO Auto-generated constructor stub
		floristics = "蔬菜";
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("种植..." + floristics);
	}
}
