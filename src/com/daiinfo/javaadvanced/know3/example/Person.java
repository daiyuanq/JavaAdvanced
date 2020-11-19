/**  
* @Title: Person.java
* @Package com.daiinfo.javaadvanced.know3.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月9日 上午11:28:20
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know3.example;

/**
* @ClassName: Person
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月9日上午11:28:20
*/

public class Person {
	public String name;
	public String sex;
	String birthday;

	/**
	 * 
	 * Description: 创建一个新的实例 Person.
	 */
	public Person() {

	}

	/**
	 * 
	 * Description: 创建一个新的实例 Person.
	 * @param name
	 */
	public Person(String name) {
		this.name = name;
	}

	/**
	 * 
	 * Description: 创建一个新的实例 Person.
	 * @param name
	 * @param sex
	 * @param birthday
	 */
	public Person(String name, String sex, String birthday) {
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * 
	* @Title: say
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param 
	* @return void
	* @throws
	 */
	protected void say() {
		System.out.println("你好！");
	}

	/**
	 * 
	* @Title: song
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param songName 歌名
	* @param @param edition  版式，如粤语版。
	* @return void
	* @throws
	 */
	public void song(String songName, String edition) {
		System.out.println(name + "正在试唱：" + songName + "," + edition + "版");
	}

	@Override
	public String toString() {
		return "Person[" + name + "," + sex + "," + birthday + "]";
	}
}
