package td3;
import java.util.Random;

public class CharArgile extends CharBasique{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void etreToucherPar(CharBasique charC) {
		Random rand = new Random();
		int n = rand.nextInt(100);
		if(n<=20) {
			//carburant-= charC.getPuissanceArmes();
			setCarburant(getCarburant()-charC.getPuissanceArmes());
			System.out.println("Le char Argile < "+getNom()+" > vient d'etre toucher par le char Basique < "+charC.getNom()+" >.");
			System.out.println("Le char Argile < "+getNom()+" > a maintenant une energie de "+getCarburant()+" .");
		}
		else {
			System.out.println("Le char argile < "+getNom()+" > vient d'intercepter le coup du char Basique < "+charC.getNom()+" >.");
		}
		
	};
	public void tirerSur(CharBasique charC ) {
		charC.setCarburant(charC.getCarburant()-getPuissanceArmes());
		System.out.println("Le char Argile < "+getNom()+" > vient de lancer un tire sur le char Basique < "+charC.getNom()+" >.");
		System.out.println("Le char Basique < "+charC.getNom()+" > a maintenant une energie de "+charC.getCarburant()+" .");
		
		}
	public CharArgile(){
		puissanceArmes=5;
	};
	
	public CharArgile(String name,int arm,int carbu){
		nom=name;
		puissanceArmes=arm;
		carburant=carbu;
	};
	
	public int getPuissanceArme() {
		return puissanceArmes;
	}

	public void setPuissanceArme(int puissanceArme) {
		this.puissanceArmes = puissanceArme;
	}
	
}
