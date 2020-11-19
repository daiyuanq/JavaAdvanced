package com.daiinfo.javaadvanced.know9.singleton;

/**
 * 懒汉式单例类
 * <p>
 * Title: LazySingleton
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author 戴远泉
 * @date 2020年8月23日 上午9:19:47
 * @version V1.0
 */
public class LazySingleton {
	// 构造器私有化
	private LazySingleton() {
	}

	private static LazySingleton lazySingleton = null;

	/**
	 * 向外部所有对象提供静态实例instance，在外部需要使用的时候才进行实例化
	 * <p>Title: getInstance</p>  
	 * <p>Description: </p>  
	 * @return
	 */
	public synchronized static LazySingleton getInstance() {
		if (lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}
	
	public void showMessage(){
		System.out.println("你好！你正在使用懒汉式单例模式的实例。");
	}
}
