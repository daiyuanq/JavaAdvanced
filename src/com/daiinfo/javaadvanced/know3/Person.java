package com.daiinfo.javaadvanced.know3;

/**
 * 
 * <p>
 * Title: Person
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author 戴远泉
 * @date 2020年7月30日 下午4:41:32
 * @version V1.0
 */
public class Person  {
	public String name;
	int age;
	private long identityCard; // 身份证号
	protected  String sex;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	Person(String name) {
		this.name = name;
	}

	Person(String name, int id) {
		this.name = name;
		identityCard = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(long identityCard) {
		this.identityCard = identityCard;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	protected void say() {
		System.out.println("你好！");
	}

	/**
	 * <p>Title: song</p>  
	 * <p>Description: </p>  
	 * @param songName
	 * @param edition
	 */
	public  void song(String songName, String edition) {
		System.out.println(name + "正在试唱：" + songName + "," + edition + "版");
	}

	@Override
	public String toString() {
		return "Person["+name+","+sex+","+age+"]";

	}
}
