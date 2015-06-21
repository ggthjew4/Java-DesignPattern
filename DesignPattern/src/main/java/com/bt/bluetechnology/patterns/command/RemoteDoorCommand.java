package com.bt.bluetechnology.patterns.command;

public class RemoteDoorCommand implements ICommand {

	private RemoteDoor _door = null;

	public RemoteDoorCommand(final String ipAddress) {
		this._door = new RemoteDoor(ipAddress);
	}

	public RemoteDoorCommand(RemoteDoor _door) {
		super();
		this._door = _door;
	}

	@Override
	public IResult execute() {
		IResult result = new Result();
		if ("open".equals(_door.getDoorStatus())) {
			result.setStatus(IResult.CRITICAL);
			result.setMessage("門被開啟：");
		}
		return result;
	}

}
