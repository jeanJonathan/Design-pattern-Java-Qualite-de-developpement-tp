/**
 * Classe : DecorateurDePizza
 * Objectif : Exemple pratique du Patron de Conception D�corateur
 * @version 1.0
 * @author Lopist�guy Philippe
 * @date jj/mm/aa
 **/
public abstract class DecorateurDePizza implements InterfaceDePizza  {
	// CONSTANTES 				-non-
	// ATTRIBUTS : pizzaD�cor�e
	public InterfaceDePizza  pizzaDecoree;

	// CONSTRUCTEUR 
	public DecorateurDePizza (InterfaceDePizza  pizza) {
		setPizzaDecoree (pizza);
	}
	// METHODES D'ENCAPSULATION : pizzaD�cor�e
	public void setPizzaDecoree (InterfaceDePizza pizza) {
		this.pizzaDecoree = pizza;
	}
	public InterfaceDePizza getPizzatDecoree () {
		return pizzaDecoree;
	}
}
