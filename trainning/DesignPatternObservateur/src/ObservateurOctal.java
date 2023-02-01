
public class ObservateurOctal extends Observateur{

	ObservableConcret observableConcret;
	public ObservateurOctal(ObservableConcret unObservable) {
		this.observableConcret = unObservable;
		this.observableConcret.ajouterObservateur(this);
	}

	public void reagir() {
		System.out.println("Octal = "+Integer.toOctalString(this.observableConcret.getValeurObservee()));	
	}
}
