package td3;

public class GrosChar extends CharBasique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public GrosChar(String name,int arme,int carbu,int bouc) {
		nom=name;
		puissanceArmes=arme;
		carburant=carbu;
		bouclier=bouc;
	};
	public void tirerSur(CharBasique charC ) {
		charC.setCarburant(charC.getCarburant()-getPuissanceArmes());
		System.out.println("Le Gros char < "+getNom()+" > vient de lancer un tire sur le char Basique < "+charC.getNom()+" >.");
		System.out.println("Le Gros char < "+charC.getNom()+" > a maintenant une energie de "+charC.getCarburant()+" .");
		}
	public void etreToucherPar(CharBasique charC) {
		if(bouclier < 1){
			setCarburant(getCarburant()-charC.getPuissanceArmes());
			System.out.println("Le char Argile < "+getNom()+" > est enfin toucher par le char Basique < "+charC.getNom()+" >.");
			System.out.println("Le char Bouclier < "+getNom()+" > a maintenant une energie de "+getCarburant()+" .");
		}
		else {
			bouclier-=1;
			System.out.println("Le Gros char < "+getNom()+" > a maintenant une valeur de protection egale a  "+getBouclier()+" .");
		}
		
	};
	public GrosChar() {
		nom="Char classique";
		bouclier=1;
		puissanceArmes=1;
		carburant=2*100;
	}
	
	public int getBouclier() {
		return bouclier;
	}

	public void setBouclier(int bouclier) {
		this.bouclier = bouclier;
	}
	public int getPuissanceArme() {
		return puissanceArmes;
	}

	public void setPuissanceArme(int puissanceArme) {
		this.puissanceArmes = puissanceArme;
	}
	private int bouclier;

}
