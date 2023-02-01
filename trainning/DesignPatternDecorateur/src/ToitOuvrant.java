
public class ToitOuvrant extends DecorateurVoiture {
	public ToitOuvrant(Voiture laVoiture) {
		this.voiture = laVoiture;
	}
	public String getLibelle() {
		return this.voiture.getLibelle()+" (Toit ouvrant) ;)";
		}
	public void setLibelle(String lib) {
		this.voiture.libelle=lib;
	}
	public int getPrix() {
		return this.voiture.getPrix()+2000;
	}

	public void setPrix(int price) {
		this.voiture.prix=price;
	}
	public String toString() {
		return "Le libelle est "+getLibelle()+" et le prix est "+getPrix();
	}
}
