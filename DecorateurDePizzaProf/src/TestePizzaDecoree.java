/**
 * Classe : TestePizzaDecoree
 * Objectif : Exemple pratique du Patron de Conception D�corateur
 * @version 1.0
 * @author Lopist�guy Philippe
 * @date jj/mm/aa
 **/
public class TestePizzaDecoree {
	// CONSTANTES 				-non-
	// ATTRIBUTS 				-non-
	// CONSTRUCTEURS 			-non-
	// METHODES D'ENCAPSULATION -non-
	// METHODES USUELLES 		-non-
	// METHODES SPECIFIQUES 	-non-

	// METHODE PRINCIPALE : main () exemple du D�corateur avec Pizza
	public static void main(String[] args) {

		// Cr�ation d'une pizzaSimple
		InterfaceDePizza pizzaSimple = new PizzaDeBase(); 

		System.out.println(pizzaSimple.toString()); // Affiche sa constitution :
		/// Pizza : Tomate + Fromage

		// ... puis on la transforme
		pizzaSimple = new DecorerAvecOlives (pizzaSimple);      // ... en la dotant d'Olives
		pizzaSimple = new DecorerAvecChampignons (pizzaSimple); // ... puis de Champignons

		System.out.println(pizzaSimple.toString()); // Affiche sa new constitution :
		/// Pizza : Tomate + Fromage
		/// ******avec des Olives
		/// ******avec des Champignons
	}
}
