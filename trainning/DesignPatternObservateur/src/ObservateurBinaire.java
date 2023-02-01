
public class ObservateurBinaire extends Observateur{
	
	ObservableConcret observableConcret;
	public ObservateurBinaire(ObservableConcret unObservable) {
		this.observableConcret = unObservable;
		this.observableConcret.ajouterObservateur(this);
	}
	public void reagir() {
		// Il reagir en fonction du nouvel etat de l'observable concret. Tjr ce meme principe
		System.out.println("Binaire = "+Integer.toBinaryString(this.observableConcret.getValeurObservee()));	
	}
}
