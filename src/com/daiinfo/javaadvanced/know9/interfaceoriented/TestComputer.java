package com.daiinfo.javaadvanced.know9.interfaceoriented;

public class TestComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer();
		IMobileStorage mp3Player = new MP3Player();
		IMobileStorage flashDisk = new FlashDisk();
		IMobileStorage mobileHardDisk = new MobileHardDisk();
		
		System.out.println("--------------------");
		System.out.println("I inserted my MP3 Player into my computer and copy some music to it:");
		computer.setUsbDrive(mp3Player);
		computer.WriteData();
		computer.ReadData();
		
		System.out.println("--------------------");
		System.out.println("Well,I also want to copy a great movie to my computer from a mobile hard disk:");
		computer.setUsbDrive(mobileHardDisk);
		computer.WriteData();
		computer.ReadData();
		
		System.out.println("--------------------");
		System.out.println("OK!I have to read some files from my flash disk and copy another file to it:");
		computer.setUsbDrive(flashDisk);
		computer.ReadData();
		computer.WriteData();
		
		/**
		 * 新的设备，如光盘，只读不能写
		 */
		/*
		System.out.println("OK!I have to read-only  disk");
		computer.setUsbDrive(disk);
		computer.ReadData();
		*/
		
	}

}
