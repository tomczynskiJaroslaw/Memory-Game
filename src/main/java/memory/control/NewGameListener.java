package memory.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import memory.model.ModelFasade;
import memory.view.ViewFasade;
import memory.view.GameBoard.GameBoard;

public class NewGameListener {

	private ViewFasade wievFasade;
	private ModelFasade modelFasade;

	public NewGameListener(ViewFasade wievFasade, ModelFasade modelFasade) {
		this.wievFasade=wievFasade;
		this.modelFasade = modelFasade;
		
	}

	public void startGame(int size) {
		modelFasade.createModel(size);
		wievFasade.repaintMenu();
		//new TimeElapsed(wievFasade.getBoard(),modelFasade);
		ControlListener controlListener = new ControlListener(wievFasade.getBoard(),modelFasade);
		wievFasade.getBoard().dodajMouseListener(controlListener);
	}
}
