/**  
* <p>Title: Fruitage.java</p>  
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
 * Title: Fruitage
 * </p>
 * <p>
 * Description: 具体产品,水果类
 * </p>
 * 
 * @author 戴远泉
 * @date 2020年11月3日
 * @version V1.0
 */
public class Fruitage implements Plant {
	String floristics;// 植物种类

	public Fruitage() {
		// TODO Auto-generated constructor stub
		floristics = "水果";
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("种植..." + floristics);
	}
}
