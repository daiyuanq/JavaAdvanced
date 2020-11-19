package com.daiinfo.javaadvanced.know9.singleton;

/**
 * 饿汉式单例类
 * <p>
 * Title: HungrySingleton
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author 戴远泉
 * @date 2020年8月23日 上午9:11:53
 * @version V1.0
 */
public class HungrySingleton {
	private static final HungrySingleton hungrySingleton;
	// 在类加载的时候就立即初始化，并且创建单例对象
	static {
		hungrySingleton = new HungrySingleton();
	}
	
	// 构造器私有化
	private HungrySingleton(){}
	
	/**
	 * 向外部所有对象提供静态实例instance
	 * <p>Title: getInstance</p>  
	 * <p>Description: </p>  
	 * @return
	 */
	public static HungrySingleton getInstance(){
		return hungrySingleton;
	}
	
	
	public void showMessage(){
		System.out.println("你好！你正在使用饿汉式单例模式的实例。");
	}
}
