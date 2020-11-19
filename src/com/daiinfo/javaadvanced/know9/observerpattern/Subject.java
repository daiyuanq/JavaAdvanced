package com.daiinfo.javaadvanced.know9.observerpattern;

/**
 * <p> Title: Subject  </p>
 * <p> Description: 抽象主题，即抽象被观察者，声明了注册、注销、通知观察者方法</p>
 * @author 戴远泉
 * @date 2020年8月24日 下午11:21:07
 * @version V1.0
 */
public interface Subject {

	// 注册观察者
	public void register(Observer obj);

	// 注销观察者
	public void logout(Observer obj);

	// 通知所有观察者
	public void notifyObserverList();

}
