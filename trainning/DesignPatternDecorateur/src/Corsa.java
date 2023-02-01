
public class Corsa extends Voiture{

	public Corsa() {
		setLibelle("Corsa");
		setPrix(1000);
	}
	public String getLibelle() {
		return libelle + " (Voiture Corsa)";
	}
	public int getPrix() {
		return this.prix;
	}
	public void setLibelle(String lib) {
		libelle= lib;
	}
	public void setPrix(int price) {
		prix=price;
	}
	public String toString() {
		return "Le libelle est "+getLibelle()+" et le prix est "+getPrix();
	}
	
}
