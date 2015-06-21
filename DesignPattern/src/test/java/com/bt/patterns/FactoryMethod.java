package com.bt.patterns;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bt.bluetechnology.patterns.Factory.Drive;
import com.bt.bluetechnology.patterns.Factory.DriverManager;
import com.bt.bluetechnology.patterns.Factory.LinuxSATADrive;
import com.bt.bluetechnology.patterns.Factory.LinuxUSBDrive;
import com.bt.bluetechnology.patterns.Factory.WinDriverManager;
import com.bt.bluetechnology.patterns.Factory.WinSATADrive;
import com.bt.bluetechnology.patterns.Factory.WinUSBDrive;

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
