package com.daiinfo.javaadvanced.know9.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
* <p>Title: Topic</p>  
* <p>Description:具体被观察者，即主题。 实现了Subject接口,
* 同时有一个List集合，用以保存注册的观察者，等需要通知观察者时，遍历该集合即可。</p>  
* @author 戴远泉 
* @date 2020年8月24日 下午11:58:22
* @version V1.0
 */
public class Topic implements Subject {
	//注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
    private List<Observer> observersList;
    private String message;
    
    public   Topic() {
		// TODO Auto-generated constructor stub
    	 observersList = new ArrayList<Observer>();
	}
    
	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		observersList.add(o);
	}

	@Override
	public void logout(Observer o) {
		// TODO Auto-generated method stub
		if(!observersList.isEmpty())
            observersList.remove(o);
	}

	@Override
	public void notifyObserverList() {
		// TODO Auto-generated method stub
		for(int i = 0; i < observersList.size(); i++) {
            Observer observer = observersList.get(i);
            observer.update(message);
        }
	}
	
	public void setInfomation(String s) {
        this.message = s;
        System.out.println("此主题服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserverList();
    }
	
}
