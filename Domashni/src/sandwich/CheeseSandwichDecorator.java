package sandwich;

public class CheeseSandwichDecorator extends SandwichDecorator{

	public CheeseSandwichDecorator(Sandwich decoratedSandwich) {
		super(decoratedSandwich);
	}
	
	public void createBurger() {
		decoratedSandwich.createBurger();
		setCheeseBurger(decoratedSandwich);
	}
	
	private void setCheeseBurger(Sandwich decoratedSandwich) {
		if (decoratedSandwich != null) {
			System.out.println("Cheese burger");
		}
		
	}

}
