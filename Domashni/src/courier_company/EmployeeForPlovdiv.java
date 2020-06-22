package courier_company;

public class EmployeeForPlovdiv extends Shipment {
	
	public EmployeeForPlovdiv() {
		this.level = Shipment.PLOVDIV;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Plovdiv message: " + message);
		
	}

}
