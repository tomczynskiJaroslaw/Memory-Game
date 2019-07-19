package memory.control;

import java.awt.Point;

import memory.model.Constant;
import memory.model.ModelFasade;
import memory.view.GameBoard.internal.Cards.CardV;


public abstract class StateOfGame {
	State state;
	
	Point clickCard;
	
	protected StateOfGame(State state) {
		this.state=state;
	}
	
	abstract protected StateOfGame nextState();
	
	public StateOfGame next(Point position) {
		clickCard = position;
		return nextState();
	}

	public CardV getCardPanel() {
		return state.getCardPanel();
	}

	public ModelFasade getModelFasade() {
		return state.getModelFasade();
	}

	public Point getFirstShowCard() {
		return state.getFirstShowCard();
	}

	public void setFirstShowCard(Point firstShowCard) {
		state.setFirstShowCard(firstShowCard);
	}

	public void setOdliczanieCzasu(TimeElapsed odliczanieCzasu) {
		state.setOdliczanieCzasu(odliczanieCzasu);
	}

	public Constant getStale() {
		return state.getStale();
	}


	public TimeElapsed getTimeElapsed() {
		return state.getTimeElapsed();
	}

}
