
public class ObservateurHexadecimal extends Observateur{
	
	ObservableConcret observableConcret;
	public ObservateurHexadecimal(ObservableConcret unObservable) {
		this.observableConcret = unObservable;
		this.observableConcret.ajouterObservateur(this);
	}

	public void reagir() {
		System.out.println("Hexadecimal = "+Integer.toHexString(this.observableConcret.getValeurObservee()));	
	} 
}
