package com.daiinfo.javaadvanced.know9.builder;

import java.util.ArrayList;

public class FilmWorks extends Product {
    private ArrayList<String>  actorList=new ArrayList<>();     // 影视演员列表
    private String  regisseur;                                  // 影视导演

    public ArrayList<String> getActorList() {
        return actorList;
    }

    public void setActor(ArrayList<String> actorList) {
        this.actorList = actorList;
    }
    public String getRegisseur() {
        return regisseur;
    }
    public void setRegisseur(String regisseur) {
        this.regisseur = regisseur;
    }
    
    @Override
    public String toString(){
    	return "Product["+"影视名称："+productName+",导演:"+regisseur+",主演"+actorList+",耗资:"+fundraising+",故事情节:"+content+"]";
    }
    
}
