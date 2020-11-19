package com.daiinfo.javaadvanced.know9.combined;

public class Tree {
	private Component root;
	
	public Tree(){
		
	}

	public Component getRoot() {
		return root;
	}

	public void setRoot(Component root) {
		this.root = root;
	}

	public void show() {
		root.display("");
	}
}
