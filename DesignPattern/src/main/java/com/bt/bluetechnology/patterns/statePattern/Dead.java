package com.bt.bluetechnology.patterns.statePattern;

public class Dead implements IAgentState {

	public void seatch(AgentV2 aAgent) {
		// TODO Auto-generated method stub

	}

	public void hit(int aValue) {
		// TODO Auto-generated method stub

	}

	public void heal(AgentV2 aAgent) {
		if (aAgent.getHp() >= AgentV2.HEALTH_LOW_LIMIT) {
			aAgent.changeState(new Health());
		} else if (aAgent.getHp() >= AgentV2.INJURED_LOW_LIMIT) {
			aAgent.changeState(new Injured());
		}

	}

	public void fight(AgentV2 aAgent) {
		// TODO Auto-generated method stub

	}

	public void hit(AgentV2 aAgent) {
		// TODO Auto-generated method stub

	}

}
