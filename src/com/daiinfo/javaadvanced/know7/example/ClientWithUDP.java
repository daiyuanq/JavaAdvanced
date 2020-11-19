/**  
* @Title: ClientWithUDP.java
* @Package com.daiinfo.javaadvanced.know7.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月16日 下午11:02:22
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know7.example;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
* @ClassName: ClientWithUDP
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月16日下午11:02:22
*/

public class ClientWithUDP {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 向服务端发送数据
		// 1、定义服务器的数据、地址、端口号
		byte[] data = "用户名：admin;密码：123".getBytes();

		InetAddress address = null;
		try {
			address = InetAddress.getByName("localhost");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int port = 10020;

		// 2、创建数据报，包含发送的数据信息
		DatagramPacket packet = new DatagramPacket(data, data.length, address, port);

		// 3、创建DatagramSocket对象
		DatagramSocket datagramSocket = null;
		try {
			datagramSocket = new DatagramSocket();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 4、向服务器发送数据
		try {
			datagramSocket.send(packet);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 接受服务器端响应数据
		// ======================================
		// 1、创建数据报，用于接受服务器端响应数据
		byte[] data2 = new byte[1024];
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length);

		// 2、接受服务器响应的数据
		try {
			datagramSocket.receive(packet2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String raply = new String(data2, 0, packet2.getLength());
		System.out.println("我是客户端，服务器说：" + raply);

		// 3、关闭资源
		datagramSocket.close();
	}

}
