package sandwich;

public abstract class SandwichDecorator implements Sandwich {
	
	protected Sandwich decoratedSandwich;
	
	public SandwichDecorator(Sandwich decoratedSandwich) {
		this.decoratedSandwich = decoratedSandwich;
	}

	@Override
	public void createBurger() {
		this.decoratedSandwich.createBurger();
	}

}
