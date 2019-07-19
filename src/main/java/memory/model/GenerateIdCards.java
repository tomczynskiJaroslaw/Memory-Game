package memory.model;


import java.awt.Point;
import java.util.Random;

public class GenerateIdCards {
	
	public int[][] getIdCards(int size) {
		if (size%2!=0) throw new NumberFormatException("not "+size+" even!");
		if (size<=0) throw new NumberFormatException(size+" can't be negativ!");
		
		int[][] plansza=new int[size][size];
		Random r = new Random();
		int zakres = size * size / 2;
		//przechowujemy informacje o tym ile ju� wylosowano danych index�w
		int[] tab = new int[zakres];

		plansza = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int random = r.nextInt(zakres);
				
				int n = random;
				//je�li ju� s� na planszy dwa taki indexy
				//to zwi�kszamy index a� do momentu gdy trafimy na taki
				//kt�rego jeszcze nie ma.
				//je�li dojdziemy do ko�ca i dalej nie znalei�my zaczynamy od pocz�tku
				while (tab[n] >= 2) {
					n = (n + 1) % zakres;
				}
				tab[n]++;
				plansza[i][j] = n;
			}
		}
		return plansza;
	}
	
}
