
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import memory.model.GenerateIdCards;

public class TestGenerateIdCard {
	GenerateIdCards generateIdCards;
	int[][] cardIds;
	
	@Before
	public void before() {
		cardIds=null;
		generateIdCards=null;
	}
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test//(expected = NumberFormatException.class)
	public void errorsMinus1() {
		expectedException.expect(NumberFormatException.class);
		//expectedException.expectMessage("");
		new GenerateIdCards().getIdCards(-2);
	}
	
	@Test(expected = NumberFormatException.class)
	public void errors1() {
		new GenerateIdCards().getIdCards(1);
	}
	
	
	@Test(expected = NumberFormatException.class)
	public void errors5() {
		new GenerateIdCards().getIdCards(5);
	}
	
	
	@Test
	public void dimensions2x2() {
		cardIds = new GenerateIdCards().getIdCards(2);
		assertEquals(2, cardIds.length);
		assertEquals(2, cardIds[0].length);
	}
	
	@Test
	public void dimensions4x4() {
		cardIds = new GenerateIdCards().getIdCards(4);
		assertEquals(4, cardIds.length);
		assertEquals(4, cardIds[0].length);
	}
	
	@Test
	public void dimensions6x6() {
		cardIds = new GenerateIdCards().getIdCards(6);
		assertEquals(6, cardIds.length);
		assertEquals(6, cardIds[0].length);
	}
	
	@Test
	public void dimensions8x8() {
		cardIds = new GenerateIdCards().getIdCards(8);
		assertEquals(8, cardIds.length);
		assertEquals(8, cardIds[0].length);
	}
	
	@Test
	public void pairID() {
		boardSize(2);
		boardSize(4);
		boardSize(6);
		boardSize(8);
		
	}

	public void boardSize(int dimensions) {
		cardIds = new GenerateIdCards().getIdCards(dimensions);
		for (int i=0;i<cardIds.length;i++) {
			for (int j=0;j<cardIds[0].length;j++) {
				twoTimes(i,j);
			}
		}
	}

	
	
	private void twoTimes(int n,int m) {
		int id = cardIds[n][m];
		int count=0;
		for (int i=0;i<cardIds.length;i++) {
			for (int j=0;j<cardIds[0].length;j++) {
				if (cardIds[i][j]==id) {
					count++;
				}
			}
		}
		assertEquals("["+n+"]["+m+"]",2, count);
	}
}
