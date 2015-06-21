package com.bt.bluetechnology.patterns.strategy;

public class Player {

	IBatStrategy _batStrategy = null;

	public Player(IBatStrategy _batStrategy) {
		super();
		this._batStrategy = _batStrategy;
	}

	public void bat() {
		_batStrategy.swing();
	}

}
