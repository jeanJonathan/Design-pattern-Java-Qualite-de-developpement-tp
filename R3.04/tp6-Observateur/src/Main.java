import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObservableMeteo unObservableMeteo = new ObservableMeteo();
		new ObservateurMeteo(unObservableMeteo);

	
		while(true) {
			System.out.println("Saisir un nombre a convertir");
			Scanner saisie = new Scanner(System.in);
			int note = saisie.nextInt();
			int a ;
			/*A chaque fois qu'on change l'etat du l'observable on 
			 * remarque que tout les observateur sont notifier de facon automatique*/
			unObservableConcret.setValeurObservee(note,a);
			
			if(etatChanger(note)) {
				System.out.println("L'etat de l'Observable Meteo a changer "
						+ "Les observateur Meteo a bien ete alerte du changement");
			}
			else {
				System.out.println("Aucun etat changer . RAS ;)");
			}
		}	
	}
}
