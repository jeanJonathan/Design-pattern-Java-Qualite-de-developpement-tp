package coaching1;

public class RecapCours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		String nom="Jonathan";
		System.out.println(nom);
		
		final double MA_MOYENNE=15.33;
		System.out.println(MA_MOYENNE);
		
		boolean estVraie =true;
		if(MA_MOYENNE == 15.33 ) {
			System.out.println("Ma moyenne est exacte");
		}
		
		double monTableau[]= {1,2,3};
		System.out.println(monTableau.length);
	
		for(int i=0;i<=5;i++) {
			System.out.println("Hello Jonathan, que Dieu te benisse !");
		}		
		procSomme(1,2);
		afficheSonNom("Jonathan");
		System.out.println(somme(1,2));
	}
	public static int somme(int val1,int val2) {
		return val1+val2;
		
	}
	public static void procSomme(int val1,int val2) {
		System.out.println(val1+val2);
	}
	public static void afficheSonNom(String unNom) {
		System.out.println("Votre nom est "+unNom);
	}
	/*Pointeur et references voir notes java---*/
	/*Fin de la revision du cours les autres (Voir note dans mon dossier java)*/
}
