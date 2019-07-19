package memory.model;

public class Constant {
	private final int dlKrawedziPx;
	private final int ileKart;
	private int countCardsNow;
	
	public Constant(int countCardsNow) {
		dlKrawedziPx=160;
		ileKart=5;
		this.countCardsNow=countCardsNow;
		
	}
	
	public Constant(int dlKrawedziPx,int ileKart) {
		this.dlKrawedziPx=dlKrawedziPx;
		this.ileKart=ileKart;
	}
	
	public Constant() {
		dlKrawedziPx=160;
		ileKart=5;
		this.countCardsNow=4;
	}

	public int getDlkrawedzipx() {
		return dlKrawedziPx;
	}
	public int getIlekart() {
		return ileKart;
	}

	public int getCountCardsNow() {
		return countCardsNow;
	}

	
	
}
