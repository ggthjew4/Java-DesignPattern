package com.bt.bluetechnology.patterns.template;

public abstract class ConfigParser {
	
	protected PersonData mPdata = null;
	
	public final PersonData doParse(){
		readData();
		parseToken();
		buildModel();
		validate();
		return mPdata;
	}
	
	
	abstract protected void readData();
	abstract protected void parseToken();
	abstract protected void buildModel();
	abstract protected void validate();
	

}
