package com.bt.patterns;

import org.junit.Assert;
import org.junit.Test;

import com.bt.bluetechnology.patterns.StatePattern.AgentV2;
import com.bt.bluetechnology.patterns.StatePattern.Dead;
import com.bt.bluetechnology.patterns.StatePattern.Health;
import com.bt.bluetechnology.patterns.StatePattern.Injured;

public class StatePatternTest {
	@Test
	public void testHealthStateTransition() {
		AgentV2 agent = new AgentV2();
		Assert.assertNotNull(agent.getState());
		Assert.assertEquals(agent.getState().getClass(), Health.class);
		agent.heal(80);
		Assert.assertEquals("Test heal(Health->Health)",100, agent.getHp());
		Assert.assertEquals(Health.class, agent.getState());
		
		agent.hit(30);
		Assert.assertEquals("Test heal(Health->Health)",Health.class, agent.getState().getClass());
		agent.hit(1);
		Assert.assertEquals("Test heal(Health->Injured)",Injured.class, agent.getState().getClass());
		
		agent.heal(31);
		Assert.assertEquals(100, agent.getHp());
		Assert.assertEquals("Test heal(Health->Injured)",Health.class, agent.getState().getClass());
		
		agent.heal(100);
		Assert.assertEquals(0, agent.getHp());
		Assert.assertEquals("Test heal(Health->Dead)",Dead.class, agent.getState().getClass());
		
	}
}
