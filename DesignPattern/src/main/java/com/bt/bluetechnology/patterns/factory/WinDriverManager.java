package com.bt.bluetechnology.patterns.factory;

public class WinDriverManager extends DriverManager {

	@Override
	protected Drive createDrive(String type, int index) {
		// 直接使用附類別指定實作類別，所以直接回傳指定實作類別
		// return super.drive;
		//老師解答 這沒有不好的地方 看是要一對一指定 或是 使用switch case 都可以 但都會有另外方面的impact
		Drive drive = null;
		switch (type) {
		case "SATA":
			drive = new WinSATADrive(WMI.getSATADrive(index));
			break;
		case "USB":
			drive = new WinUSBDrive(WMI.getUSBDrive(index));
			break;
		default:
			throw new RuntimeException();
		}
		return drive;
	}

}
