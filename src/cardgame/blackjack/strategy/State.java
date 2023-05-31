package cardgame.blackjack.strategy;

import cardgame.Player;

public interface State extends Strategy {

	public void handleState(Player player);

}
