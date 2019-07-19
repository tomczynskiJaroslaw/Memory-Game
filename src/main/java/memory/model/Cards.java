package memory.model;

import java.awt.Point;

import memory.CardStatus;
import memory.control.IsEndOfGame;

public class Cards {
	private Card[][] cards;
	private IsEndOfGame isEndOfGame;
	
	public Cards(Constant constant,GenerateIdCards generateIdCards,IsEndOfGame isEndOfGame) {
		this.isEndOfGame = isEndOfGame;
		
		int rowCount = constant.getCountCardsNow();
		int[][] idCards = generateIdCards.getIdCards(constant.getCountCardsNow());
		cards=new Card[rowCount][rowCount];
		for (int i=0;i<rowCount;i++) {
			for (int j=0;j<rowCount;j++) {
				cards[i][j] = new Card(idCards[i][j]);
			}
		}
	}

	public boolean isEqualsID(Point firstCard,Point secondCard) {
		return getCard(firstCard).isEqualsID(getCard(secondCard));
	}
	
	public void setCardStatus(int x, int y, CardStatus status) {
		isEndOfGame.increment(status);
		this.cards[x][y].setCardStatus(status);
	}
	
	private Card getCard(Point position) {
		return cards[position.x][position.y];
	}
	
	public CardStatus getCardStatus(int x,int y) {
		return this.cards[x][y].getCardStatus();
	}

	public int getCardID(int x, int y) {
		return cards[x][y].getID();
	}
	
	public boolean isEndOfGame() {
		return isEndOfGame.isEndOfGame();
	}
}
