package com.daiinfo.javaadvanced.know9.builder;

public class ClientDemo {
	public static void main(String[] args) {
		Director director=new Director();
		// 一部电影的产生
		Builder filmWorksBuilder = new FilmWorksBuilder();
		Product filmWorks = director.construct(filmWorksBuilder);
		System.out.println(filmWorks.toString());
	}
}
