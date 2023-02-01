package td2;

public class Equipe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private final int NB_JOUEURS_MAX=11;
	private String identifiant;
	private String nom;
	private int nombreJoueur=0;
	private Joueur[] equipe=new Joueur[NB_JOUEURS_MAX];

	public Equipe(String id,String name) {
		setIdentifiant(id);
		nom = name;
	}
	
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public int getNombreJoueur() {
		return nombreJoueur;
	}
	public void setNombreJoueur(int nombreJoueur) {
		this.nombreJoueur = nombreJoueur;
	}
	public void affcherListe() {
		for(int i=0; i<=nombreJoueur;i++) {
			System.out.println("Nom du joueur: "+equipe[i].getNom()+" Prenom: "+equipe[i].getPrenom());
		}
	}	
	public void ajouterJoueur(Joueur leJoueur) {
		if(getNombreJoueur()<=NB_JOUEURS_MAX) {
			equipe[getNombreJoueur()]=leJoueur;
			setNombreJoueur(getNombreJoueur() + 1); // nombreJoueur++
		}	
		else {System.out.println("Equipe Complete");}
	}
	public void afficherNom() {
		System.out.println(nom);
	}

}
