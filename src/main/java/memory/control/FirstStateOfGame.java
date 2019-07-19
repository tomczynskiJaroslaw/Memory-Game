package memory.control;

import java.awt.Point;

import memory.CardStatus;

public class FirstStateOfGame extends StateOfGame {
	protected FirstStateOfGame(State state) {
		super(state);
	}

	@Override
	protected StateOfGame nextState() {
		return showFirst(clickCard);
	}
	
	private StateOfGame showFirst(Point clickCard) {
		getModelFasade().setCardStatus(clickCard, CardStatus.temporaryShow);
		setFirstShowCard(clickCard);
		return new SecondStateOfGame(state);
	}
}
