package courier_company;

public class WaitState implements State {
	
	private String stateName = "WAIT_STATE";

	@Override
	public void applyState(StateInfo stateInfo) {
		stateInfo.setState(this);
	}

	@Override
	public String getStateName() {
		return this.stateName;
	}

}
