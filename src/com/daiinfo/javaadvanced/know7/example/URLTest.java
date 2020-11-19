/**  
* @Title: URLTest.java
* @Package com.daiinfo.javaadvanced.know7.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月16日 下午11:21:46
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know7.example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
* @ClassName: URLTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月16日下午11:21:46
*/

public class URLTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s_url = "https://www.sina.com.cn/";
			URL url = new URL(s_url);
			System.out.println(url.getAuthority());// 获得此URL的授权部分
			System.out.println(url.getContent());// 获得此URL的内容
			System.out.println(url.getDefaultPort());// 获得与此URL关联协议的默认端口号
			System.out.println(url.getFile());// 获得此URL的文件名
			System.out.println(url.getHost());// 获得此URL的主机名（如果适用）
			System.out.println(url.getPath());// 获得此URL的路径部分
			System.out.println(url.getPort());// 获得此URL的端口号
			System.out.println(url.getProtocol());// 获得此URL的协议名称
			InputStream in = url.openStream();// 返回读入网站内容的字节输入流
			// 上一句等同于下面两句
			// URLConnection conn = url.openConnection();
			// InputStream in = conn.getInputStream();
			// 转换成带缓冲的字符输入流
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String msg = null;
			// 读取内容，直到为空
			while ((msg = reader.readLine()) != null) {
				// 把内容输出到控制台
				System.out.println(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
