package memory.control;

import java.awt.Point;
import java.lang.reflect.WildcardType;

import memory.model.Constant;
import memory.model.ModelFasade;
import memory.model.ProxyReadOnlyModelFasade;
import memory.view.GameBoard.GameBoard;
import memory.view.GameBoard.internal.Cards.CardV;

public class State {
	StateOfGame stateOfGame;
	
	ModelFasade modelFasade;
	Point firstShowCard;
	Constant constant;
	IsEndOfGame isEndOfGame;
	TimeElapsed odliczanieCzasu;
	GameBoard board;
	public State(ModelFasade modelFasade,GameBoard board) {
		super();
		this.modelFasade = modelFasade;
		this.board = board;
		this.stateOfGame = new StartStateOfGame(this);
//		this.isEndOfGame = modelFasade.isEndOfGame()//new IsEndOfGame(modelFasade.getConstant().getCountCardsNow());
		this.odliczanieCzasu = new TimeElapsed(board.getTimer(), modelFasade);
//		odliczanieCzasu.run(board, modelFasade);
	}
	
	public void next(Point position) {
		stateOfGame = stateOfGame.next(position);
	}

	public CardV getCardPanel() {
		return board.getCard();
	}

	public ModelFasade getModelFasade() {
		return modelFasade;
	}
	public Point getFirstShowCard() {
		return firstShowCard;
	}

	public void setModelFasade(ModelFasade modelFasade) {
		this.modelFasade = modelFasade;
	}
	public void setFirstShowCard(Point firstShowCard) {
		this.firstShowCard = firstShowCard;
	}
	public void setStale(Constant stale) {
		this.constant = stale;
	}
	public void setIsEndOfGame(IsEndOfGame isEndOfGame) {
		this.isEndOfGame = isEndOfGame;
	}
	public void setOdliczanieCzasu(TimeElapsed odliczanieCzasu) {
		this.odliczanieCzasu = odliczanieCzasu;
	}
	public Constant getStale() {
		return constant;
	}
	public boolean isEndOfGame() {
		return modelFasade.isEndOfGame();
	}
	public TimeElapsed getTimeElapsed() {
		return odliczanieCzasu;
	}

	public void showYouWin(int time) {
		board.showYouWin(time);
		
	}
	
	
	
}
