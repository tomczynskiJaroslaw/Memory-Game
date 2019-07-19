package memory.view.GameBoard;

import javax.swing.JOptionPane;

import memory.control.TimeElapsed;

public class Win {
	public Win(int time) {
		win(time);
	}
	
	public void win(int time) {
		JOptionPane.showMessageDialog(null, "czas: " + time, "WYGRALES!!!", 0);
	}
}
