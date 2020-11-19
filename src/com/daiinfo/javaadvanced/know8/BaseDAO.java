/**  
* @Title: BaseDAO.java
* @Package com.daiinfo.javaadvanced.know8
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月18日 上午8:47:32
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know8;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
* @ClassName: BaseDAO
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月18日上午8:47:32
*/

public class BaseDAO<T> {
	// 插入对象
	public boolean add(T t) {
		/*
		 * // 获取传入的泛型类型 Class<T> class1 = (Class<T>) ((ParameterizedType)
		 * getClass() .getGenericSuperclass()).getActualTypeArguments()[0];
		 * System.out.println(class1.getName());
		 */
		boolean flag = false;
		Connection conn = BaseConnection.getConnection();
		PreparedStatement ps = null;
		// 获取对象的类
		Class<T> clazz = (Class<T>) t.getClass();
		Field[] fi = clazz.getDeclaredFields();
		// insert into Person(name) values(?,?,?)
		// 以下开始拼接sql语句
		// 两个String对象的连接是很耗费资源的，以下方法可以通过StringBuffer优化，
		// 可以减少资源利用，使用apand对StringBuffer进行拼接
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
			BaseConnection.closeRec(conn, ps);
		}
		System.out.println("添加成功！");
		return flag;

	}

	// 优化插入
	public boolean addOptimize(T t) {
		boolean flag = false;
		Connection conn = BaseConnection.getConnection();
		PreparedStatement ps = null;
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
			BaseConnection.closeRec(conn, ps);
		}
		return flag;
	}

	// 查询所有
	public ArrayList<T> finAll() {
		// 获取传入的泛型类型
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		System.out.println(clazz.getName());
		ArrayList<T> list = new ArrayList<>();
		Connection conn = BaseConnection.getConnection();
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
			BaseConnection.closeRec(conn, ps, rs);
		}
		return list;
	}

	// 根据表的主键查询表的对象
	public T findById(int id) {
		// 获取传入的泛型类型
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

		Connection conn = BaseConnection.getConnection();
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
			BaseConnection.closeRec(conn, ps, rs);
		}
		return (T) object;
	}

	// 根据id删除
	public boolean delete(int id) {
		// 获取传入的泛型类型
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

		boolean flag = false;
		Connection conn = BaseConnection.getConnection();
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
			BaseConnection.closeRec(conn, ps);
		}
		return flag;
	}

	// 根据特定条件删除
	public boolean deleteByCondition(String name, Object value) {
		// 获取传入的泛型类型
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

		boolean flag = false;
		Connection conn = BaseConnection.getConnection();
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
			BaseConnection.closeRec(conn, ps);
		}
		return flag;
	}

	// 更新
	public boolean update(T t) {
		boolean flag = false;
		Connection conn = BaseConnection.getConnection();
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
			BaseConnection.closeRec(conn, ps);
		}
		return flag;
	}

}
