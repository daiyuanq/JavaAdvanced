package com.daiinfo.javaadvanced.know9.interfaceoriented;

public class Computer {
	IMobileStorage usbDrive;

	public Computer() {
	}

	public Computer(IMobileStorage usbDrive) {
		this.setUsbDrive(usbDrive);
	}

	public void ReadData() {
		this.getUsbDrive().read();
	}

	public void WriteData() {
		this.getUsbDrive().write();
	}

	public IMobileStorage getUsbDrive() {
		return usbDrive;
	}

	public void setUsbDrive(IMobileStorage usbDrive) {
		this.usbDrive = usbDrive;
	}
}
