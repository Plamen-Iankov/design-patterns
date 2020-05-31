package sandwich;

public class EggSandwichDecorator extends SandwichDecorator{

	public EggSandwichDecorator(Sandwich decoratedSandwich) {
		super(decoratedSandwich);
	}
	
	public void createBurger() {
		decoratedSandwich.createBurger();
		setEggBurger(decoratedSandwich);
	}
	
	private void setEggBurger(Sandwich decoratedSandwich) {
		if (decoratedSandwich != null) {
			System.out.println("Egg burger");
		}
		
	}
	
}
