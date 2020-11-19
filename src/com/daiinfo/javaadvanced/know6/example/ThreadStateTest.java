/**  
* @Title: ThreadStateTest.java
* @Package com.daiinfo.javaadvanced.know6.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月13日 下午4:16:40
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know6.example;



/**
* @ClassName: ThreadStateTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月13日下午4:16:40
*/

public class ThreadStateTest {
	public static void main(String[] args) throws InterruptedException {
        ThreadState state = new ThreadState();// 创建State对象
        Thread thread = new Thread(state);// 利用State对象创建Thread对象
        System.out.println("新建线程：" + thread.getState());// 输出线程状态
        
        thread.start(); // 调用thread对象的start()方法，启动新线程
        System.out.println("启动线程：" + thread.getState());// 输出线程状态
        
        Thread.sleep(100); // 当前线程休眠0.1秒，使新线程运行waitForASecond()方法
        System.out.println("计时等待：" + thread.getState());// 输出线程状态
        
        Thread.sleep(1000); // 当前线程休眠1秒，使新线程运行waitForYears()方法
        System.out.println("等待线程：" + thread.getState());// 输出线程状态
        
        state.notifyNow(); // 调用state的notifyNow()方法
        System.out.println("唤醒线程：" + thread.getState());// 输出线程状态
        
        Thread.sleep(1000); // 当前线程休眠1秒，使新线程结束
        System.out.println("终止线程：" + thread.getState());// 输出线程状态
    }

}
