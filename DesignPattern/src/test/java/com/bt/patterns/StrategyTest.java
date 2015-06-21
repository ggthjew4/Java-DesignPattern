package com.bt.patterns;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bt.bluetechnology.patterns.strategy.BuntStrategy;
import com.bt.bluetechnology.patterns.strategy.FreeBatStrategy;
import com.bt.bluetechnology.patterns.strategy.Player;
import com.bt.bluetechnology.patterns.strategy.SacrificeFlyStrategy;

public class StrategyTest {

	@Test
	public void test() {
		Player player = new Player(new FreeBatStrategy());
		player.bat();
		Player player2 = new Player(new SacrificeFlyStrategy());
		player2.bat();
		Player player3 = new Player(new BuntStrategy());
		player3.bat();
	}

}
