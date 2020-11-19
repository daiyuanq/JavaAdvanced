/**  
* @Title: ThreadState.java
* @Package com.daiinfo.javaadvanced.know6.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月13日 下午4:15:55
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know6.example;



/**
* @ClassName: ThreadState
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月13日下午4:15:55
*/

public class ThreadState implements Runnable {
    public synchronized void waitForASecond() throws InterruptedException {
        wait(500); // 使当前线程等待0.5秒或其他线程调用notify()或notifyAll()方法
    }
    
    public synchronized void waitForYears() throws InterruptedException {
        wait(); // 使当前线程永久等待，直到其他线程调用notify()或notifyAll()方法
    }
    
    public synchronized void notifyNow() throws InterruptedException {
        notify(); // 唤醒由调用wait()方法进入等待状态的线程
    }
    
    public void run() {
        try {
            waitForASecond(); // 在新线程中运行waitForASecond()方法
            waitForYears(); // 在新线程中运行waitForYears()方法
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}