package com.daiinfo.javaadvanced.know9.observerpattern;

/**
 * 
* <p>Title: Subscriber</p>  
* <p>Description:具体观察者， 实现了update方法</p>  
* @author 戴远泉 
* @date 2020年8月24日 下午11:35:02
* @version V1.0
 */
public class Subscriber implements Observer {
	private String name;
	private String message;

	public Subscriber(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		this.message = message;
		read();
	}

	public void read() {
		System.out.println(name + " 收到推送消息： " + message);
	}

}
