/**  
* @Title: BaseInterface.java
* @Package com.daiinfo.javaadvanced.know4.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月9日 下午3:17:32
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know4.example;

/**
* @ClassName: BaseInterface
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月9日下午3:17:32
*/

public interface BaseInterface {
	public <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2);
}
