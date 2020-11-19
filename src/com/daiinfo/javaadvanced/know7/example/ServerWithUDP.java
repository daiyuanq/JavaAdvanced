/**  
* @Title: ServerWithUDP.java
* @Package com.daiinfo.javaadvanced.know7.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月16日 下午11:00:37
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know7.example;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
* @ClassName: ServerWithUDP
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月16日下午11:00:37
*/

public class ServerWithUDP {
	/**
	 * 
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	 */
	public static void main(String[] args) {
		// 1、创建服务器端DatagramSocket，指定端口
		DatagramSocket datagramSocket = null;
		try {
			datagramSocket = new DatagramSocket(10020);
		} catch (SocketException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// 2、创建数据报，用于接受客户端发送的数据s
		byte[] data = new byte[1024];//
		DatagramPacket packet = new DatagramPacket(data, data.length);

		// 3、接受客户端发送的数据

		try {
			// 此方法在接受数据报之前会一直阻塞
			datagramSocket.receive(packet);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 

		// 4、读取数据
		String info = new String(data, 0, data.length);
		System.out.println("我是服务器，客户端告诉我" + info);

		// =========================================================
		// 向客户端响应数据
		// 1、定义客户端的地址、端口号、数据
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		byte[] data2 = "欢迎您！".getBytes();

		// 2、创建数据报，包含响应的数据信息
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length, address, port);
		// 3、响应客户端
		try {
			datagramSocket.send(packet2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 4、关闭资源
		datagramSocket.close();
	}

}
