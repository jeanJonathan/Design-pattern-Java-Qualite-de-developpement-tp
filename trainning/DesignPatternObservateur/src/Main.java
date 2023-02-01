import java.util.Scanner;

public class Main extends ObservableConcret{
/*Remarque dans ce main on travail avec les ObservableConcret et 
 * les ObservateurConcret Cela est dure a la creation
 *  de la classe ObservableConcret. Si elle n'existait pas on travaillerai avec l'observable Directement*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObservableConcret unObservableConcret = new ObservableConcret();
		new ObservateurBinaire(unObservableConcret);
		new ObservateurOctal(unObservableConcret);
		new ObservateurHexadecimal(unObservableConcret);
	
		while(true) {
			System.out.println("Saisir un nombre a convertir");
			Scanner saisie = new Scanner(System.in);
			int numero = saisie.nextInt();
			/*A chaque fois qu'on change l'etat du l'observable on 
			 * remarque que tout les observateur sont notifier de facon automatique*/
			unObservableConcret.setValeurObservee(numero);
			
			if(etatChanger(numero)) {
				System.out.println("L'etat de l'Observable Concret a changer "
						+ "Les observateur Concret on bien ete alerte du changement");
			}
			else {
				System.out.println("Aucun etat changer . RAS ;)");
			}
		}
		/*Test OK*/
	}
}
