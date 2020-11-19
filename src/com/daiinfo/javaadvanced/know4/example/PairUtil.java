/**  
* @Title: PairUtil.java
* @Package com.daiinfo.javaadvanced.know4.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月9日 下午3:18:18
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know4.example;

/**
* @ClassName: PairUtil 
* @Description: Pair功能类，实现Baseinterface接口，并实现compare()比较方法
* @author 戴远泉
* @date 2020年11月9日下午3:18:18
*/

public class PairUtil implements BaseInterface {
	@Override
	public <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		// TODO Auto-generated method stub
		return (p1.getKey().equals(p2.getKey())) && (p1.getValue().equals(p2.getValue()));
	}
}
