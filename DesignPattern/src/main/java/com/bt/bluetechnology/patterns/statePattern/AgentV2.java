package com.bt.bluetechnology.patterns.statePattern;

public class AgentV2 {

	public final static int HEALTH_LOW_LIMIT = 70;
	public final static int INJURED_LOW_LIMIT = 1;
	public final static int DEAD_LOW_LIMIT = 0;
	public final static int MAX_HP = 100;

	private IAgentState _currentState = null;
	private int int_hp = 0;

	public AgentV2() {
		_currentState = new Health();
		int_hp = MAX_HP;
	}

	public int getHp() {
		return int_hp;
	}

	public IAgentState getState() {
		return _currentState;
	}

	public void seatch(final AgentV2 aAgent) {

	};

	public void changeState(IAgentState agentState) {
		this._currentState = agentState;
	}

	public void fight() {
		_currentState.fight(this);
	};

	public void hit(final int aValue) {
		if (this.getHp() - aValue >= DEAD_LOW_LIMIT) {
			int_hp = getHp() - aValue;
		}
		_currentState.hit(this);
	};

	public void heal(final int aValue) {
		if (int_hp + aValue <= MAX_HP) {
			int_hp = int_hp + aValue;
		}
		_currentState.heal(this);
	};

}
