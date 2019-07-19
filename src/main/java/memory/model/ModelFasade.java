package memory.model;

import java.awt.Point;

import memory.CardStatus;
import memory.control.IsEndOfGame;

public class ModelFasade{

	public boolean isEqualsID(Point firstCard, Point secondCard) {
		return cards.isEqualsID(firstCard, secondCard);
	}

	private int timeElapsed;
	private Cards cards;
	private Constant constant;
	
	public ModelFasade() {
		this.constant=new Constant();
	}
	
	public void createModel(int size) {
		constant = new Constant(size);
		this.cards = new Cards(this.constant,new GenerateIdCards(),new IsEndOfGame(constant.getCountCardsNow()));
	}

	public int getDlkrawedzipx() {
		return this.constant.getDlkrawedzipx();
	}

	public int getIlekart() {
		return this.constant.getIlekart();
	}
	
	public void setCardStatus(int x, int y, CardStatus status) {
		cards.setCardStatus(x, y, status);
	}

	public CardStatus getCardStatus(int x, int y) {
		return cards.getCardStatus(x, y);
	}
	
	public Constant getConstant() {
		return constant;
	}

	public void setCardStatus(Point clickCard, CardStatus status) {
		setCardStatus(clickCard.x, clickCard.y, status);
	}
	
	public CardStatus getCardStatus(Point clickCard) {
		return getCardStatus(clickCard.x, clickCard.y);
	}

	public int getIndex(int x, int y) {
		return cards.getCardID(x,y);
	}

	public int getTimeElapsed() {
		return timeElapsed;
	}

	public void setTimeElapsed(int timeElapsed) {
		this.timeElapsed = timeElapsed;
	}

	public boolean isEndOfGame() {
		return cards.isEndOfGame();
	}
	
	
}
