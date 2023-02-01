
public abstract class Graphique {
	
	//Operation metier 
	public abstract void afficher();
	public abstract void effacer();
	public abstract void deplacerDe(int x,int y);
	
	//Methode propre au patron 
	public boolean ajouter(Graphique unGraphique) {return false;}
	public boolean supprimer(Graphique unGraphique) {return false;}
	public boolean existeGraphique(Graphique unGraphique) {return false;}

	//Methode complementaire 
	public boolean estComposee() {
		return false;
	}

}
