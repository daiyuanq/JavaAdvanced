/**  
* @Title: UDPReceiver.java
* @Package com.daiinfo.javaadvanced.know7.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月17日 上午9:21:41
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know7.training;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
* @ClassName: UDPReceiver
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月17日上午9:21:41
*/

public class ReceiverWithUDP {

	/**
	 * @throws IOException 
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket dgSocket = new DatagramSocket(10000);

		File file = new File("d:\\123456.mp4");
		// f1.createNewFile();
		FileOutputStream fos = new FileOutputStream(file);
		byte[] buf = new byte[63 * 1024];
		DatagramPacket pkg = new DatagramPacket(buf, buf.length);

		while (true) {
			dgSocket.receive(pkg);
			if (new String(pkg.getData(), 0, pkg.getLength()).equals("end")) {
				System.out.println("文件接收完毕");
				fos.close();
				dgSocket.close();
				break;
			}
			fos.write(pkg.getData(), 0, pkg.getLength());
			fos.flush();
		}
		fos.close();
		dgSocket.close();
	}

}
