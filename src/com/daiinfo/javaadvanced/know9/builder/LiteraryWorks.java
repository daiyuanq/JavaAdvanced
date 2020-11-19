package com.daiinfo.javaadvanced.know9.builder;


public class LiteraryWorks extends Product {
    private double price=0.0;      //书籍价格

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
