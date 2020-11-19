/**  
* @Title: UDPClient.java
* @Package com.daiinfo.javaadvanced.know7.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月17日 上午8:31:39
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know7.training;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;

import javax.swing.JFileChooser;

/**
* @ClassName: UDPClient
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月17日上午8:31:39
*/

public class ClientWithUDP {
	private static final String SEND_FILE_PATH = "D:\\自由式摔跤积分制规则.mp4";

	public static void main(String[] args) {
		// 获取当前时间并显示
		long startTime = System.currentTimeMillis();
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String startTimeStr = dateformat.format(startTime);
		System.out.println("开始时间：" + startTimeStr);

		byte[] buf = new byte[UDPUtils.BUFFER_SIZE];
		byte[] receiveBuf = new byte[1];

		RandomAccessFile accessFile = null;
		DatagramPacket dpk = null;
		DatagramSocket dsk = null;
		int readSize = -1;
		try {
			accessFile = new RandomAccessFile(SEND_FILE_PATH, "r");
			dpk = new DatagramPacket(buf, buf.length,
					new InetSocketAddress(InetAddress.getByName("localhost"), UDPUtils.PORT + 1));
			dsk = new DatagramSocket(UDPUtils.PORT, InetAddress.getByName("localhost"));
			int sendCount = 0;
			while ((readSize = accessFile.read(buf, 0, buf.length)) != -1) {
				dpk.setData(buf, 0, readSize);
				dsk.send(dpk);
				// wait server response
				{
					while (true) {
						dpk.setData(receiveBuf, 0, receiveBuf.length);
						dsk.receive(dpk);

						// confirm server receive
						if (!UDPUtils.isEqualsByteArray(UDPUtils.successData, receiveBuf, dpk.getLength())) {
							System.out.println("resend ...");
							dpk.setData(buf, 0, readSize);
							dsk.send(dpk);
						} else {
							break;
						}
					}
				}

				System.out.println("send count of " + (++sendCount) + "!");
			}
			// send exit wait server response
			while (true) {
				System.out.println("client send exit message ....");
				dpk.setData(UDPUtils.exitData, 0, UDPUtils.exitData.length);
				dsk.send(dpk);

				dpk.setData(receiveBuf, 0, receiveBuf.length);
				dsk.receive(dpk);
				// byte[] receiveData = dpk.getData();
				if (!UDPUtils.isEqualsByteArray(UDPUtils.exitData, receiveBuf, dpk.getLength())) {
					System.out.println("client Resend exit message ....");
					dsk.send(dpk);
				} else
					break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (accessFile != null)
					accessFile.close();
				if (dsk != null)
					dsk.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		long endTime = System.currentTimeMillis();
		String endTimeStr = dateformat.format(endTime);
		System.out.println("结束时间：" + endTimeStr);
		System.out.println("传输大文件共耗时：" + (endTime - startTime));
	}
}
