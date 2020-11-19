package com.daiinfo.javaadvanced.know9.interfaceoriented;

public class MobileHardDisk implements IMobileStorage{

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Reading from MobileHardDisk……");
		System.out.println("MobileHardDisk Read finished!");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Writing to MobileHardDisk……");
		System.out.println("MobileHardDisk Write finished!");
	}

}
