package com.daiinfo.javaadvanced.know9.observerpattern;

/**
* 抽象观察者 
* <p>Title: Observer</p>  
* <p>Description:定义了一个update()方法，当被观察者调用notifyObserverList()方法时，观察者的update()方法会被回调。 </p>  
* @author 戴远泉 
* @date 2020年8月24日 下午11:29:59
* @version V1.0
 */
public interface Observer {
	// method to update the observer, used by subject
	public void update(String message);
}
