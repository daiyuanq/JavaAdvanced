/**  
* @Title: Pair.java
* @Package com.daiinfo.javaadvanced.know4.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月9日 下午3:12:07
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know4.example;

/**
* @ClassName: Pair
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月9日下午3:12:07
*/

public class Pair<K, V> {
	private K key;
	private V value;

	/**
	 * 
	  * Description: 创建一个新的实例 Pair.
	  * @param key
	  * @param value
	 */
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}
