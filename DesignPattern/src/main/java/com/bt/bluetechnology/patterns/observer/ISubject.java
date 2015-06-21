package com.bt.bluetechnology.patterns.observer;

public interface ISubject {
	
	void addObserver(IObserver obj);
	
	void deleteObserver(IObserver obj);
	
	void notifyObserver();

}
