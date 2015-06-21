package com.bt.bluetechnology.patterns.statePattern;

public interface IAgentState {

	public void seatch(final AgentV2 aAgent);
	public void fight(final AgentV2 aAgent);
	public void hit(final AgentV2 aAgent);
	public void heal(final AgentV2 aAgent);
	
}
