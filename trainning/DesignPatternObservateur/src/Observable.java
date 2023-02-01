import java.util.ArrayList;
import java.util.List;

public class Observable {
	private List<Observateur> observateur = new ArrayList<>();
	
	public void ajouterObservateur(Observateur unObservateur) {
		observateur.add(unObservateur);
	}
	public void supprimerObservateur(Observateur unObservateur) {
		observateur.remove(unObservateur);
	}
	public void notifierObservateurs() {
		observateur.forEach(Observateur :: reagir); // On appel la methode reagir directement de chaque Observateur donc ObservateurConcret
	}
	
}
