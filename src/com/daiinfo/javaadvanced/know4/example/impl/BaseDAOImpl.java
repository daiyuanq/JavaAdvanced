/**  
* @Title: BaseDAOImpl.java
* @Package com.daiinfo.javaadvanced.know4.example.impl
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月10日 下午2:10:57
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know4.example.impl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.daiinfo.javaadvanced.know4.example.dao.BaseDAO;
import com.daiinfo.javaadvanced.know4.example.util.JDBCUtil;

/**
* @ClassName: BaseDAOImpl
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月10日下午2:10:57
*/

public class BaseDAOImpl<T> implements BaseDAO<T> {

	public boolean add1(T t) {
		// TODO Auto-generated method stub
		/*
		 * // 获取传入的泛型类型 Class<T> class1 = (Class<T>) ((ParameterizedType)
		 * getClass() .getGenericSuperclass()).getActualTypeArguments()[0];
		 * System.out.println(class1.getName());
		 */
		boolean flag = false;
		Connection conn = JDBCUtil.getConnection();
		PreparedStatement ps = null;
		// 获取对象的类
		Class<T> clazz = (Class<T>) t.getClass();
		Field[] fi = clazz.getDeclaredFields();
		// insert into Person(name) values(?,?,?)
		// 以下开始拼接sql语句
		String sql = "insert into " + clazz.getSimpleName() + " (";
		for (int i = 1; i < fi.length; i++) {
			sql = sql + fi[i].getName();
			if (i < fi.length - 1) {
				sql = sql + ",";
			}
		}
		sql = sql + ") values(";
		for (int i = 1; i < fi.length; i++) {
			sql = sql + "?";
			if (i < fi.length - 1) {
				sql = sql + ",";
			}
		}
		sql = sql + ")";

		try {
			ps = conn.prepareStatement(sql);
			for (int i = 1; i < fi.length; i++) {
				fi[i].setAccessible(true);
				ps.setObject(i, fi[i].get(t));
			}
			int a = ps.executeUpdate();
			if (a > 0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeRec(conn, ps);
		}
		System.out.println("添加成功！");
		return flag;

	}

	/*
	 * @return
	 * @see com.daiinfo.javaadvanced.know4.example.dao.BaseDAO#findAll()
	 */

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<T> findAll() {
		// TODO Auto-generated method stub
		// 获取传入的泛型类的对象
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		System.out.println(clazz.getName());

		ArrayList<T> list = new ArrayList<>();
		Connection conn = JDBCUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		// 由于数据库中的表名对应的是实体类的类名，所以可以通过传入的类得到表名clazz.getSimpleName()
		String sql = "select * from " + clazz.getSimpleName();
		// 获取类对象的所有属性
		Field[] fieldArray = clazz.getDeclaredFields();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Object object = clazz.newInstance();// 实例化类对象
				for (Field field : fieldArray) {
					field.setAccessible(true);// 打开控制访问权限
					field.set(object, rs.getObject(field.getName()));
				}
				list.add((T) object);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeRec(conn, ps, rs);
		}
		return list;
	}

	/*
	 * @param id
	 * @return
	 * @see com.daiinfo.javaadvanced.know4.example.dao.BaseDAO#findById(int)
	 */

	@Override
	public T findById(int id) {
		// TODO Auto-generated method stub
		// 获取传入的泛型类型
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

		Connection conn = JDBCUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Field[] fi = clazz.getDeclaredFields();
		// 由于类中不一定用id表示编号，但是通常类中的第一个属性为编号id
		String sql = "select * from " + clazz.getSimpleName() + " where " + fi[0].getName() + " = " + id;
		Object object = null;

		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				object = clazz.newInstance();
				for (Field ff : fi) {
					ff.setAccessible(true);
					ff.set(object, rs.getObject(ff.getName()));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeRec(conn, ps, rs);
		}
		return (T) object;
	}

	/*
	 * @param id
	 * @return
	 * @see com.daiinfo.javaadvanced.know4.example.dao.BaseDAO#delete(int)
	 */

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		// 获取传入的泛型类型
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

		boolean flag = false;
		Connection conn = JDBCUtil.getConnection();
		PreparedStatement ps = null;
		Field[] fi = clazz.getDeclaredFields();
		String sql = "delete from " + clazz.getSimpleName() + " where " + fi[0].getName() + " = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setObject(1, id);
			int a = ps.executeUpdate();
			if (a > 0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeRec(conn, ps);
		}
		return flag;
	}

	/*
	 * @param t
	 * @return
	 * @see com.daiinfo.javaadvanced.know4.example.dao.BaseDAO#update(java.lang.
	 * Object)
	 */

	@Override
	public boolean update(T t) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Connection conn = JDBCUtil.getConnection();
		PreparedStatement ps = null;
		Class<T> clazz = (Class<T>) t.getClass();
		Field[] fi = clazz.getDeclaredFields();
		StringBuffer sb = new StringBuffer();
		// update person set name = ?,age = ?,type = ? where id = ?
		sb.append(" update ");
		sb.append(clazz.getSimpleName());
		sb.append(" set ");
		for (int i = 1; i < fi.length; i++) {
			fi[i].setAccessible(true);
			sb.append(fi[i].getName());
			sb.append(" = ? ");
			if (i != fi.length - 1) {
				sb.append(" , ");
			}
		}
		sb.append(" where ");
		sb.append(fi[0].getName());
		sb.append("=?");

		try {
			ps = conn.prepareStatement(sb.toString());
			for (int i = 1; i < fi.length; i++) {
				fi[i].setAccessible(true);
				ps.setObject(i, fi[i].get(t));
			}
			fi[0].setAccessible(true);
			ps.setObject(fi.length, fi[0].get(t));
			int a = ps.executeUpdate();
			if (a > 0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeRec(conn, ps);
		}
		return flag;
	}

	/**
	 * 
	 */
	@Override
	public boolean add(T t) {
		boolean flag = false;
		Connection conn = JDBCUtil.getConnection();
		PreparedStatement ps = null;
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) t.getClass();
		Field[] fi = clazz.getDeclaredFields();
		StringBuffer sb = new StringBuffer();
		sb.append("insert into ");
		sb.append(clazz.getSimpleName());
		sb.append(" (");
		for (int i = 1; i < fi.length; i++) {
			sb.append(fi[i].getName());
			if (i != fi.length - 1) {
				sb.append(" , ");
			}
		}
		sb.append(") values (");
		for (int i = 1; i < fi.length; i++) {
			sb.append(" ? ");
			if (i != fi.length - 1) {
				sb.append(" , ");
			}
		}
		sb.append(" ) ");
		try {
			ps = conn.prepareStatement(sb.toString());
			for (int i = 1; i < fi.length; i++) {
				fi[i].setAccessible(true);
				ps.setObject(i, fi[i].get(t));
			}
			int a = ps.executeUpdate();
			if (a > 0) {
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeRec(conn, ps);
		}
		return flag;
	}

	// 根据特定条件删除
	public boolean deleteByCondition(String name, Object value) {
		// 获取传入的泛型类型
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

		boolean flag = false;
		Connection conn = JDBCUtil.getConnection();
		PreparedStatement ps = null;
		Field[] fi = clazz.getDeclaredFields();
		String sql = "delete from " + clazz.getSimpleName() + " where " + name + " = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setObject(1, value);
			int a = ps.executeUpdate();
			if (a > 0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeRec(conn, ps);
		}
		return flag;
	}

}
