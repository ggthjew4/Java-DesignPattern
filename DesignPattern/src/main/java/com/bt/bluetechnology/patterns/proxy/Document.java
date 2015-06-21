package com.bt.bluetechnology.patterns.proxy;

public class Document {

	private Graphic image;

	public Document() {
		super();
		this.image = new ImageProxy("");
	}

	public Document(Graphic image) {
		super();
		this.image = image;
	}

	public void scroll() {
		image.drow();
	}

}
