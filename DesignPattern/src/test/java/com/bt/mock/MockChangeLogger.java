package com.bt.mock;

import com.bt.bluetechnology.patterns.observer.IObserver;
import com.bt.bluetechnology.patterns.observer.ISubject;

public class MockChangeLogger implements IObserver {
	
	public int _notifiedCount = 0;

	@Override
	public void update(ISubject obj) {
		_notifiedCount++;
	}

}
