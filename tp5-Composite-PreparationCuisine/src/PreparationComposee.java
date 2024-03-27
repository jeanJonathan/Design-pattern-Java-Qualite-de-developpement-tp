import java.util.HashSet;
import java.util.Set;

public class PreparationComposee extends PreparationDeCuisine {

	public int getPrix() {
		//Retroune le prix de revient de la preparation de chaque composant
		int sommePrix=0;
		//Pour chaque preparation composee p de la liste des preparation composee
		for(PreparationDeCuisine p:preparationComposee) {
			//System.out.println("On a ajoutee "+p.getLibelle()+" dont le prix est "+p.getPrix());
			System.out.println(p.toString());
			sommePrix+=p.getPrix();
		}
		setPrix(sommePrix);
		System.out.println("Le prix total de tout les composant de ce composee est : ");
		return prix;
	}
	@Override
	public String toString() {
		return "Le libelle est "+getLibelle()+" et le prix est "+getPrix();
	}

	public void setPrix(int price) {
		prix=price;
		
	}
	private Set<PreparationDeCuisine> preparationComposee = new HashSet<PreparationDeCuisine>();
	@Override
	
	public boolean estComposee() {
		return true;
	}
	public boolean ajouterComposant(PreparationDeCuisine composant) {
		return preparationComposee.add(composant);
	}

	public boolean supprimerComposant(PreparationDeCuisine composant) {	
		return preparationComposee.remove(composant);	
	}
	/*ICI C'est pour verifier si le Composant composant est un composant depreparationComposee*/
	public boolean existeComposant(PreparationDeCuisine composant) {
		return preparationComposee.contains(composant);
	}
	/*
	 * ICI C'est pour verifier l'existance d'un composant 
	public boolean existeComposant(PreparationDeCuisine composant) {
		if(composant !=null) {
			return true;
		}
		return false;
	}
	*/
	// Afficher la liste des composants
		public Set<PreparationDeCuisine> getChilds(){
			return preparationComposee;
		}

		public String getLibelle() {
			return libelle;
		}

		@Override
		public void setLibelle(String lib) {
			libelle = lib;	
		}
}
