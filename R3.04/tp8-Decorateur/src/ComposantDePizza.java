
public class ComposantDePizza implements Pizza {

	public ComposantDePizza() {
		setComposant("Pizza de base : Tomate - Fromage");
	}
	private String composant;
	public String toString() {
		return "Pizza de base : Tomate - Fromage";
	}
	public String getComposant() {
		return composant;
	}
	public void setComposant(String composant) {
		this.composant = composant;
	}


}
