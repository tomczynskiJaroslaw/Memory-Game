package memory.control;

import memory.model.ModelFasade;
import memory.view.GameBoard.GameBoard;
import memory.view.GameBoard.TimerV;

public class TimeElapsed{
	//private ModelFasade modelFasade;
	//private Board board;
	private CountTimeElapsed countTimeElapsed;
	public TimeElapsed(final TimerV board,final ModelFasade modelFasade) {
		//this.board=board;
		//this.modelFasade=modelFasade;
		countTimeElapsed = new CountTimeElapsed(modelFasade,board);
		new Thread(countTimeElapsed).start();
	}

	public int getTime() {
		return countTimeElapsed.getTime();
	}

	public void stop() {
		countTimeElapsed.setStop();
	}
	

}
