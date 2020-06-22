package courier_company;

public abstract class Shipment {
	
	public static int ABROAD = 1;
	public static int COUNTRY = 2;
	public static int PLOVDIV = 3;
	
	protected int level;
	
	protected Shipment nextShipment;
	
	public void setNextShipment(Shipment nextShipment) {
		this.nextShipment = nextShipment;
	}
	
	public void shipmentMessage(int level, String message) {
		
		if(this.level <= level) {
			System.out.println("Invalid Shipment");
			this.writeMessage(message);
		}
		
		if(this.nextShipment != null) {
			this.nextShipment.shipmentMessage(level, message);
		}
		
	}
	
	abstract protected void writeMessage(String message);

}
