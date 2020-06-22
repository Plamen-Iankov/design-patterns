package courier_company;

public interface State {
	public void applyState(StateInfo stateInfo);
	public String getStateName();

}
