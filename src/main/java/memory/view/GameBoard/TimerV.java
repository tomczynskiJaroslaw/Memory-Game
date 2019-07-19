package memory.view.GameBoard;

public class TimerV {
	Timer timer;
	
	public TimerV(Timer timer) {
		super();
		if (timer==null) new NullPointerException(); 
		this.timer = timer;
	}

	public void repaint() {
		timer.repaint();
	}

}
