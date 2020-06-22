package courier_company;

public interface Observable {

	public void takeOrder(Observer observer);
	public void goesToTheEmployee(Observer observer);
	public void notifyObserver();
	public String getUpdate();
	
}
