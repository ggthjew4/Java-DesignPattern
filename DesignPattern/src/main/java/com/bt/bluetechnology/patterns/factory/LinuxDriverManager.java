package com.bt.bluetechnology.patterns.factory;


public class LinuxDriverManager extends DriverManager {

	@Override
	protected Drive createDrive(String type, int index) {
		Drive drive = null;
		switch (type) {
		case "SATA":
			drive = new LinuxSATADrive(LinuxNativeDriveUtil.getDrive(index));
			break;
		case "USB":
			drive = new LinuxUSBDrive(LinuxNativeDriveUtil.getDrive(index));
			break;
		default:
			throw new RuntimeException();
		}

		return drive;
	}

}
