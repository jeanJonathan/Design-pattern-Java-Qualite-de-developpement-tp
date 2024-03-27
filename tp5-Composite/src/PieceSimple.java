
public class PieceSimple extends PieceComposant {

	public PieceSimple(String lib, int price) {
		libelle=lib;
		prix=price;
	}

	public int getPrix() {return prix;}

	public void setPrix(int price) {
		this.prix=price;
		
	}

	@Override
	public boolean ajouterComposant(PieceComposant unePiece) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retirerComposant(PieceComposant unePiece) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existeComposant(PieceComposant unePiece) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
