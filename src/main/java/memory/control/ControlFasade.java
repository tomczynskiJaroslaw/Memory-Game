package memory.control;

import java.awt.event.MouseAdapter;
import memory.model.ModelFasade;
import memory.view.ViewFasade;

public class ControlFasade extends MouseAdapter{
	//private ViewFasade wievFasade;
	//private ModelFasade modelFasade;
	
	private NewGameListener newGame;
	private Scores scores;
	private Exit exit;
	
	public ControlFasade(ViewFasade wievFasade, ModelFasade modelFasade) {
		//this.wievFasade = wievFasade;
		//this.modelFasade = modelFasade;
		
		newGame = new NewGameListener(wievFasade, modelFasade);
		scores = new Scores();
		exit = new Exit();
		
		wievFasade.dodajListeneraNewGame(newGame);
		wievFasade.dodajListeneraWyniki(scores);
		wievFasade.dodajListeneraExit(exit);
	}
	

	
}
