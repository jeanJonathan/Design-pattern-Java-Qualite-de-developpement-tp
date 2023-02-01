package td3;

public class CharBouclier extends CharBasique {

	public CharBouclier() {
		// TODO Auto-generated constructor stub
		nom="Char classique";
		puissanceArmes=1;
		carburant=100;
		bouclier=3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public CharBouclier(String name,int arm,int carbu,int bouc){
		nom=name;
		puissanceArmes=arm;
		carburant=carbu;
		bouclier=bouc;
	};
	public void tirerSur(CharBasique charC ) {
		charC.setCarburant(charC.getCarburant()-getPuissanceArmes());
		System.out.println("Le char Bouclier < "+getNom()+" > vient de lancer un tire sur le char Basique < "+charC.getNom()+" >.");
		System.out.println("Le char Basique < "+charC.getNom()+" > a maintenant une energie de "+charC.getCarburant()+" .");
		
		}
	public void etreToucherPar(CharBasique charC) {
		if(bouclier < 1){
			setCarburant(getCarburant()-charC.getPuissanceArmes());
			System.out.println("Le char Argile < "+getNom()+" > est enfin toucher par le char Basique < "+charC.getNom()+" >.");
			System.out.println("Le char Bouclier < "+getNom()+" > a maintenant une energie de "+getCarburant()+" .");
		}
		else {
			bouclier-=1;
			System.out.println("Le char Bouclier < "+getNom()+" > a maintenant une valeur de protection egale a  "+getBouclier()+" .");
		}
		
	};
	public int getBouclier() {
		return bouclier;
	}

	public void setBouclier(int bouclier) {
		this.bouclier = bouclier;
	}
	private int bouclier;


}
