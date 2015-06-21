package com.bt.patterns;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bt.bluetechnology.patterns.observer.MonitoredItem;
import com.bt.bluetechnology.patterns.observer.MonitoredItem.State;
import com.bt.mock.MockChangeLogger;

public class MonitoredItemTest {

	@Test
	public void test() {
		MonitoredItem mi = new MonitoredItem();
		MockChangeLogger logger = new MockChangeLogger();
		mi.addObserver(logger);
		assertEquals(0, logger._notifiedCount);
		mi.changeState(State.CRITICAL);
		assertEquals(1, logger._notifiedCount);
		mi.changeState(State.CRITICAL);
		assertEquals(2, logger._notifiedCount);
	}

}
