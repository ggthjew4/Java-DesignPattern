package com.bt.bluetechnology.patterns.composite;

public class TraceBullet implements IWeapon {

	@Override
	public boolean add(IWeapon aWeapon) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(IWeapon aWeapon) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IWeapon getChild(int aIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fire() {
		System.out.println("TraceBullet fire!!");
	}

}
