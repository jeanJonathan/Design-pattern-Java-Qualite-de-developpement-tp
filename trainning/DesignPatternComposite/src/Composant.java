
public abstract class Composant {
	protected String nom;
	protected int niveau;
	String getNom() {return nom;}
	int getNiveau() {return niveau;}
	
	// Declaration l'interface metier de la structure 
	public abstract void operation();
	
	public Composant(String nom) {
		this.nom = nom;
	}
	
}
 