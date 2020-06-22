package courier_company;

public class EmployeeForTheCountry extends Shipment {
	
	public EmployeeForTheCountry() {
		this.level = Shipment.COUNTRY;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Country message: " + message);
		
	}

}
