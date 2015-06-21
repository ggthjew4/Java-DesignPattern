package com.bt.mock;

import com.bt.bluetechnology.patterns.command.RemoteDoor;

public class MockRemoteDoor extends RemoteDoor {

	private String _status = null;

	public MockRemoteDoor(String ipAddress) {
		super(ipAddress);
	}

	public MockRemoteDoor(String ipAddress, String status) {
		super(ipAddress);
		_status = status;
	}

	@Override
	public String getDoorStatus() {
		return _status;
	}

}
