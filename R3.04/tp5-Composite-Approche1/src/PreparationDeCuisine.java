
public abstract class PreparationDeCuisine {

	public PreparationDeCuisine() {
		// TODO Auto-generated constructor stub
	}
	protected String libelle;
	protected int prix;
	
	public abstract String toString();
	public abstract int getPrix();
	//
	public boolean existeComposant(PreparationDeCuisine p) {
		return false;
	}
	public boolean supprimerComposant(PreparationDeCuisine p) {
		return false;
	}
	public boolean ajouterComposant(PreparationDeCuisine p) {
		return false;
	}

}
