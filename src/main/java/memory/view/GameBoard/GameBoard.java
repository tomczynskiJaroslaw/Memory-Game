package memory.view.GameBoard;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import memory.model.ProxyReadOnlyModelFasade;
import memory.view.GameBoard.internal.Cards.CardV;
import memory.view.GameBoard.internal.Cards.Cards;
import memory.view.GameBoard.internal.Cards.HideUnhide;
import memory.view.GameBoard.internal.Cards.LoadCardsImages;
import memory.control.ControlListener;
import memory.model.Constant;
import memory.model.ModelFasade;

public class GameBoard {
	ProxyReadOnlyModelFasade readOnlyModelFasade;
	Cards card=null;
	Timer timer;

//	private JFrame ramka;

	public GameBoard(ProxyReadOnlyModelFasade readOnlyModelFasade) {
		this.readOnlyModelFasade = readOnlyModelFasade;

		HideUnhide agtk = new HideUnhide(readOnlyModelFasade,
				new LoadCardsImages(readOnlyModelFasade.getConstant()), readOnlyModelFasade.getConstant());
		card = new Cards(agtk, readOnlyModelFasade.getConstant());
		timer = new Timer(readOnlyModelFasade);

		createFrame(readOnlyModelFasade);
	}

	private void createFrame(ProxyReadOnlyModelFasade readOnlyModelFasade) {
		JFrame frame = new JFrame();
		card.repaint();
		frame.add(card);

		frame.add(timer.getLabel(), BorderLayout.SOUTH);
		Constant stale = readOnlyModelFasade.getConstant();
		int dl = stale.getDlkrawedzipx();
		int ileKart = stale.getCountCardsNow();
		card.setPreferredSize(new Dimension(ileKart * dl, ileKart * dl));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		frame.setVisible(true);
	}

	private Point getClicCard(int x, int y, int borderLength) {
		x = x / borderLength;
		y = y / borderLength;
		return new Point(x, y);
	}

	public void dodajMouseListener(final ControlListener myszka) {
		card.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				myszka.chooseCard(getClicCard(e.getX(), e.getY(), readOnlyModelFasade.getDlkrawedzipx()));
			}
		});
	}

	public void repaintPanelKart() {
		card.repaintPanelKart();
	}

	public Cards getPanelKart() {
		return card;
	}

//	public void setVisible(boolean isVisible) {
//		ramka.setVisible(isVisible);
//	}

	public void showYouWin(int time) {
		// readOnlyModelFasade.getTimeElapsed();//???
		new Win(time);
	}

	public TimerV getTimer() {
		return new TimerV(timer);
	}

	public CardV getCard() {
		return new CardV(card);
	}

}
