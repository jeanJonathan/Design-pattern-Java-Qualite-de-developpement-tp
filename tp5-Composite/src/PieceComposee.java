import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PieceComposee extends PieceComposant{
	//Declaration du constructeur 
	public PieceComposee(String namePiece,int prixPiece) {
		libelle=namePiece;
		prix=prixPiece;
	}
	// enfant = pieceComposant pour memoriser l'adresse de ses PiecesComposant
	private List<PieceComposant> pieceComposant=new ArrayList<PieceComposant>();
	
	/*Cette methode retourne le prix total du composee en fin mais
	 *  aussi celui de chaque composant */
	public int getPrix() {
		int sommePrix=0;
	//Pour parcourir la liste des composants 
		//Pour chaque piece composant c de la liste des pieceComposant
	for(PieceComposant c:pieceComposant) {
		System.out.println(c.getPrix()); // Affiche le composee mais aussi tout les composants qui se trouve dans le composee 
		sommePrix+=c.getPrix();
	}
	setPrix(sommePrix);
	return prix;
	}
	public void afficherPrix() {
		System.out.println("Le prix total du compose "+getLibelle()+" est donc de : "+getPrix());
	}
	public boolean ajouterComposant(PieceComposant unePiece) {
		return pieceComposant.add(unePiece);
	}
	public boolean retirerComposant(PieceComposant unePiece) {
		return pieceComposant.remove(unePiece);
	}
	/*
	public boolean existeComposant(PieceComposant unePiece) {
		if(unePiece!=null) {
			return true;
		}
		return false;
	}
	*/
	public boolean existeComposant(PieceComposant unePiece) {
		return pieceComposant.contains(unePiece);
	}
	// Afficher la liste des composants
	public List<PieceComposant> getChilds(){
		return pieceComposant;
	}
	public void setPrix(int price) {prix=price;}
}
