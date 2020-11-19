package com.daiinfo.javaadvanced.know9.combined;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class CompositeDemo {
	public static void main(String[] args) {
		// 定义多个Composite组合对象
		Component root = new Composite("服装");
		Component c1 = new Composite("男装");
		Component c2 = new Composite("女装");
		Component c3 = new Composite("母婴");

		// System.out.println(((Composite)c2).getName());

		// 定义多个Leaf叶子对象
		Component leaf1 = new Leaf("西服");
		Component leaf2 = new Leaf("夹克");
		Component leaf3 = new Leaf("衬衫");
		Component leaf4 = new Leaf("裙子");
		Component leaf5 = new Leaf("套装");
		Component leaf6 = new Leaf("鞋袜");
		Component leaf7 = new Leaf("孕妇装");
		Component leaf8 = new Leaf("婴儿装");

		// System.out.println(((Leaf)leaf1).getName());

		// 组合成为树形的对象结构
		root.addChild(c1);
		root.addChild(c2);
		root.addChild(leaf6);
		c1.addChild(leaf1);
		c1.addChild(leaf2);
		c1.addChild(leaf3);
		c2.addChild(leaf4);
		c2.addChild(leaf5);
		c2.addChild(c3);
		c3.addChild(leaf7);
		c3.addChild(leaf8);

		// 构建以root为根的树
		Tree tree = new Tree();
		tree.setRoot(root);
		tree.show();

		// 删除一个节点看看效果
		System.out.println("==========");
		c3.removeChild(leaf8);
		tree.show();

		// 查找c2上的叶子
		System.out.println("==========");
		Component leaf = ((Composite) c2).getChildren(1);
		System.out.println("查找c2上的叶子");
		System.out.println(((Leaf) leaf).getName());

		// c2上添加叶子
		System.out.println("==========");
		Component leaf9 = new Leaf("情侣装");
		c2.addChild(leaf9);
		tree.show();

		// 构建以c2为根的树
		System.out.println("==========");
		tree.setRoot(c2);
		tree.show();
	}

}
