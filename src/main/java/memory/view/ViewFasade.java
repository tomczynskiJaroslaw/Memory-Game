package memory.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import memory.control.ControlListener;
import memory.control.NewGameListener;
import memory.control.TimeElapsed;
import memory.model.ModelFasade;
import memory.model.ProxyReadOnlyModelFasade;
import memory.view.GameBoard.GameBoard;
import memory.model.Constant;

public class ViewFasade {
	
	private ProxyReadOnlyModelFasade readOnlyModelFasade;
	
	
	private MainMenu menu;
	
	public ViewFasade(ProxyReadOnlyModelFasade readOnlyModelFasade) {
		this.readOnlyModelFasade=readOnlyModelFasade;
		
		menu = new MainMenu(readOnlyModelFasade);
	}
	
	public void dodajListeneraNewGame(NewGameListener newGameListener) {
		menu.dodajListeneraNewGame(newGameListener);
	}
	

	
	public void showYouWin(int time) {
		getBoard().showYouWin(time);
	}
	

	
	public void dodajListeneraWyniki(ActionListener actionListener) {
		menu.dodajListeneraWyniki(actionListener);
	}

	public void dodajListeneraExit(ActionListener actionListener) {
		menu.dodajListeneraExit(actionListener);
	}
	
	public void dodajListeneraPlansza(ControlListener mouseListener) {
		menu.dodajMouseListener(mouseListener);
	}
	
	public GameBoard getBoard() {
		return menu.getBoard();
	}
	
	public void repaintMenu() {
		menu.repaint();
	}
	
}
