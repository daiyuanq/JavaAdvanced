/**  
* <p>Title: JiujiangFarm.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: www.daiinfo.net</p>  
* @author 戴远泉
* @date 2020年11月3日 
* @version 1.0  
*/ 
package com.daiinfo.javaadvanced.know9.abstractfactory.example;

/**  
* <p>Title: JiujiangFarm</p>  
* <p>Description: 具体工厂,九江农场类。此农场养马、种植水果</p>  
* @author 戴远泉 
* @date 2020年11月3日
* @version V1.0  
*/
public class JiujiangFarm implements Farm{

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		System.out.println("新马出生！");
        return new Horse();
	}

	@Override
	public Plant createPlant() {
		// TODO Auto-generated method stub
		System.out.println("水果长成！");
        return new Fruitage();
	}
}
