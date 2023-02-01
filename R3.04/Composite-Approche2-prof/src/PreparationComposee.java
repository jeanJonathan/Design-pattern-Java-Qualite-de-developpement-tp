/**
 * Classe : PreparationComposee
 * Objectif : Tester l'approche 2 du Patron Composite qui d finit...
 * ... les m thodes de la composition uniquement au niveau du Compos 
 * @version 1.0
 * @author Lopist guy Philippe
 * @date jj/mm/aa
 **/

import java.util.*;

public class PreparationComposee extends PreparationDeCuisine {
// CONSTANTES 				-non-
// ATTRIBUTS 				
	private Set<PreparationDeCuisine> enfants = new HashSet<PreparationDeCuisine>();

// CONSTRUCTEURS PreparationComposee, PreparationComposee(String, int)
	public PreparationComposee() {
		super();
	}
	public PreparationComposee(String libelle, int prix) {
		super (libelle, prix);
	}

// METHODES D'ENCAPSULATION getPrix
	public int getPrix() {
		int resultat = this.prix;
		for (PreparationDeCuisine preparation : enfants) {
			resultat += preparation.getPrix();
		}
		return resultat;
	}
// METHODES USUELLES 		toString
	public String toString (String message) {
		String resultat;
		resultat = message + this.getLibelle() + ": prix ("+this.getPrix() + ") dont ("+this.prix+")\n";
		for (PreparationDeCuisine preparation : enfants) {
			resultat += preparation.toString(message + "..");
		}
		return resultat;
	}
	
// METHODE SPECIFIQUE       ajouterPreparationDeCuisine, supprimerPreparationDeCuisine, existePreparationDeCuisine
	public boolean ajouterPreparationDeCuisine (PreparationDeCuisine preparation) {
		return enfants.add(preparation);
	}
	public boolean retirerPreparationDeCuisine (PreparationDeCuisine preparation) {
		return enfants.remove(preparation);
	}
	public boolean existePreparationDeCuisine (PreparationDeCuisine preparation) {
		return enfants.contains(preparation);
	}
}