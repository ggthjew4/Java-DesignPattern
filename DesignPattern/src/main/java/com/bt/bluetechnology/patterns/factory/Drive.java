package com.bt.bluetechnology.patterns.factory;

public abstract class Drive {
	
    DMIDrive _impl;

	public Drive(DMIDrive _impl) {
		super();
		this._impl = _impl;
	}
    
	public void updateFreeSpace(){};
	public void doQuickSMARTCheck(){};
}
