package com.bt.bluetechnology.patterns.observer;

import java.util.Date;

import com.bt.bluetechnology.patterns.observer.MonitoredItem.State;

public class ChangeLogger implements IObserver {

	@Override
	public void update(ISubject obj) {
		writeChangeLog(((MonitoredItem) obj).getState(), new Date());
	}

	private void writeChangeLog(final State aState, Date date) {
	}

}
