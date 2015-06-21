package com.bt.bluetechnology.patterns.command;

public interface IResult {

	final int OK = 1;
	final int WARRING = 2;
	final int CRITICAL = 3;

	int getStatus();

	String getMessage();

	void setStatus(int statusCode);

	void setMessage(String msg);

}
