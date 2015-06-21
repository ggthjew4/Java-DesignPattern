package com.bt.bluetechnology.patterns.command;

public class Result implements IResult {

	private int _status = IResult.OK;

	private String _msg = "";

	@Override
	public int getStatus() {
		// TODO Auto-generated method stub
		return _status;
	}

	@Override
	public String getMessage() {
		return _msg;
	}

	@Override
	public void setStatus(int statusCode) {
		this._status = statusCode;

	}

	@Override
	public void setMessage(String msg) {
		this._msg = msg;
	}

}
