package com.bt.bluetechnology.patterns.composite;

public interface IWeapon {
	
	boolean add(IWeapon aWeapon);
	
	boolean remove(IWeapon aWeapon);
	
	IWeapon getChild(int aIndex);
	
	void fire();

	
}
