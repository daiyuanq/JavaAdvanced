package com.daiinfo.javaadvanced.know9.combined;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	private String name = "";
	 
	//用来存储组合对象中包含的子组件对象
	private List<Component> childNode = null;

	public Composite(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 展现节点，此处用于输出组件的树形结构，通常在里面需要实现递归的调用
	 */

	/**
	 * 向组合对象中添加组件对象
	 */
	public void addChild(Component child) {
		// 延迟初始化
		if (null == childNode) {
			childNode = new ArrayList<Component>();
		}
		childNode.add(child);
	}

	/**
	 * 从组合对象中移除组件对象
	 */
	public void removeChild(Component child) {
		if (null != childNode) {
			childNode.remove(child);
		}
	}

	/**
	 * 根据索引获取组合对象中对应的组件对象
	 */
	public Component getChildren(int index) {
		if (null != childNode) {
			if (index >= 0 && index < childNode.size()) {
				return childNode.get(index);
			}
		}
		return null;
	}

	@Override
	public void display(String preStr) {
		// TODO Auto-generated method stub
		// 先把自己输出
		System.out.println(preStr + "+" + name);
		// 如果还包含其他子组件，那么就输出这些子组件对象
		if (null != childNode) {
			// 添加一个空格，表示向后缩进一个空格
			preStr += "   ";
			// 输出当前对象的子组件对象
			for (Component node : childNode) {
				// 递归地进行子组件相应方法的调用，输出每个子组件对象
				node.display(preStr);
			}
		}
	}
	
}
