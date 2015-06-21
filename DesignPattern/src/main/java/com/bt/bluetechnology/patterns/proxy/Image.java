package com.bt.bluetechnology.patterns.proxy;

public class Image implements Graphic{
	
	private String fileName;
	
	public String getFileName() {
		return this.fileName;
	}

	public Image(String fileName) {
		super();
		this.fileName = fileName;
	}



	@Override
	public void drow() {
		// TODO Auto-generated method stub
		
	}

}
