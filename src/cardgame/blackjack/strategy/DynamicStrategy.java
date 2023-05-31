package cardgame.blackjack.strategy;

import cardgame.Player;

public class DynamicStrategy implements Strategy {

	private int betChps;
	private State dynamicBasic;
	private State dynamicBull;
	private State dynamicBear;
	private State state;

	public DynamicStrategy() {
		dynamicBasic = new DynamicBasicStrategy(this);
		dynamicBull = new DynamicBullStrategy(this);
		dynamicBear = new DynamicBearStrategy(this);
		state = dynamicBasic;
	}

	public int getBetChps() {
		return betChps;
	}

	public State getDynamicBasic() {
		return dynamicBasic;
	}

	public State getDynamicBull() {
		return dynamicBull;
	}

	public State getDynamicBear() {
		return dynamicBear;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public boolean isGettingHit(Player player) {
		return state.isGettingHit(player);
	}

	public int decideBetChipsValue(Player player) {
		state.handleState(player);
		//System.out.println(player.getStrategyName()); //テストコード
		return state.decideBetChipsValue(player);

	}

}
