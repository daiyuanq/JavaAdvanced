package com.daiinfo.javaadvanced.know9.combined;

public interface Component {
	
	// 缺省的实现，抛出异常，因为叶子对象没有这个功能，或子类未实现这个功能
	public void addChild(Component child);
	
	// 缺省的实现，抛出异常，因为叶子对象没有这个功能，或子类未实现这个功能
	public void removeChild(Component child);
	
	// 缺省的实现，抛出异常，因为叶子对象没有这个功能，或子类未实现这个功能
	public Component getChildren(int index);
	
	// 呈现节点
	public  void display(String preStr);

}
