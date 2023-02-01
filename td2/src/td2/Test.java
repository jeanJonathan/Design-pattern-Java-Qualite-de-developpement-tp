package td2;


public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joueur jonathan = new Joueur("KNJJ123","KOFFI","Jonathan",10,"Attaquant");
		Joueur josue = new Joueur("KYJJ123","KOFFI","Josue",11,"Defenseur");
		jonathan.afficher();
		josue.afficher();
		Equipe monEquipe = new Equipe("CV","ChapelleVie");
		monEquipe.ajouterJoueur(josue);
		monEquipe.ajouterJoueur(jonathan);
		monEquipe.affcherListe();
	}
}
