package com.daiinfo.javaadvanced.know9.builder;

import java.util.ArrayList;

public class FilmWorksBuilder implements Builder {
	public FilmWorks filmWorks = new FilmWorks();

	/**
	 * 招募人员
	 * 指定导演，招募演员
	 */
	@Override
	public void recruiting() {
		// TODO Auto-generated method stub
		filmWorks.setRegisseur("吴京");
		ArrayList<String> list = new ArrayList<>();
		list.add("吴京");
		list.add("余男");
		list.add("倪大红");
		list.add("斯科特·阿金斯");
		list.add("周晓鸥");
		filmWorks.setActor(list);
	}

	/**
	 * 编剧
	 */
	@Override
	public void writeScript() {
		// TODO Auto-generated method stub
		filmWorks.setProductName("战狼");
		filmWorks.setAuthor("董群");
		filmWorks.setContent("讲述的是小人物成长为拯救国家和民族命运的孤胆英雄的传奇故事。");

	}

	@Override
	public void raiseFunds() {
		// TODO Auto-generated method stub
		System.out.println("筹资中...");
	}

	/**
	 * 编剧、拍摄、宣传、发行、上映等需要费用
	 */
	@Override
	public void released() {
		// TODO Auto-generated method stub
		filmWorks.setFundraising(10000000.00);
	}

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return filmWorks;
	}

}
