/**  
* <p>Title: ConcreteFactoryA.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: www.daiinfo.net</p>  
* @author 戴远泉
* @date 2020年11月3日 
* @version 1.0  
*/ 
package com.daiinfo.javaadvanced.know9.abstractfactory.example;

/**  
* <p>Title: WuhanFarm</p>  
* <p>Description: 具体工厂,武汉农场类,此农场养牛、种植蔬菜</p>  
* @author 戴远泉 
* @date 2020年11月3日
* @version V1.0  
*/
public class WuhanFarm implements Farm {
	
	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		System.out.println("新牛出生！");
		return new Cattle();
	}

	@Override
	public Plant createPlant() {
		// TODO Auto-generated method stub
		System.out.println("蔬菜长成！");
        return new Vegetables();
	}
}
