/**  
* @Title: SocketServer.java
* @Package com.daiinfo.javaadvanced.know7.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月16日 下午8:07:03
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know7.example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
* @ClassName: SocketServer
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月16日下午8:07:03
*/

public class ServerWithTCP extends JFrame {
	private JTextField jtfSend;// 发送信息的单行文本框
	private JTextArea jtaShow;// 显示信息的多行文本框
	private PrintWriter writer; // 声明PrintWriter类对象
	private BufferedReader reader; // 声明BufferedReader对象
	private ServerSocket server; // 服务端套接字对象
	private Socket socket; // 客户端套接字对象

	/**
	 * 
	  * Description: 创建一个新的实例 SocketServer，初始化服务器端界面
	 */
	public ServerWithTCP() {
		super();
		setTitle("服务器端程序");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 260);
		
		// 窗体采用上（顶部）、中（中部）、下（底部）布局
		// 布局顶部。顶部面板包含一个大标题
		final JPanel panel1 = new JPanel();// 顶部面板
		getContentPane().add(panel1, BorderLayout.NORTH);// 顶部面板布局在顶部

		final JLabel label1 = new JLabel("Client/Server间聊天程序——服务器端程序");// 大标题
		label1.setForeground(new Color(0, 0, 255));
		label1.setFont(new Font("", Font.BOLD, 22));
		panel1.add(label1);
		
		// 布局中部。中部面板包含一个滚动面板，滚动面板上设置一个多行文本框，用于显示发送和接受的消息
		final JScrollPane scrollPane = new JScrollPane();// 中部使用滚动面板
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		jtaShow = new JTextArea();
		scrollPane.setViewportView(jtaShow);

		// 布局底部。底部面板包含一个标签，一个单行文本框，一个按钮。
		final JPanel panel2 = new JPanel();// 底部面板
		getContentPane().add(panel2, BorderLayout.SOUTH);

		final JLabel label = new JLabel("服务器发送的信息：");
		panel2.add(label);

		jtfSend = new JTextField();
		jtfSend.setPreferredSize(new Dimension(150, 25));
		panel2.add(jtfSend);

		final JButton button = new JButton("发  送");
		panel2.add(button);
		// "发送"按钮响应单击事件处理，单击按钮即发送消息
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// 将要发送的文本框中信息写入输出流
				writer.println(jtfSend.getText()); 
				// 同时将要发送的文本框中信息显示在多行文本框中
				jtaShow.append("服务器发送的信息是：" + jtfSend.getText() + "\n"); 
				// 将单行文本框清空
				jtfSend.setText(""); 
			}
		});

	}

	/**
	 * 
	* @Title: getServer
	* @Description: 设置服务器服务
	* @param 
	* @return void
	* @throws
	 */
	public void setServer() {
		try {
			server = new ServerSocket(1978); // 实例化服务器端套接字对象，设置端口号为1978
			jtaShow.append("服务器套接字已经创建成功\n"); // 输出信息
			// 如果套接字是连接状态
			while (true) { 
				jtaShow.append("等待客户机的连接......\n"); // 输出信息
				
				// 1.服务器端接受消息
				// accept()方法，侦听要连接到此套接字并接受它。 该方法将阻塞直到建立连接。
				socket = server.accept(); 
				
				// 返回此套接字的字节输入流。
				InputStream is=socket.getInputStream();
				
				// InputStreamReader是从字节流到字符流的桥：它读取字节，并使用指定的charset将其解码为字符 。
				// 它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集。
				InputStreamReader isr=new InputStreamReader(is);
				
				// 从字符输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取。
				// 可以指定缓冲区大小，或者可以使用默认大小。 默认值足够大，可用于大多数用途。
				// 没有缓冲，每次调用read（）或readLine（）可能会导致从文件中读取字节，转换成字符，然后返回，这可能非常低效。
				reader = new BufferedReader(isr); 
				
				// 读取数据
				
				
				
				
				// 2.服务器端发送消息
				// 服务端也可发送消息到客户端。此时服务端是输出流。
				// 返回此套接字的输出流。
				OutputStream os=socket.getOutputStream();
				
				// 从现有的OutputStream创建一个新的PrintWriter。
				// 将对象的格式表示打印到文本输出流。
				writer = new PrintWriter(os, true);
				
				getClientInfo(); // 获取客户端的消息
			}
		} catch (Exception e) {
			e.printStackTrace(); // 输出异常信息
		}
	}

	/**
	 * 
	* @Title: getClientInfo
	* @Description: 获取客户端发送来的消息
	* @param 
	* @return void
	* @throws
	 */
	private void getClientInfo() {
		try {
			while (true) {
				String line = reader.readLine();// 读取客户端发送的信息
				if (line != null)
					jtaShow.append("接收到客户机发送的信息：" + line + "\n"); // 显示客户端发送的信息
			}
		} catch (Exception e) {
			jtaShow.append("客户端已退出。\n"); // 输出异常信息
		} finally {
			try {
				if (reader != null) {
					reader.close();// 关闭流
				}
				if (socket != null) {
					socket.close(); // 关闭套接字
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		// 创建服务器端对象，调用构造函数初始化界面
		ServerWithTCP frame = new ServerWithTCP();
		frame.setVisible(true);
		// 设置服务器端服务
		frame.setServer();
	}

}
