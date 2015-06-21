package com.bt.bluetechnology.patterns.command;

public class RemoteTermalCommand implements ICommand {

	
	private RemoteTermal _termal = null;
	
	public RemoteTermalCommand(String ipAddres){
		_termal = new RemoteTermal(ipAddres);
		
	}
	@Override
	public IResult execute() {
		IResult result = new Result();
		if (_termal.isOverHead()) {
			result.setStatus(IResult.CRITICAL);
			result.setMessage("溫度過熱:");
		}
		return result;
	}
}
