package com.bt.bluetechnology.patterns.composite;

public class LineBullet implements IWeapon {

	@Override
	public boolean add(IWeapon aWeapon) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean remove(IWeapon aWeapon) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IWeapon getChild(int aIndex) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void fire() {
		System.out.println("LineBullet fire!!");

	}

}
