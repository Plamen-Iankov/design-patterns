package courier_company;

import java.util.ArrayList;
import java.util.List;


public class Order implements Observable {
	
	private List<Observer> orders = new ArrayList<Observer>();
	private String name;
	
	public void setName(String name) {
		this.name = name;
		this.notifyObserver();
	}

	@Override
	public void takeOrder(Observer observer) {
		
		this.orders.add(observer);
		observer.setOrder(this);

	}

	@Override
	public void goesToTheEmployee(Observer observer) {
		final boolean ready = true;
		
		if (ready) {
			System.out.println("Goes to the employee and take the order.");
		}
		return;

	}

	@Override
	public void notifyObserver() {
		
		for(Observer observer: this.orders) {
			observer.update();
		}

	}

	@Override
	public String getUpdate() {
		return this.name;
	}

}
