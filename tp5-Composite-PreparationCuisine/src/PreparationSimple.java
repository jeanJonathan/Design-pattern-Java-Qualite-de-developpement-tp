
public class PreparationSimple extends PreparationDeCuisine {

	public int getPrix() {
		// TODO Auto-generated method stub
		return prix;
	}

	public void setPrix(int price) {
		prix=price;
		
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String lib) {
		libelle = lib;	
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Le libelle est "+getLibelle()+" et le prix est "+getPrix();
	}

}
