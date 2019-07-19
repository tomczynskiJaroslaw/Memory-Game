package memory.control;

import memory.CardStatus;

public class SecondStateOfGame extends StateOfGame{
	protected SecondStateOfGame(State state) {
		super(state);
	}

	@Override
	protected StateOfGame nextState() {
		getModelFasade().setCardStatus(clickCard, CardStatus.temporaryShow);
		if (getModelFasade().isEqualsID(getFirstShowCard(), clickCard)) {
			getModelFasade().setCardStatus(clickCard, CardStatus.parmamentShow);
			getModelFasade().setCardStatus(getFirstShowCard(), CardStatus.parmamentShow);
//				panelKart.repaintPanelKart();
			if (state.isEndOfGame()) {
				state.getCardPanel().repaint();
				state.getTimeElapsed().stop();
				state.showYouWin(state.getTimeElapsed().getTime());
			}
		} else {
			new Zakrywanie(getModelFasade(),getCardPanel(), getFirstShowCard());
			new Zakrywanie(getModelFasade(),getCardPanel(), clickCard);
		}
		//state.setStateOfGame(new FirstStateOfGame());
		return new FirstStateOfGame(state);
	}
}
