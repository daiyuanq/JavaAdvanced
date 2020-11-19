/**  
* <p>Title: ClientTest.java</p>  
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
 * Title: ClientTest
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author 戴远泉
 * @date 2020年11月3日
 * @version V1.0
 */
public class ClientTest {

	/**
	 * <p>
	 * Title: main
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farm f1, f2;// 两个农场
		Animal a1, a2;// 两种动物
		Plant p1, p2;// 两种植物

		f1 = new WuhanFarm(); // 武汉农场
		f2 = new JiujiangFarm(); // 九江农场

		// 武汉农场养牛、种蔬菜
		a1 = f1.createAnimal();
		p1 = f1.createPlant();

		System.out.println("武汉农场：");
		a1.show();
		p1.show();

		System.out.println("----------");
		// 九江农场养马、种植水果
		a2 = f2.createAnimal();
		p2 = f2.createPlant();
		System.out.println("九江农场：");
		a2.show();
		p2.show();
	}

}
