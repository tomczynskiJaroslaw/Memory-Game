
import org.mockito.Mock;
import org.mockito.Mockito;

import memory.CardStatus;
import memory.model.Cards;
import memory.model.Constant;
import memory.model.GenerateIdCards;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.awt.Point;

import org.junit.Before;
import org.junit.Test;


//import static org.junit.jupiter.*;

public class TestCards {
	@Mock
	GenerateIdCards generateIdCards = mock(GenerateIdCards.class);
	
	Cards cards;
	
	@Before
	public void beforeAll() {
		
	}
	
//	@Test
//	public void test() {
//		int[][] array = {
//				{1,1,2,3},
//				{5,4,2,3},
//				{6,4,7,8},
//				{6,5,7,8},
//						};
//
//		when(generateIdCards.getIdCards(4)).thenReturn(array);
//		new TestGenerateIdCard().boardSize(4);
//		cards = new Cards(new Constant(4), generateIdCards);
//		assertEquals(1, cards.getCardID(0, 0));
//		assertEquals(7, cards.getCardID(2, 2));
//		assertEquals(7, cards.getCardID(3, 2));
//
//		assertEquals(cards.getCardStatus(2, 3), CardStatus.hide);
//		assertEquals(cards.getCardStatus(3, 1), CardStatus.hide);
//		assertEquals(cards.getCardStatus(1, 1), CardStatus.hide);
//		assertEquals(cards.getCardStatus(2, 1), CardStatus.hide);
//
//		assertEquals(true, cards.isEqualsID(new Point(1, 2), new Point(0, 2)));
//		assertEquals(true, cards.isEqualsID(new Point(0, 0), new Point(0, 1)));
//		assertEquals(false, cards.isEqualsID(new Point(2, 3), new Point(0, 2)));
//
//		cards.setCardStatus(3, 2, CardStatus.parmamentShow);
//		assertEquals(CardStatus.parmamentShow,cards.getCardStatus(3, 2));
//
//		cards.setCardStatus(3, 1, CardStatus.temporaryShow);
//		assertEquals(CardStatus.temporaryShow,cards.getCardStatus(3, 1));
//
//		cards.setCardStatus(3, 1, CardStatus.hide);
//		assertEquals(CardStatus.hide,cards.getCardStatus(3, 1));
//		//TODO: zaleznosci 1. hide 2. show / 1. show 2. hide
//	}
}
