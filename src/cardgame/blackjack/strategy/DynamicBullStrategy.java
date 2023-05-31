package cardgame.blackjack.strategy;

import cardgame.Player;

public class DynamicBullStrategy implements State {

	private DynamicStrategy dynamicStrategy;
	private final Strategy strategy = new BullStrategy();
	private String STRATEGY_NAME = "DynamicBullStrategy";

	public DynamicBullStrategy(DynamicStrategy dynamicStrategy) {
		this.dynamicStrategy = dynamicStrategy;
	}

	public void handleState(Player player) {

		if (player.getChipsValue() > 1200) {
			dynamicStrategy.setState(dynamicStrategy.getDynamicBull());
		} else if (player.getChipsValue() > 600) {
			dynamicStrategy.setState(dynamicStrategy.getDynamicBasic());
		} else {
			dynamicStrategy.setState(dynamicStrategy.getDynamicBear());
		}

	}

	public int decideBetChipsValue(Player player) {
		//handleState(player);
		player.setStrategyName(STRATEGY_NAME);
		System.out.println(player.getName() + ", " + player.getStrategyName() + ", 所持チップ" + player.getChipsValue());//テストコード
		return strategy.decideBetChipsValue(player);
	}

	public boolean isGettingHit(Player player) {
		return strategy.isGettingHit(player);
	}
}
