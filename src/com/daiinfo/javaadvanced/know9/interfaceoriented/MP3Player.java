package com.daiinfo.javaadvanced.know9.interfaceoriented;

public class MP3Player implements IMobileStorage {

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Reading from MP3Player……");
		System.out.println("MP3Player Read finished!");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Writing to MP3Player……");
		System.out.println("MP3Player Write finished!");
	}

	public void playMusic() {
		System.out.println("Music is playing……");
	}

}
