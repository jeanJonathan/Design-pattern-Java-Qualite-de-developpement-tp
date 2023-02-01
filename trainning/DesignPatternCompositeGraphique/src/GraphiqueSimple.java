
/*Uniquement dans ce cas la classe GraphiqueSimple est aussi abstraite*/
public abstract class GraphiqueSimple extends Graphique{

	public void afficher() {
		dessiner(true);
	}
	public void effacer() {
		dessiner(false);
	}
	public abstract void deplacerDe(int x, int y);
	
	public abstract void dessiner(boolean dessin);
}
