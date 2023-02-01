import java.util.ArrayList;
import java.util.List;

public class PreparationComposee extends PreparationDeCuisine {

	
	public PreparationComposee(String lib,int price) {
		this.libelle=lib;
		this.prix=price;
	}
	List<PreparationDeCuisine> enfant = new ArrayList<PreparationDeCuisine>();

	public int getPrix() {
		int sommePrix=0;
		for(PreparationDeCuisine p : enfant) {
			System.out.println(p.toString());
			sommePrix+=p.getPrix();
			}
		this.prix=sommePrix;
		return prix;
	}
	//
	public boolean existeComposant(PreparationDeCuisine p) {
		return enfant.contains(p);
	}
	public boolean supprimerComposant(PreparationDeCuisine p) {
		return enfant.remove(p);
	}
	public boolean ajouterComposant(PreparationDeCuisine p) {
		return enfant.add(p);
	}

	public String toString() {
		return "Le libelle est "+this.libelle+" le prix est "+this.prix;
	}
}
