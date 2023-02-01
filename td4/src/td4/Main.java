package td4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("Jean-Jonathan");
		list.add("KOF");
		
		System.out.println(list);
		*/
		/*
		Map<String,Integer> ages= new HashMap<>();
		ages.put("Jonathan",22);
		ages.put("Josue",26);
		ages.put("Joel",28);
		ages.put("Josias",24);
		System.out.println(ages.toString());
		System.out.println(ages.get("Jonathan"));
		ages.remove("Jonathan");
		System.out.println(ages.toString());
		*/
		// Creation de deux articles
		Article monArticle1=new Article("Pyjama","Knjj",1000.25);
		Article monArticle2=new Article("Pantalon","Kooqw",2000.25);
		Article monArticle3=new Article("Chemise","Kjhn",3000.25);
		// Test 
		System.out.println(monArticle1.getCodeBarre());
		System.out.println(monArticle1.getLibelle());
		System.out.println(monArticle1.getPrix());
		
		// Creaion d'un articleSolde
		ArticleSolde monArticleSolde=new ArticleSolde("Pyjama","Knjj",1000.25,10);
		
		// Test OK
		System.out.println(monArticleSolde.getPrix());
		
		// Creation d'un gestionnaire d'Artcile 
		GestionArticle monGestionnaire = new GestionArticle("Knjj",monArticle1);

		// Test OK
		System.out.println(monGestionnaire.getPrix("Knjj"));
		
		// Test de la methode ajouterArticle OK
		monGestionnaire.ajouterArticle("Kooqw",monArticle2);
		monGestionnaire.ajouterArticle("Kjhn",monArticle3);

		System.out.println(monGestionnaire.getPrix("Kooqw"));
		
		// Test de la methode supprimerArticle OK
		//monGestionnaire.supprimerArticle(monArticle2);
		// Test de la methode supprimerArticle (A partir du codeBarre (cle))OK
		//monGestionnaire.supprimerArticle("Knjj");
		//Afficher le gestionnaire OK rma . On a bien l'affichage du couple de cle valeur ou les valeur sont des objets
		monGestionnaire.afficherGestionnaire(monGestionnaire);
		
		// Test de la methode setPrix et getPrix OK 
		monGestionnaire.setPrix("Kjhn",10000);
		System.out.println(monGestionnaire.getPrix("Kjhn"));
		
	}

}
