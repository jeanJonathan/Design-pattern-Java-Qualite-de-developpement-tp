package td3;

public class CharBasique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public CharBasique(String name,int arme,int carbu) {
		nom=name;
		puissanceArmes=arme;
		carburant=carbu;
	};
	public CharBasique() {
		nom= "CharClasique";
		puissanceArmes=10;
		carburant=100;
	};
	public void tirerSur(CharBasique charC ) {
		charC.setCarburant(charC.getCarburant()-getPuissanceArmes()); // charC.etreToucherPar(this); // Ici this est remplacer par charC dans ce cas 
		System.out.println("Le char Basique < "+getNom()+" > vient de lancer un tire sur le char Basique < "+charC.getNom()+" >.");
		System.out.println("Le char Basique < "+charC.getNom()+" > a maintenant une energie de "+charC.getCarburant()+" .");
		} 
	public void etreToucherPar(CharBasique charC) {
		//carburant-= charC.getPuissanceArmes();
		setCarburant(getCarburant()-charC.getPuissanceArmes());
		System.out.println("Le char Basique < "+getNom()+" > a ete toucher par le char Basique < "+charC.getNom()+" >.");
		System.out.println("Le char Basique < "+getNom()+" > a maintenant une energie de "+getCarburant()+" .");
	};
	
	public int getPuissanceArmes() {
		return puissanceArmes;
	}
	public void setPuissanceArmes(int puissanceArmes) {
		this.puissanceArmes = puissanceArmes;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCarburant() {
		return carburant;
	}
	public void setCarburant(int carburant) {
		this.carburant = carburant;
	}
	protected int puissanceArmes;
	protected String nom;
	protected int carburant;
	

	

}
