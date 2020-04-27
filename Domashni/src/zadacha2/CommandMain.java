package zadacha2;

public class CommandMain {

	public static void main(String[] args) {
		
		RemoteController remoteController = new RemoteController();
		TV tv = new TV();
		Command tvOnCommand = new TVOnCommand(tv);
		Command tvOffCommand = new TVOffCommand(tv);
		
		remoteController.setCommand(tvOnCommand);
		remoteController.pressButton();
		
		remoteController.setCommand(tvOffCommand);
		remoteController.pressButton();

	}

}
