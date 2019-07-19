package memory.control;

import java.awt.Point;
import memory.CardStatus;
import memory.model.ModelFasade;
import memory.view.GameBoard.internal.Cards.CardV;

public class Zakrywanie {
	
	public Zakrywanie(final ModelFasade modelFasade,final CardV cardPanel, final int x, final int y) {
		init(modelFasade,cardPanel, x, y);
	}

	public Zakrywanie(final ModelFasade modelFasade,CardV cardPanel, final Point position) {
		init(modelFasade,cardPanel, position.x, position.y);
	}

	private void init(final ModelFasade modelFasade,final CardV cardPanel, final int x, final int y) {
		new Thread(new Runnable() {
			public void run() {
				czekaj(1000);
				modelFasade.setCardStatus(x, y, CardStatus.hide);
				cardPanel.repaint();
			}
		}).start();
	}
	
	private void czekaj(int czas) {
		try {
			Thread.sleep(czas);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
