package courier_company;

public class PreparationState implements State {
	
	private String stateName = "PREPARATION_STATE";

	@Override
	public void applyState(StateInfo stateInfo) {
		stateInfo.setState(this);
	}

	@Override
	public String getStateName() {
		return this.stateName;
	}

}
