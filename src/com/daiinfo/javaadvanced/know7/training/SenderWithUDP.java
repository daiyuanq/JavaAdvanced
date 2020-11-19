/**  
* @Title: UDPSender.java
* @Package com.daiinfo.javaadvanced.know7.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月17日 上午9:23:33
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know7.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
* @ClassName: UDPSender
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月17日上午9:23:33
*/

public class SenderWithUDP {

	/**
	 * @throws IOException 
	 * @throws UnknownHostException 
	 * @throws SocketException 
	 * @throws FileNotFoundException 
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket dgSocket = new DatagramSocket(10010, InetAddress.getByName("127.0.0.1"));

		File f2 = new File("d:\\自由式摔跤积分制规则.mp4");
		FileInputStream fis = new FileInputStream(f2);
		byte[] buf = new byte[63 * 1024];
		int len;

		DatagramPacket pkg = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 10000);
		while ((len = fis.read(buf)) != -1) {
			pkg.setLength(len);
			dgSocket.send(pkg);
		}
		System.out.println("文件发送完毕");
		fis.close();
		dgSocket.close();
	}

}
