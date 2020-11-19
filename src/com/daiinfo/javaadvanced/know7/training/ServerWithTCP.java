/**  
* @Title: ServerWithTCP.java
* @Package com.daiinfo.javaadvanced.know7.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月17日 下午9:25:03
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know7.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import org.hamcrest.core.Is;

/**
* @ClassName: ServerWithTCP
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月17日下午9:25:03
*/

public class ServerWithTCP {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.建立服务端Socket对象
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(9001);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 2.等待客户端的连接
		// 侦听要连接到此套接字并接受它。 该方法将阻塞直到建立连接。
		Socket socket = null;
		try {
			socket = serverSocket.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 3.获取客户端输入流
		InputStream is=null;
		try {
			is = socket.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 4.新建文件
		File file = new File("D:\\f123.mp4");
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		// 5.将Socket输入流中的信息读入到文件
		byte[] buf=new byte[1024];
		int len=0;
		try {
			while((len=is.read(buf))!=-1){
				fos.write(buf,0,len);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 6.关闭流
		try {
			fos.close();
			is.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		System.out.println("文件接收完毕！");
	}

}
