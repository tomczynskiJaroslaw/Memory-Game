package memory.view.GameBoard.internal.Cards;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


import memory.model.Constant;

public class LoadCardsImages {
	private final int wymiarObrazka;
	private final int ileKart;
	private BufferedImage images[];
	
	public LoadCardsImages(Constant constans) {
		Constant stale =  constans;
		wymiarObrazka=stale.getDlkrawedzipx();
		ileKart=stale.getIlekart();
		load();
	}
	
	public BufferedImage getImage(int id) {
		return images[id];
	}
	
	public BufferedImage getHide() {
		return images[images.length-1];
	}
	
	private void load() {
		// int zakres = rozmiar*rozmiar/2;
		images = new BufferedImage[ileKart * ileKart];
		BufferedImage tmp = null;
		try {
			tmp = ImageIO.read(new File("karty.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		int n = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				images[n] = tmp.getSubimage(i * wymiarObrazka, j * wymiarObrazka, wymiarObrazka, wymiarObrazka);
				n++;
			}
		}
	}
}
