package courier_company;

public class StateInfo {
	
	private String name;
	private String wait;
	private String preparation;
	private State state;
	
	public void Wait(String wait) {
		
		if(wait != null) {
			System.out.println("Waiting for shipment");	
		}
		
	}
	
	public void Preparation(String preparation, String wait) {
		
		if(preparation != wait) {
			System.out.println("Shipment is ready to go");
		}
		
	}
	
	public StateInfo(String name) {
		this.name = name;
	}
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	

}
