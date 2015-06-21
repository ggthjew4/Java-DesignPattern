package com.bt.bluetechnology.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Clip implements IWeapon {
	
	private List<IWeapon> _list = new ArrayList<IWeapon>();

	@Override
	public boolean add(IWeapon aWeapon) {
		return _list.add(aWeapon);
	}

	@Override
	public boolean remove(IWeapon aWeapon) {
		return _list.remove(aWeapon);
	}

	@Override
	public IWeapon getChild(int aIndex) {
		return _list.get(aIndex);
	}

	@Override
	public void fire() {
		for(IWeapon weapon:_list){
			weapon.fire();
		}
	}

}
