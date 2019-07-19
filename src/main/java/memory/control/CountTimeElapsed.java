package memory.control;

import memory.model.ModelFasade;
import memory.view.GameBoard.TimerV;

public class CountTimeElapsed extends Thread{
	private int time=0;
	private volatile boolean stop=false;
	private ModelFasade modelFasade;
	private TimerV timer;
	
	public CountTimeElapsed(ModelFasade modelFasade, TimerV timer) {
		super();
		this.modelFasade = modelFasade;
		this.timer = timer;
	}

	@Override
	public void run() {
			while (!stop) {
				System.out.println(stop+"<-------");
				time++;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				modelFasade.setTimeElapsed(time);
				timer.repaint();
			}
		
	}

	public void setStop() {
		this.stop = true;
		System.out.println(stop+"<-------");
	}

	public int getTime() {
		return time;
	}
}