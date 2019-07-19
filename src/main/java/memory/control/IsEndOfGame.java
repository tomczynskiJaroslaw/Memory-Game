package memory.control;

import memory.CardStatus;
import memory.model.ProxyReadOnlyModelFasade;

public class IsEndOfGame {
	int countParmanentCardsShow;
	int countCards;
	
	public IsEndOfGame(int countCardsNow) {
		this.countCards=countCardsNow*countCardsNow;
	}
	
	public boolean isEndOfGame() {
//		boolean 
//		if () {
//			
//		}
		return countCards==countParmanentCardsShow;
	}

	public void increment(CardStatus status) {
		if (status.equals(CardStatus.parmamentShow)) countParmanentCardsShow++;;
	}
	
	
//	ProxyReadOnlyModelFasade proxyReadOnlyModelFasade;
//	public IsEndOfGame(ProxyReadOnlyModelFasade proxyReadOnlyModelFasade) {
//		this.proxyReadOnlyModelFasade=proxyReadOnlyModelFasade;
//	}
//	
//	public boolean isEndOfGame() {
//		int n = proxyReadOnlyModelFasade.getConstant().getCountCardsNow();
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<n;j++) {
//				if (!CardStatus.parmamentShow.equals(proxyReadOnlyModelFasade.getCardStatus(i, j))) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}
}
