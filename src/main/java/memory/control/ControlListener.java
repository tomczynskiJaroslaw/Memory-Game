package memory.control;


import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import memory.CardStatus;
import memory.model.ModelFasade;
import memory.view.GameBoard.GameBoard;
import memory.view.GameBoard.internal.Cards.CardV;
import memory.view.GameBoard.internal.Cards.Cards;
import memory.model.Constant;

public class ControlListener {
//	StateOfGame stateOfGame;
	State state;
	
//	ModelFasade modelFasade;
	CardV cardPanel;
	//Cards cards;
//	
//	Point firstShowCard;
//	Player player;
//	Constant stale;
//	IsEndOfGame isEndOfGame;
//	OdliczanieCzasu odliczanieCzasu;

	public ControlListener(GameBoard board,ModelFasade modelFasade) {
		this.cardPanel=board.getCard();
		this.state = new State(modelFasade,board);
	}

	public void chooseCard(Point position) {
		state.next(position);
		cardPanel.repaint(); 
	}

}
