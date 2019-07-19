package memory.model;

import java.awt.Point;
import java.awt.image.BufferedImage;

import memory.CardStatus;

public class ProxyReadOnlyModelFasade{
	
	ModelFasade modelFasade;
	
	public ProxyReadOnlyModelFasade(ModelFasade modelFasade) {
		this.modelFasade = modelFasade;
	}

	public int getIlekart() {
		return modelFasade.getIlekart();
	}

	public CardStatus getCardStatus(int x, int y) {
		return modelFasade.getCardStatus(x, y);
	}

	public int getIndex(Point point) {
		return modelFasade.getIndex(point.x,point.y);
	}
	
	public int getIndex(int x,int y) {
		return this.getIndex(new Point(x,y));
	}
	
//	public int getIndex(int x, int y) {
//		return modelFasade.getIndex(x, y);
//	}

	public int getDlkrawedzipx() {
		return modelFasade.getDlkrawedzipx();
	}

	public Constant getConstant() {
		return modelFasade.getConstant();
	}

	public int getTimeElapsed() {
		return modelFasade.getTimeElapsed();
	}
	
	
	
//	public BufferedImage getObrazKarty(int i) {
//		return modelFasade.getObrazKarty(i);
//	}
//
//	public IStatusyKartReadOnly getStatusyKartModelReadOnly() {
//		return modelFasade.getStatusyKartModelReadOnly();
//	}
//
//	public IPozycjeKartReadOnly getLosujPozycjeKart() {
//		return modelFasade.getLosujPozycjeKart();
//	}
//
//	public IObrazyKartModel getObrazyKartModel() {
//		return modelFasade.getObrazyKartModel();
//	}
	

	
}
