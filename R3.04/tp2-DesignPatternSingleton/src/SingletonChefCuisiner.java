
public class SingletonChefCuisiner {
	// On se servira de ce main pour tester le Singleton histoire de gagner du temps :)
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		// 2-a)
		SingletonChefCuisiner leCuisinier;
		SingletonChefCuisiner leChef ;
		leCuisinier = SingletonChefCuisiner.getInstance(); 
		//2-c
		leCuisinier.setNom("Navarro");
		//2-d
		leChef = SingletonChefCuisiner.getInstance(); 
		System.out.println(leChef.getNom());
		// Test
		System.out.println(leChef.toString()); // Le chef est donc Navarro 
		/* Nous pouvons comprendre donc que malgrer la creation des deux personnage 
		on a bien une seule instance */
		// Pour verifier cela on peut faire 
		System.out.println( leChef == leCuisinier); // Qui retourne true 
	
	}
	private static SingletonChefCuisiner instanceUnique = null;
	
	// Declaration privee du constructeur 
	private SingletonChefCuisiner() {};
	
	// Declaration des attributs metiers nom et prenom
	static String nom;
	static String prenom;
	
	//Encapsulation
	public String getNom() {return nom;}
	public String getPrenom() {return prenom;}
	
	public void setNom(String leNom) {nom=leNom;}
	public void setPrenom(String lePrenom) {prenom=lePrenom;}
	
	// Methode Usuelle 
	public String toString() {return "Le nom est "+getNom()+" Le prenom est "+getPrenom();}


	public static SingletonChefCuisiner getInstance() {
		if(instanceUnique==null) {
			//Invocation du constructeur privee 
			instanceUnique= new SingletonChefCuisiner();
			
			instanceUnique.setNom("X");
			instanceUnique.setPrenom("Y");
			}
		return instanceUnique; //
	}
}
