
public class DecorateurAvecOlive extends DecorateurDePizza {

	public DecorateurAvecOlive(Pizza unComposant) {
		super(unComposant);
	}
	public String toString() {
		return this.getPizza()+ "(Avec des olives)";
	}

}
