/**  
* @Title: TestChart.java
* @Package com.daiinfo.javaadvanced.know8.example.test
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月16日 上午12:39:59
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know8.example.test;

import java.awt.Font;
import java.util.HashMap;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import com.daiinfo.javaadvanced.know8.example.dao.BookDAOWithDBCPConnPool;

/**
* @ClassName: TestChart
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月16日上午12:39:59
*/

public class TestChart {
	/**
	 * 创建数据集合
	 * @return dataSet
	 */
	public static CategoryDataset createDataSet() {
		// 实例化DefaultCategoryDataset对象
		DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
		// 向数据集合中添加数据
		BookDAOWithDBCPConnPool bdaoPool = new BookDAOWithDBCPConnPool();
		Map<String, Integer> map = new HashMap<String, Integer>();
		// 获取查询数据
		map = bdaoPool.statisticAmountByPublisher();
		for (String s : map.keySet()) {
			dataSet.addValue(map.get(s), s, s);
		}
		return dataSet;

	}

	/**
	 * 创建JFreeChart对象
	 * @return chart
	 */
	public static JFreeChart createChart() {

		// 通过ChartFactory创建JFreeChart
		StandardChartTheme standardChartTheme = new StandardChartTheme("CN"); // 创建主题样式
		standardChartTheme.setExtraLargeFont(new Font("隶书", Font.BOLD, 20)); // 设置标题字体
		standardChartTheme.setRegularFont(new Font("宋体", Font.PLAIN, 15)); // 设置图例的字体
		standardChartTheme.setLargeFont(new Font("宋体", Font.PLAIN, 15)); // 设置轴向的字体
		ChartFactory.setChartTheme(standardChartTheme);// 设置主题样式
		// 通过ChartFactory创建JFreeChart
		JFreeChart chart = ChartFactory.createBarChart3D("图书库存统计", // 图表标题
				"出版社", // 横轴标题
				"库存量（本）", // 纵轴标题
				createDataSet(), // 数据集合
				PlotOrientation.VERTICAL, // 图表方向
				true, // 是否显示图例标识
				false, // 是否显示tooltips
				false);// 是否支持超链接
		return chart;

	}

	// 本地测试
	public static void main(String[] args) {
		ChartFrame cf = new ChartFrame("图书库存统计", createChart());
		cf.pack();
		cf.setVisible(true);
	}

}
