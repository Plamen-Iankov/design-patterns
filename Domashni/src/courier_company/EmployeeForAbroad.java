package courier_company;

public class EmployeeForAbroad extends Shipment {
	
	public EmployeeForAbroad() {
		this.level = Shipment.ABROAD;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Abroad message: " + message);
	}

}
