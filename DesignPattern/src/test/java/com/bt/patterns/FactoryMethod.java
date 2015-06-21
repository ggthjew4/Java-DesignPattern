package com.bt.patterns;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

import com.bt.bluetechnology.patterns.factory.Drive;
import com.bt.bluetechnology.patterns.factory.DriverManager;
import com.bt.bluetechnology.patterns.factory.LinuxSATADrive;
import com.bt.bluetechnology.patterns.factory.LinuxUSBDrive;
import com.bt.bluetechnology.patterns.factory.WinDriverManager;
import com.bt.bluetechnology.patterns.factory.WinSATADrive;
import com.bt.bluetechnology.patterns.factory.WinUSBDrive;


public class FactoryMethod {

	@Test
	public void test() {
		DriverManager driverManager = new WinDriverManager();
		// 另類寫法可以直接指定
		// driverManager.setDrive(new WinSATADrive(WMI.getSATADrive(0)));
		Drive driver = driverManager.getDrive("USB", 0);
		assertEquals("this is OK!", WinUSBDrive.class, driver.getClass());
		assertNotSame(WinSATADrive.class, driver.getClass());
		assertNotSame(LinuxUSBDrive.class, driver.getClass());
		assertNotSame(LinuxSATADrive.class, driver.getClass());
	}

}
