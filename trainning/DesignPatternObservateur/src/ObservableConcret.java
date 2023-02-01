
/*C'est elle qui s'occupe d'indiquer le changement d'etat aux ObservateurConcret*/
public class ObservableConcret extends Observable{
	
	private static int valeurObservee;
	public static int getValeurObservee() {
		return valeurObservee;
	}
	public void setValeurObservee(int uneValeurObservee) {
		ObservableConcret.valeurObservee = uneValeurObservee;
		// A chaque fois ou on change d'etat on appel a la notification des Observateurs
		notifierObservateurs(); // Notifie chaque Observateur en appelant leur methode reagir()
	}
	//Ma methode pour approfondit le test 
	public static boolean etatChanger(int valeurObservee) {
		if(ObservableConcret.getValeurObservee()==valeurObservee) {
			return true;
			}
		return false;
	}
}
