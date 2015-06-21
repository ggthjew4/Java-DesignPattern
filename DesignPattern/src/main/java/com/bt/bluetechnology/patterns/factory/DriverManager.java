package com.bt.bluetechnology.patterns.factory;

public abstract class DriverManager {
	
	protected Drive drive;

	public Drive getDrive(final String type, int index) {
		Drive drive = createDrive(type, index);
		drive.updateFreeSpace();
		drive.doQuickSMARTCheck();
		return drive;
	}
	
	public final void setDrive(final Drive drive){
		this.drive=drive;
	}

	abstract protected Drive createDrive(final String type, int index);
}
