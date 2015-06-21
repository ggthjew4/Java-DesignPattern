package com.bt.bluetechnology.patterns.factory;

public class WMI {
	
	public static DMIDrive getDrive(int index){
		return new DMIDrive();
	}
	
	public static DMIDrive getSATADrive(int index){
		return new DMIDrive();
	}
	
	public static DMIDrive getUSBDrive(int index){
		return new DMIDrive();
	}

}
