package memory.view.GameBoard.internal.Cards;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JPanel;

import memory.control.ControlFasade;
import memory.model.Constant;
import memory.view.GameBoard.ICards;

public class Cards extends JPanel implements ICards{
	BufferedImage[][] tablicaObrazowKart;
	HideUnhide agtk;
	Constant stale;
	
	public Cards(HideUnhide agtk,Constant stale) {
		super();
		this.agtk=agtk;
		this.stale=stale;
		repaintPanelKart();
	}

	/* (non-Javadoc)
	 * @see memory.view.GameBoard.internal.Cards.ICards#paintComponent(java.awt.Graphics)
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		
		
		g.setColor(Color.red);
		g.fillRect(0, 0, 100, 100);
		
		int dl = stale.getDlkrawedzipx();
		for (int i=0;i<tablicaObrazowKart.length;i++) {
			for (int j=0;j<tablicaObrazowKart[0].length;j++) {
				g.drawImage(tablicaObrazowKart[i][j],dl*i, dl*j, null);
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see memory.view.GameBoard.internal.Cards.ICards#repaintPanelKart()
	 */
	public void repaintPanelKart() {
		
		tablicaObrazowKart=
				agtk.hideUnhide();
		this.repaint();
	}
	





	



}
