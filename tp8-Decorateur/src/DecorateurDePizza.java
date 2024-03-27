
public abstract class DecorateurDePizza implements Pizza {

	private Pizza pizza;
	
	public DecorateurDePizza(Pizza unComposant) {
		this.pizza= unComposant;
	}
	public void setPizza(Pizza unComposant) {
		this.pizza = unComposant;
	}
	public Pizza getPizza() {
		return pizza;
	}

}
