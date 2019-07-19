package memory.control;

public class StartStateOfGame extends StateOfGame{
	public StartStateOfGame(State state) {
		super(state);
	}

	@Override
	protected StateOfGame nextState() {
		return new FirstStateOfGame(super.state);
	}
}
