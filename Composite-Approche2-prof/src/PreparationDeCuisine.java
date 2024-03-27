/**
 * Abstraite : PreparationDeCuisine
 * Objectif : Tester l'approche 2 du Patron Composite qui définit...
 * ... les méthodes de la composition uniquement, au niveau du Composé
 * @version 1.0
 * @author Lopistéguy Philippe
 * @date jj/mm/aa
 **/
public abstract class PreparationDeCuisine {
// CONSTANTES 	-non-

// ATTRIBUTS 	prix, libelle 
	protected int prix=0;
	private String libelle="";
	
// CONSTRUCTEURS PreparationDeCuisine, PreparationDeCuisine(String, int)
public PreparationDeCuisine () {
	this.setLibelle("");
	this.setPrix(0);
}
public PreparationDeCuisine (String libelle, int prix) {
	this.setLibelle(libelle);
	this.setPrix(prix);
}
// METHODES D'ENCAPSULATION get&set libelle, get&set prix
	public void setLibelle (String libelle) {
		this.libelle = libelle;
	}
	public String getLibelle() {
		return this.libelle;
	}
	public void setPrix (int prix) {
		this.prix = prix;
	}
	public abstract int getPrix();    // Défini dans les sous classes

// METHODES USUELLES 		toString
	public abstract String toString(String message);// Défini dans les sous classes
		
// METHODE SPECIFIQUE -non-
}
