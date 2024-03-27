
public class PreparationSimple extends PreparationDeCuisine{

	public PreparationSimple(String lib,int price) {
		this.libelle=lib;
		this.prix=price;
	}
	public int getPrix() {
		return prix;
	}

	public String toString() {
		return "Le libelle est "+this.libelle+" le prix est "+this.prix;
		
	}
	
}

