/**  
* @Title: SocketClient.java
* @Package com.daiinfo.javaadvanced.know7.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月16日 下午8:34:13
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
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
* @ClassName: SocketClient
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月16日下午8:34:13
*/

public class ClientWithTCP extends JFrame {

	private PrintWriter writer; // 声明PrintWriter类对象
	private BufferedReader reader; // 声明BufferedReader对象
	private Socket socket; // 声明客户端Socket对象
	private JTextArea jtaShow; // 显示信息的多行文本框
	private JTextField jtfSend; // 发送信息的单行文本框

	/**
	 * 
	  * Description: 创建一个新的实例 SocketClient,初始化界面
	 */
	public ClientWithTCP() {
		super();
		setTitle("客户端程序");
		setBounds(100, 100, 361, 257);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 窗体采用上（顶部）、中（中部）、下（底部）布局
		// 布局顶部。顶部面板包含一个大标题
		final JPanel panel1 = new JPanel();
		getContentPane().add(panel1, BorderLayout.NORTH);
		final JLabel label1 = new JLabel();
		label1.setForeground(new Color(0, 0, 255));
		label1.setFont(new Font("", Font.BOLD, 22));
		label1.setText("Client/Server间聊天程序——客户端程序");
		panel1.add(label1);
		
		// 布局中部。中部面板包含一个滚动面板，滚动面板上设置一个多行文本框，用于显示发送和接受的消息
		final JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		jtaShow = new JTextArea();
		scrollPane.setViewportView(jtaShow);
		
		// 布局底部。底部面板包含一个标签，一个单行文本框，一个按钮。
		final JPanel panel2 = new JPanel();
		getContentPane().add(panel2, BorderLayout.SOUTH);
		final JLabel label2 = new JLabel("客户端发送的信息：");
		panel2.add(label2);
		
		jtfSend = new JTextField();
		jtfSend.setPreferredSize(new Dimension(140, 25));
		panel2.add(jtfSend);
		
		final JButton button = new JButton("发  送");
		panel2.add(button);
		// "发送"按钮响应单击事件处理，单击按钮即发送消息
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// 将要发送的文本框中信息写入输出流
				writer.println(jtfSend.getText()); 
				// 同时将要发送的文本框中信息显示在多行文本框中
				jtaShow.append("客户端发送的信息是：" + jtfSend.getText() + "\n"); 
				// 将单行文本框清空
				jtfSend.setText(""); 
			}
		});
	}

	/**
	 * 
	* @Title: connect
	* @Description: 请求与服务端的连接
	* @param 
	* @return void
	* @throws
	 */
	private void setConnect() {
		jtaShow.append("尝试连接......\n"); 
		// 捕捉异常
		try { 
			// 创建流套接字并将其连接到指定IP地址的指定端口号。
			socket = new Socket("127.0.0.1", 1978); 
			while (true) {
				// 1.客户端发送消息
				// 返回此套接字的输出流
				OutputStream os=socket.getOutputStream();
				
				// 从现有的OutputStream创建一个新的PrintWriter。
				// 将对象的格式表示打印到文本输出流。
				writer = new PrintWriter(os, true);
				
				// 2.客户端接受消息
				// 客户端也可接受来自服务端的消息。此时客户端是输入流。
				// 返回此套接字的输入流
				InputStream is=socket.getInputStream();
				
				// InputStreamReader是从字节流到字符流的桥：它读取字节，并使用指定的charset将其解码为字符 。
				// 它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集。 
				InputStreamReader isr=new InputStreamReader(is);
				
				// 从字符输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取。
				// 可以指定缓冲区大小，或者可以使用默认大小。 默认值足够大，可用于大多数用途。
				// 没有缓冲，每次调用read（）或readLine（）可能会导致从文件中读取字节，转换成字符，然后返回，这可能非常低效。
				reader = new BufferedReader(isr); // 实例化BufferedReader对象
				
				jtaShow.append("完成连接。\n"); // 文本域中提示信息
				
				// 从reader中获取消息
				getServerInfo();
			}
		} catch (Exception e) {
			e.printStackTrace(); // 输出异常信息
		}
	}

	/**
	 * 
	* @Title: getServerInfo
	* @Description: 接受服务器端的数据
	* @param 
	* @return void
	* @throws
	 */
	private void getServerInfo() {
		try {
			while (true) {
				if (reader != null) {
					String line = reader.readLine();// 读取服务器发送的信息
					if (line != null)
						jtaShow.append("接收到服务器发送的信息：" + line + "\n"); // 显示服务器端发送的信息
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
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

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建客户端对象，调用构造函数初始化界面
		ClientWithTCP client = new ClientWithTCP();
		client.setVisible(true);
		// 请求与服务端的连接
		client.setConnect();

	}

}
