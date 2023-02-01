import java.util.List;

public abstract class PieceComposant {
	protected String libelle;
	protected int prix;
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	//Operation metier du composite 
	public abstract int getPrix();
	public abstract void setPrix(int prix);
	
	public abstract boolean ajouterComposant(PieceComposant unePiece);
	public abstract boolean retirerComposant(PieceComposant unePiece);
	public abstract boolean existeComposant(PieceComposant unePiece);
	
	
}
