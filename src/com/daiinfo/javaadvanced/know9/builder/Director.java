package com.daiinfo.javaadvanced.know9.builder;


public class Director {
    public Product construct(Builder builder) {
        builder.recruiting();// 招募人员
        builder.raiseFunds();// 筹集资金
        builder.writeScript();// 编剧
        builder.released();// 出版，发行，宣传，上映
		return builder.getProduct();
    }
}
