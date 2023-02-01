
/*Rmq :
 * C'est la declaration de l'instance unique de la classe Singelton 
 * qui permert de resoudre le probleme dans ce tp */
public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton singleton1 = new Singleton();
		singleton1.getInstance();
		
		// On creer 5 connxeion mais resultat toujours 1 meme si on a bien creer plusieurs
				for(int i =0; i<= 5;i++) {
					singleton1.getInstance();
				}
				
		
		Singleton singleton2 = new Singleton();
		singleton2.getInstance();
		
		// On vérifie qu'on a pas une instance.
        System.out.println( singleton1 == singleton2);
		
        Singleton singleton3 = Singleton.getInstance();
		Singleton singleton4 = Singleton.getInstance();
		
		// On vérifie qu'on ait bien qu'une unique instance.
        System.out.println( singleton3 == singleton4);
        
        
		/*Tout les singletons ont creer sont donc assujettis a pouvoir instancier cette classe*/
	}
	private Singleton() {} /* Declaration du constructeur privee pour resoudre le probleme des nombreux 
	appel a chaque instanciation d'un singleton dans le main
	
	Rmq: Vu que son constructeur est privée les instances de cette classe ne se 
	ferons qu’a l’intérieur de la classe 
	*/
	private static int i=0;
	private static Singleton instance=null; /* On déclare un accesseur static pour rendre cette 
	instance disponible ; On est a l’intérieur de la classe */
	
	/*On déclare une méthode static pour pouvoir publier le champ service à l’extérieur */
	public static Singleton getInstance() {
		if(instance == null) { // seulement si aucune instance n’existe, en créer une nouvelle
		/* Des lors l'instance instance il sera invoquer lors de l’appel de getInstance()
		 */
		instance = new Singleton(); // Utilisation du constructeur privee pour resolver le probleme
		i++;
		System.out.println("Nous aurons toujours '"+i+"' quelque soit le nombre d'instance creer dans le main"); // Cela peut etre simuler par une connexion par exempple en PHP 
		}
		return instance; // On retourne l'instance instance contenant a chaque fois le construteur privee et non null maintenant
	}
	/*Pour resoudre le probleme du Design pattern il faut declarer un 
	 * constructeur privee*/
	
	/*N.B : Si le constructeur privee n'etais pas cree. Les valeurs incrementee resterons dans 
	 * la variable instance*/

}
