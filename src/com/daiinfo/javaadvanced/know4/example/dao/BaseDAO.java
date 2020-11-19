/**  
* @Title: BaseDAO.java
* @Package com.daiinfo.javaadvanced.know4.example.dao
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月10日 上午9:26:12
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know4.example.dao;

import java.util.ArrayList;

/**
* @ClassName: BaseDAO
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月10日上午9:26:12
*/

public interface BaseDAO<T> {

	/**
	* @Title: findAll
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param t
	* @param @return
	* @return ArrayList<T>
	* @throws
	*/
	public boolean add(T t);// 添加

	public ArrayList<T> findAll();// 查询所有

	public T findById(int id);// 根据表的id查询记录

	public boolean delete(int id);// 根据表的id删除记录

	public boolean update(T t);// 更新
}
