package com.daiinfo.javaadvanced.know9.combined;

public class Leaf implements Component {
	
	//组件的名字
	private String name;
	
	public Leaf(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	/**
	 * 展现节点，此处用于输出组件的树形结构
	 */
	@Override
	public void display(String preStr) {
		// TODO Auto-generated method stub
		System.out.println(preStr + "-" + name);
	}

	@Override
	public void addChild(Component child) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Leaf cannot add element!!");
	}

	@Override
	public void removeChild(Component child) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Cannot remove element because Leaf have no Child Node!!");
	}

	@Override
	public Component getChildren(int index) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Cannot get element because Leaf have no Child Node!!");
	}
	
}
