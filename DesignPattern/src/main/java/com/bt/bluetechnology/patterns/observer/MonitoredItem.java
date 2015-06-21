package com.bt.bluetechnology.patterns.observer;

import java.util.LinkedList;
import java.util.List;

public class MonitoredItem implements ISubject {

	public enum State {
		OK, CRITICAL
	};

	private List<IObserver> _observer = new LinkedList<>();

	private State _state = State.OK;

	@Override
	public void addObserver(IObserver obj) {
		_observer.add(obj);
	}

	@Override
	public void deleteObserver(IObserver obj) {
		_observer.remove(obj);
	}

	@Override
	public void notifyObserver() {
		for (IObserver obj : _observer) {
			obj.update(this);
		}
	}
	public void changeState(State sNewState){
		this._state = sNewState;
		this.notifyObserver();
	}
	
	public State getState(){
		return this._state;
	}

}
