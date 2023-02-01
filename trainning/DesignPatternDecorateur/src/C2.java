
public class C2 extends Voiture{

	public C2() {
		setLibelle("C2");
		setPrix(1300);
	}
	public String getLibelle() {
		return libelle + " (Voiture C2)";
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
