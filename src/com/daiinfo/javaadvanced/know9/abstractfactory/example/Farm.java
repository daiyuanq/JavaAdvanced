/**  
* <p>Title: AbstractFactory.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: www.daiinfo.net</p>  
* @author 戴远泉
* @date 2020年11月3日 
* @version 1.0  
*/ 
package com.daiinfo.javaadvanced.know9.abstractfactory.example;

/**  
* <p>Title: Farm</p>  
* <p>Description: 抽象工厂,农场类</p>  
* @author 戴远泉 
* @date 2020年11月3日
* @version V1.0  
*/
public interface Farm {
	public Animal createAnimal(); // 驯养动物
    public Plant createPlant();   // 种植植物
}
