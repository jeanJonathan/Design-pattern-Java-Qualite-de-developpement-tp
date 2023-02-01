import java.util.List;

public class Client {
	/*Il serait avantageux de connaitre la facons dont les composee s'affiche dans la console
	 * Premier ajoutee premier affichee
	 * Affichage composant et prioritairement les enfants des composants
	 * avant de passer au autres */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PieceComposant pieceManivelle = new PieceComposee("manivelle",16);
		
		/*
		PieceComposee pieceManivelle = new PieceComposee();
		pieceManivelle.setLibelle("manivelle");
		*/
		//pieceManivelle.setPrix(16);
		//System.out.println(unePieceComposee.getPrix());
		PieceComposant pieceManette = new PieceComposee("manette",14);
		
		PieceComposant pieceDejj = new PieceComposee("pieceJJ",1);
		
		//pieceManette.setLibelle("manette");
		//pieceManette.setPrix(14);	
		
		//Ajoute dans le composer pieceManette, les enfants levier, molette et bouton
		pieceManette.ajouterComposant(new PieceSimple("levier",4));
		pieceManette.ajouterComposant(new PieceSimple("molette",3));
		pieceManette.ajouterComposant(new PieceSimple("bouton",5));
		
		pieceDejj.ajouterComposant(new PieceSimple("jjk",1));
		pieceManette.ajouterComposant(pieceDejj);
		//pieceDejj.ajouterComposant(pieceManette);
		
		//Affiche le composant de la piece Manivelle mais aussi 
		//System.out.println(pieceManette.getPrix());
		
		//Ajoute le composee pieceManette 
		pieceManivelle.ajouterComposant(new PieceSimple("rondelle",1));
		pieceManivelle.ajouterComposant(pieceManette);// Le composee 2 devient un sous composite du composee1
		
		
		System.out.println(pieceManivelle.getPrix());
		
		//pieceManivelle.afficherPrix();
	}
}