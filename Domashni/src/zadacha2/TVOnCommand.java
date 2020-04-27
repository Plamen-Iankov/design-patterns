package zadacha2;

public class TVOnCommand implements Command {
	
	private TV tv;
	
	public TVOnCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		this.tv.turnOn();

	}

}