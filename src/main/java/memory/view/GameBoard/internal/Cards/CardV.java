package memory.view.GameBoard.internal.Cards;

import memory.view.GameBoard.ICards;

public class CardV {
	private ICards card;
	public CardV(ICards card) {
		
		if (card==null) new NullPointerException();
		this.card=card;
	}
	public void repaint() {
		card.repaintPanelKart();
		System.out.println(card);
	}
	
}
