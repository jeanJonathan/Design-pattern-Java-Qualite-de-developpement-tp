
public class Gps extends DecorateurVoiture {
	
	//Ce constructeur est tres important pour l'instanciation dans le main
	public Gps(Voiture laVoiture) {
		this.voiture=laVoiture;
		}
	public String getLibelle() {
		return this.voiture.getLibelle() + " (GPS) ;)";
		}
	public void setLibelle(String lib) {
		this.voiture.libelle=lib;
	}

	public int getPrix() {
		return this.voiture.getPrix()+1000;
	}

	public void setPrix(int price) {
		this.voiture.prix=price;
		
	}
	public String toString() {
		return "Le libelle est "+getLibelle()+" et le prix est "+getPrix();
	}
	
}
