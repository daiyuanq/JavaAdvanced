/**  
* <p>Title: Horse.java</p>  
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
 * Title: Horse
 * </p>
 * <p>
 * Description:具体产品，马类
 * </p>
 * 
 * @author 戴远泉
 * @date 2020年11月3日
 * @version V1.0
 */
public class Horse implements Animal {
	String breed = null;// (动物)品种

	public Horse() {
		// TODO Auto-generated constructor stub
		breed = "马";
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("驯养..." + breed);
	}
}
