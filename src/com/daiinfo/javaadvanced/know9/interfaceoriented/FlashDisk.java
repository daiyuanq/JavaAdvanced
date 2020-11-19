package com.daiinfo.javaadvanced.know9.interfaceoriented;

public class FlashDisk implements IMobileStorage{

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Reading from FlashDisk……");
		System.out.println("FlashDisk Read finished!");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Writing to FlashDisk……");
		System.out.println("FlashDisk Write finished!");
	}

}
