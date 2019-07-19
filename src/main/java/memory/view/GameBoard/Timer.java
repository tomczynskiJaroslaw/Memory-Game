package memory.view.GameBoard;

import java.awt.Panel;

import javax.swing.JLabel;
import javax.swing.JPanel;

import memory.model.ProxyReadOnlyModelFasade;

class Timer{
	JLabel label;
	ProxyReadOnlyModelFasade readOnlyModelFasade;
	
	public Timer(ProxyReadOnlyModelFasade readOnlyModelFasade) {
		this.readOnlyModelFasade=readOnlyModelFasade;
		label=new JLabel();
	}
	
	public JLabel getLabel() {
		return label;
	}
	
	private void setCzas(int czas) {
		this.label.setText(czas + "");
	}
	
	public void repaint() {
		setCzas(readOnlyModelFasade.getTimeElapsed());
	}
}
