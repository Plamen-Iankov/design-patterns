package courier_company;

public class Received_Order implements Observer {
	
	private String name;
	private Observable order;
	
	public Received_Order(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(order == null) {
			System.out.println("No Order!");
			return;
		}
		
		String orderName = order.getUpdate();
		System.out.println(this.getName() + "updated to:" + orderName);

	}

	@Override
	public void setOrder(Observable order) {
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
