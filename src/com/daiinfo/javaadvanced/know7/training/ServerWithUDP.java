/**  
* @Title: UDPServer.java
* @Package com.daiinfo.javaadvanced.know7.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月17日 上午8:34:47
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know7.training;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
* @ClassName: UDPServer
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月17日上午8:34:47
*/

public class ServerWithUDP {

	private static final String SAVE_FILE_PATH = "d:/2013.mp4";

	public static void main(String[] args) {

		byte[] buf = new byte[UDPUtils.BUFFER_SIZE];

		DatagramPacket dpk = null;
		DatagramSocket dsk = null;
		BufferedOutputStream bos = null;
		try {

			dpk = new DatagramPacket(buf, buf.length,
					new InetSocketAddress(InetAddress.getByName("localhost"), UDPUtils.PORT));
			dsk = new DatagramSocket(UDPUtils.PORT + 1, InetAddress.getByName("localhost"));
			bos = new BufferedOutputStream(new FileOutputStream(SAVE_FILE_PATH));
			System.out.println("wait client ....");
			dsk.receive(dpk);

			int readSize = 0;
			int readCount = 0;
			int flushSize = 0;
			while ((readSize = dpk.getLength()) != 0) {
				// validate client send exit flag
				if (UDPUtils.isEqualsByteArray(UDPUtils.exitData, buf, readSize)) {
					System.out.println("server exit ...");
					// send exit flag
					dpk.setData(UDPUtils.exitData, 0, UDPUtils.exitData.length);
					dsk.send(dpk);
					break;
				}

				bos.write(buf, 0, readSize);
				if (++flushSize % 1000 == 0) {
					flushSize = 0;
					bos.flush();
				}
				dpk.setData(UDPUtils.successData, 0, UDPUtils.successData.length);
				dsk.send(dpk);

				dpk.setData(buf, 0, buf.length);
				System.out.println("receive count of " + (++readCount) + " !");
				dsk.receive(dpk);
			}

			// last flush
			bos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null)
					bos.close();
				if (dsk != null)
					dsk.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
