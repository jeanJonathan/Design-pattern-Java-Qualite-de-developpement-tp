
public class TestComposite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1- Creation de la preparation composee pate bolo
		PreparationComposee preparationPateBolo = new PreparationComposee();
		preparationPateBolo.setLibelle("patesBolo");
		preparationPateBolo.setPrix(40);
		
		//Creation de la preparation simple pate
		PreparationSimple preparationPate = new PreparationSimple();
		preparationPate.setLibelle("pate");
		preparationPate.setPrix(15);
		
		// Ajouter la pate pour former la pate bolo ;)
		preparationPateBolo.ajouterComposant(preparationPate);
		
		//Creation de la preparation composee sauceBolo
		PreparationComposee preparationSauceBolo = new PreparationComposee();
		preparationSauceBolo.setLibelle("sauceBolo");
		preparationSauceBolo.setPrix(25);
		
		// Ajouter la sauce Bolo pour former la pate bolo ;)
		preparationPateBolo.ajouterComposant(preparationSauceBolo);
		
		// 2- Creation de la preparation simple viande Hachee
		PreparationSimple preparationViandeHachee = new PreparationSimple();
		preparationViandeHachee.setLibelle("viandeHachee");
		preparationViandeHachee.setPrix(20);
		
		// Ajouter la viande Hachee pour former la pate Bolo ;)
		preparationSauceBolo.ajouterComposant(preparationViandeHachee);
		
		//Creation de la preparation Composee sauce Tomate
		PreparationComposee preparationSauceTomate = new PreparationComposee();
		preparationSauceTomate.setLibelle("sauceTomate");
		preparationSauceTomate.setPrix(15);
		// Ajouter la sauce tomate pour former la sauce Bolognaise ;)
		preparationSauceBolo.ajouterComposant(preparationSauceTomate);
		
		//3- Creation de la preparation simple tomate cuite
		PreparationSimple preparationTomateCuite = new PreparationSimple();
		preparationTomateCuite.setLibelle("tomateCuite");
		preparationTomateCuite.setPrix(10);
		// Ajouter la tomate cuite pour former la sauce tomate;)
		preparationSauceTomate.ajouterComposant(preparationTomateCuite);
		
		//Creation de la preparation simple assaisonnement
		PreparationSimple preparationAssaisonnement = new PreparationSimple();
		preparationAssaisonnement.setLibelle("assaisonnement");
		preparationAssaisonnement.setPrix(5);
		
		// Ajouter la tomate cuite pour former la sauce tomate;)
		preparationSauceTomate.ajouterComposant(preparationAssaisonnement);
		
		
		/* 7- Affihcher les composees de la pates Bolo y comprix les prix de revients
		de chacun de ses composants */
		
		//System.out.println(preparationPateBolo.toString());
		
		System.out.println(preparationPateBolo.getPrix());
		/*Rmq fondamentale: On a plusieurs affichage car chaque enfant composee affiche ses propres composants
		 * reccursivement */
		
	}
}
