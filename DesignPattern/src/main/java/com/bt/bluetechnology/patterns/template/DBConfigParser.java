package com.bt.bluetechnology.patterns.template;

public class DBConfigParser extends ConfigParser {
	
	private String mConnStr = null;
	
	

	public DBConfigParser(String mConnStr) {
		super();
		this.mConnStr = mConnStr;
	}

	@Override
	protected void readData() {
		System.out.print("validate config Data from DB : " + mConnStr);

	}

	@Override
	protected void parseToken() {
		System.out.print("parseToken..... ");

	}

	@Override
	protected void buildModel() {
		mPdata = new PersonData();
		mPdata.setName("Tany");
		mPdata.setHp("80");
	}

	@Override
	protected void validate() {
		System.out.print("validate config Data from DB : " + mConnStr);

	}

}
