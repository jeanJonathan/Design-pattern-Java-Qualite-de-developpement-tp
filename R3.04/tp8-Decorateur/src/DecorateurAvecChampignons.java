
public class DecorateurAvecChampignons extends DecorateurDePizza {

	public DecorateurAvecChampignons(Pizza unePizza) {
		super(unePizza);
	}
	public String toString() {
		return this.getPizza()+" (Avec des champignons)";
	}
}
