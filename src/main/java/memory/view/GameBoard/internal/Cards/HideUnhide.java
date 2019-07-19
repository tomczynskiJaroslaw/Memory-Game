package memory.view.GameBoard.internal.Cards;

import java.awt.image.BufferedImage;

import memory.CardStatus;
import memory.model.ProxyReadOnlyModelFasade;
import memory.model.Constant;

public class HideUnhide {
	ProxyReadOnlyModelFasade proxyReadOnlyModelFasade;
	LoadCardsImages cardImages;
	Constant constant;
	
	
	public HideUnhide(ProxyReadOnlyModelFasade proxyReadOnlyModelFasade,LoadCardsImages cardImages,Constant constant) {
		this.proxyReadOnlyModelFasade = proxyReadOnlyModelFasade;
		this.cardImages = cardImages;
		this.constant = constant;
	}
	
	public BufferedImage[][] hideUnhide(){
		int ileKart = constant.getCountCardsNow();
		BufferedImage[][] tab = new BufferedImage[ileKart][ileKart];
		for (int i=0;i<ileKart;i++) {
			for (int j=0;j<ileKart;j++) {
				if (proxyReadOnlyModelFasade.getCardStatus(i, j).equals((CardStatus.hide))) {
					tab[i][j]=cardImages.getHide();
				}else {
					tab[i][j]=cardImages.getImage(proxyReadOnlyModelFasade.getIndex(i, j));
				}
				
			}
		}
		return tab;
	}
}
