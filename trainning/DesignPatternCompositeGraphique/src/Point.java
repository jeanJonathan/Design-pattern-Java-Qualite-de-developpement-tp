
public class Point extends GraphiqueSimple {
	private int ligne,colonne;
	char motif;
	
	public Point(int x,int y,char unMotif) {
		unMotif='o';
		ligne=x;
		colonne=y;
	}
	void definir(int x,int y) {
		ligne=x;
		colonne=y;
	}
	public int getLigne() {
		return ligne;
	}
	public void setLigne(int ligne) {
		this.ligne = ligne;
	}
	public int getColonne() {
		return colonne;
	}
	public void setColonne(int colonne) {
		this.colonne = colonne;
	}
	public char getMotif() {
		return motif;
	}
	public void setMotif(char motif) {
		this.motif = motif;
	}
	public void dessiner(boolean estDessinable) {
		if(estDessinable==true) {
			System.out.println("Ecriture du motif en ligne l et colonne c");
		}	
	}
	public void deplacerDe(int x, int y) {
		ligne+=x;
		colonne+=y;		
	}
}
