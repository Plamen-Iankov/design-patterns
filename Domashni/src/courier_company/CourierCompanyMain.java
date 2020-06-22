package courier_company;

public class CourierCompanyMain {
	
	private static Shipment getChain() {
		
		Shipment abroadOrder = new EmployeeForAbroad();
		Shipment countryOrder = new EmployeeForTheCountry();
		Shipment plovdivOrder = new EmployeeForPlovdiv();
		
		plovdivOrder.setNextShipment(countryOrder);
		countryOrder.setNextShipment(abroadOrder);
		return plovdivOrder;
		
	}

	public static void main(String[] args) {
		
		
		Order order = new Order();
		
		Observer kolet = new Received_Order("Kolet");
		Observer pismo = new Received_Order("Pismo");
		
		order.takeOrder(kolet);
		order.takeOrder(pismo);
		
		order.setName("New Order!");
		
		
		
		StateInfo boy = new StateInfo("Ivan");
		WaitState waitState = new WaitState();
		PreparationState preparationState = new PreparationState();
		
		waitState.applyState(boy);
		
		State boyState = boy.getState();
		String currentState = boyState.getStateName();
		System.out.println("Current state is: " + currentState);
		
		
		Shipment chain = getChain();
		chain.shipmentMessage(1, "Abroad shipment: Germany");
		chain.shipmentMessage(3, "Plovdiv: Gagarin");
		
		

	}

}
