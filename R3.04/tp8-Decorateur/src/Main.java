
public class Main {

	public static void main(String[] args) {
		Pizza unePizzaAvecOlive = new DecorateurAvecOlive(new ComposantDePizza());
		System.out.println(unePizzaAvecOlive.toString());
		
		Pizza unePizzaAvecChampignon = new DecorateurAvecChampignons(new ComposantDePizza());
		System.out.println(unePizzaAvecChampignon.toString());	
		
		/*Ce rappel decoule de la methode du corro du prof*/
		/*On peut donc remarquer que pour creer une pizza simple*/
		Pizza unePizzaSimple = new ComposantDePizza();
		System.out.println(unePizzaSimple.toString());
		/*On veut maintenant ajouter du champignon*/
		
		unePizzaSimple = new DecorateurAvecChampignons(unePizzaSimple);
		System.out.println(unePizzaSimple.toString());
	}

}
