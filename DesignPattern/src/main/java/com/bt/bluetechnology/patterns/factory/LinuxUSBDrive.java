package com.bt.bluetechnology.patterns.factory;

public class LinuxUSBDrive extends Drive {

	public LinuxUSBDrive(DMIDrive _impl) {
		super(_impl);
	}

	@Override
	public void updateFreeSpace(){
	   System.out.print("LinuxUSBDrive updateFreeSpace");
	}
}

