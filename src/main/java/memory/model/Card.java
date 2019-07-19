package memory.model;

import java.awt.image.BufferedImage;

import memory.CardStatus;
import memory.view.GameBoard.internal.Cards.LoadCardsImages;

public class Card {
	
	private CardStatus cardStatus;
	private int id;
	
	public Card(int id) {
		this.cardStatus=CardStatus.hide;
		this.id = id;
	}
	
	public Card(int id,CardStatus cardStatus) {
		this.cardStatus=cardStatus;
		this.id = id;
	}
	
	public void setCardStatus(CardStatus cardStatus) {
		this.cardStatus=cardStatus;
	}
	
	public boolean isEqualsID(Card card) {
		if (this==card) throw new RuntimeException("compere id of the same card!");
		if (card.id == id) return true;
		return false;
	}

	public CardStatus getCardStatus() {
		return cardStatus;
	}

	public int getID() {
		return id;
	}
	
	
	
//	public BufferedImage getImage() {
//		if (statusKarty.equals(StatusyKart.zakryta)) {
//			return getImage();
//		}else {
//			return getImage(id);
//		}
//	}
	
}
