
public class ObservateurMeteo extends Observateur{

	public ObservateurMeteo() {
		// TODO Auto-generated constructor stub
	}
	public ObservableMeteo observableMeteo;
	public String libelle;
	public String dateHeureLocale;
	public String tempLocale;
	public double pressionLocale;
	
	public ObservateurMeteo(ObservableMeteo unObservable) {
		this.observableMeteo = unObservable;
		//this.observableMeteo.ajouterObservateur(this);
		}
	public void reagir() {
		System.out.println(" Observateur Meteo : "+this.observableMeteo.getValeurObservee() );
	}

}
