package com.bt.bluetechnology.patterns.template;

public class FileConfigParser extends ConfigParser {

	private String mFileName = null;

	public FileConfigParser(String mFileName) {
		this.mFileName = mFileName;
	}

	@Override
	protected void readData() {
		System.out.print("Read config Data from file : " + mFileName);
	}

	@Override
	protected void parseToken() {
		System.out.print("parseToken..... ");

	}

	@Override
	protected void buildModel() {
		mPdata = new PersonData();
		mPdata.setName("Kerrigan");
		mPdata.setHp("100");
	}

	@Override
	protected void validate() {
		System.out.print("validate config Data from file : " + mFileName);
	}

}
