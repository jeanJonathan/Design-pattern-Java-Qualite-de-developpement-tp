
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// On l'appel racine car elle contient tout les elements
		Composee composee1=new Composee("Composee1");
		composee1.ajouterComposant(new Simple("Fichier 11"));
		Composee composee2=new Composee("Composee2");
		composee1.ajouterComposant(composee2); // Le composee 2 devient un sous composite du composee1
		
		composee1.ajouterComposant(new Simple("Fichier 11"));
		composee1.ajouterComposant(new Simple("Fichier 12"));

		composee2.ajouterComposant(new Simple("Fichier 21"));

		//Pour appliquer l'element a tout les composants, j'appel alors 
		composee1.operation();
	}
	
	/*Le principe c'est l'affichage des composees puis directement des enfants des composees
	 directement tres important !!! (Le composee et ses enfant doivent se suivre en affichage si il y a appel
	 
	 Dans notre cas des qu'Il affiche l'enfant (Fichier21) du composee2 ce enfant devient automatiquement l'enfant du 
	 composee1 donc il affiche ensuite egalement
	 Puis continue son affichage en affichant les enfants du composee1* */

}
