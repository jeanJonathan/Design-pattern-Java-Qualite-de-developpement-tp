
public abstract class PreparationDeCuisine {
	protected String libelle;
	protected int prix;
	
	public abstract String getLibelle();
	public abstract void setLibelle(String libelle);
	public abstract int getPrix();
	public abstract void setPrix(int price);
	public abstract String toString();
	
	//Comportement naif leur fait retrouner faux
	boolean ajouterComposant(PreparationDeCuisine composant) {
		return false;
	}
	boolean estComposee() {
		return false;
	}
	boolean supprimerComposant(PreparationDeCuisine composant) {
		return false;
	}
	boolean existeComposant(PreparationDeCuisine composant) {
		return false;
	}
}
