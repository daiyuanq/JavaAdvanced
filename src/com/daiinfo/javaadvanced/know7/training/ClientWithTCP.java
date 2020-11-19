/**  
* @Title: ClientWithTCP.java
* @Package com.daiinfo.javaadvanced.know7.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月17日 下午8:55:03
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know7.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
* @ClassName: ClientWithTCP
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月17日下午8:55:03
*/

public class ClientWithTCP {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.创建客户端Socket对象
		Socket socket = null;
		try {
			socket = new Socket("localhost", 9001);

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		
		// 2.获得输出流
		OutputStream out=null;
		try {
			out = socket.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 3.关联发送文件
		File file = new File("D:\\自由式摔跤积分制规则.mp4");
		// 获取文件完整名称
		String fileFullName = file.getName();
		// 将文件名按照.来分割，因为.是正则表达式中的特殊字符，因此需要转义
		String[] fileName = fileFullName.split("\\.");
		// 文件扩展名
		String fileExtensionName = fileName[fileName.length - 1];
		
		// 4.将文件内容写入输出流
		byte[] buf = new byte[1024];
		int len=0;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// 从文件中读数据fis.read(buf)
		// 然后写入输出流out.write(buf,0,len)
		try {
			while((len=fis.read(buf))!=-1){
				out.write(buf,0,len);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 关闭流
		try {
			out.close();
			fis.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("文件发送完毕！");
	}

}
