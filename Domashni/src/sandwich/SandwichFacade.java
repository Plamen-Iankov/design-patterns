package sandwich;

public class SandwichFacade {
	
	private Sandwich classicBurger;
	private Sandwich classicWithCheese;
	private Sandwich classicWithEgg;
	
	public SandwichFacade() {
		this.classicBurger = new ClassicBurger();
		this.classicWithCheese = new ClassicBurgerWithCheese();
		this.classicWithEgg = new ClassicBurgerWithEgg();
	}
	
	public void createClassicBurger() {
		boolean cb = true;
		if (cb) {
			this.classicBurger.createBurger();
		}
		System.out.println("Error: Burger not found");
	}
	
	public void createClassicBurgerWithCheese() {
		boolean cbc = true;
		if (cbc) {
			this.classicWithCheese.createBurger();
		}
		System.out.println("Error: Burger not found");
	}
	
	public void createClassicBurgerWithEgg() {
		boolean cbe = true;
		if (cbe) {
			this.classicWithEgg.createBurger();
		}
		System.out.println("Error: Burger not found");
	}

}
