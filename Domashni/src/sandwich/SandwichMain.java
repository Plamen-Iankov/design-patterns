package sandwich;

public class SandwichMain {

	public static void main(String[] args) {
		
		SandwichFacade sandwichF = new SandwichFacade();
		
		sandwichF.createClassicBurger();
		sandwichF.createClassicBurgerWithCheese();
		sandwichF.createClassicBurgerWithEgg();

	}

}
