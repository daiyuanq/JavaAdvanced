/**  
* @Title: UDPUtils.java
* @Package com.daiinfo.javaadvanced.know7.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月17日 上午8:43:13
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know7.training;



/**
* @ClassName: UDPUtils
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月17日上午8:43:13
*/

public class UDPUtils {
	
	/** transfer file byte buffer **/
	public static final int BUFFER_SIZE = 50 * 1024;
	
	/** controller port  **/
	public static final int PORT = 50000;
	
	/** mark transfer success **/
	public static final byte[] successData = "success data mark".getBytes();
	
	/** mark transfer exit **/
	public static final byte[] exitData = "exit data mark".getBytes(); 
	
	/**
	 * 
	  * Description: 创建一个新的实例 UDPUtils.
	 */
	private UDPUtils(){
		
	}
	
	/**
	 * 
	* @Title: isEqualsByteArray
	* @Description: compare byteArray equest successData
	* @param @param compareBuf
	* @param @param buf
	* @param @return
	* @return boolean
	* @throws
	 */
	public static boolean isEqualsByteArray(byte[] compareBuf,byte[] buf){
		if (buf == null || buf.length == 0)
			return false;
		
		boolean flag = true;
		if(buf.length == compareBuf.length){
			for (int i = 0; i < buf.length; i++) {
				if(buf[i] != compareBuf[i]){
					flag = false;
					break;
				}
			}
		}else
			return false;
		return flag;
	}
	
	/**
	 * 
	* @Title: isEqualsByteArray
	* @Description: compare byteArray equest successData
	* @param @param compareBuf
	* @param @param buf
	* @param @param len
	* @param @return
	* @return boolean
	* @throws
	 */
	public static boolean isEqualsByteArray(byte[] compareBuf,byte[] buf,int len){
		if (buf == null || buf.length == 0 || buf.length < len || compareBuf.length < len)
			return false;
		
		boolean flag = true;
		
		int innerMinLen = Math.min(compareBuf.length, len);
		//if(buf.length == compareBuf.length){
			for (int i = 0; i < innerMinLen; i++) {  
				if(buf[i] != compareBuf[i]){
					flag = false;
					break;
				}
			}
		//}else 
		//	return false;
		return flag;
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
		byte[] b = new byte[]{1};
		System.out.println(isEqualsByteArray(successData,b));
	}

}
