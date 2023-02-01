
public class TestComposite {

	/*REMARQUE : Les composants Simple doivent etre directement instancier dans le 
	 * constructeur mais les Composant Composee doivent l'etre par creation 
	 * de l'objet independamment : exp : Composant unComposant = new Composee("xxx",yyy);
	 * */
	public static void main(String[] args) {
		PreparationDeCuisine patesBolo=new PreparationComposee("patesBolo",2);
		
		patesBolo.ajouterComposant(new PreparationSimple("pate",2));
		PreparationDeCuisine sauceBolo= new PreparationComposee("sauceBolo",3);
		patesBolo.ajouterComposant(sauceBolo);
		sauceBolo.ajouterComposant(new PreparationSimple("viande Hachee",4));
		PreparationDeCuisine sauceTomate = new PreparationComposee("sauce Tomate",2);
		sauceTomate.ajouterComposant(new PreparationSimple("tomateCuite",2));
		sauceTomate.ajouterComposant(new PreparationSimple("assaisonnement",5));
		sauceBolo.ajouterComposant(sauceTomate);
		System.out.println(patesBolo.getPrix());
	}

}
