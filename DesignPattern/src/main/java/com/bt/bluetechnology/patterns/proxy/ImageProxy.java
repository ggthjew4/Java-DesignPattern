package com.bt.bluetechnology.patterns.proxy;

public class ImageProxy implements Graphic {
	
	private Graphic image;
	
	private String imageName;
	
	

	public ImageProxy(String imageName) {
		this.imageName = imageName;
	}



	@Override
	public void drow() {
		if(null==image){
			image = new Image(imageName);
		}

	}



	@Override
	public String getFileName() {
		return this.imageName;
	}

}
