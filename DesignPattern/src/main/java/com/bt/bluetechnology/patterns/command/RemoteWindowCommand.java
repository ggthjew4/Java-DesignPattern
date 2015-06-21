package com.bt.bluetechnology.patterns.command;

public class RemoteWindowCommand implements ICommand {

	private RemoteWindow _window = null;

	public RemoteWindowCommand(String ipAddress) {
		_window = new RemoteWindow(ipAddress);
	}

	@Override
	public IResult execute() {
		IResult result = new Result();
		if (_window.isBroken()) {
			result.setStatus(IResult.CRITICAL);
			result.setMessage("窗戶被打破：");
		}

		if (_window.isOpen()) {
			result.setStatus(IResult.CRITICAL);
			result.setMessage("窗戶打開：");
		}
		return result;
	}
}
