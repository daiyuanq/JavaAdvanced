package com.daiinfo.javaadvanced.know9.observerpattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.首先创建一个主题，注册多个用户。该主题发布一条消息，每个用户都收到消息。
		// 创建主题
		Topic topic = new Topic();

		// 创建观察者
		Observer user1 = new Subscriber("张三");
		Observer user2 = new Subscriber("李四");
		Observer user3 = new Subscriber("王五");

		// 该主题注册观察者
		topic.register(user1);
		topic.register(user2);
		topic.register(user3);

		// 该主题更新消息
		topic.setInfomation("Python是世界上最好用的语言！");

		// 2.该主题注销某个用户譬如张三，之后再发布消息，
		// 此时用户张三已经收不到消息，其他用户还是正常能收到推送消息。
		System.out.println("----------------------------------------------");
		// 该主题注销user1用户
		topic.logout(user1);
		// 该主题更新消息
		topic.setInfomation("JAVA是世界上最好用的语言！");
	}

}
