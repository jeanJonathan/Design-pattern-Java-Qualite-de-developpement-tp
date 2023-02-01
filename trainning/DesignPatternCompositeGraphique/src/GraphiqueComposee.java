import java.util.HashSet;
import java.util.Set;

public class GraphiqueComposee extends Graphique {

	private Set<Graphique> enfant = new HashSet<Graphique>();
	public GraphiqueComposee() {
		super();
		this.enfant = new HashSet<Graphique>();
	}
	public void afficher() {
		System.out.println("Ecriture du motif en ligne l et colonne c");
		for(Graphique g:enfant) {
			g.afficher();
		}
	}
	public void effacer() {
		System.out.println("Ecriture du motif(vide a la place de l'ancien present)en ligne l et colonne c");
		for(Graphique g:enfant) {
			g.effacer();
		}
	}
	public void deplacerDe(int x, int y) {
		//
		for(Graphique g:enfant) {
			g.deplacerDe(x,y);
		}
	}
	
	// 
	public boolean ajouter(Graphique unGraphique) {
		if(enfant==null) { // Si l'enfant n'existe pas 
			return false;
		}
		return enfant.add(unGraphique);}
	
	public boolean supprimer(Graphique unGraphique) {
		if(enfant==null) {
			return false;
		}
		return enfant.remove(unGraphique);}
	
	
	public boolean estComposee() {
		if(enfant !=null) {
		return true;
		}
	return false;
	}
	public boolean existeGraphique(Graphique unGraphique) {
		// TODO Auto-generated method stub
		if(enfant !=null) {return true;}
		return false;
	}

	
}