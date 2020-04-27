package zadacha2;

public class TV {
	
	private Boolean tvOn;
	
	public void turnOn() {
		System.out.println("TV is on");
		this.tvOn = true;
	}
	
	public void turnOff() {
		System.out.println("TV is off");
		this.tvOn = false;
	}

}
