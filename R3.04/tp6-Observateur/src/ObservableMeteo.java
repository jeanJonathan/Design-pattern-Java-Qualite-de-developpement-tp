
public class ObservableMeteo extends Observable{

	public ObservableMeteo() {
		// TODO Auto-generated constructor stub
	}
	// Les valeurs observees
	public String libelle;
	public String dateHeure;
	public double temperateur;
	public double pression;
	
	public String getValeurObservee() {
		return "Le libelle : " +this.libelle + "La date-heure :" +this.dateHeure +"La temperature "+String.valueOf(this.temperateur)+"La pression : "+String.valueOf(this.pression);
		
	}
	public void setValeurObservee(String laDateHeure, double laTemperature,double laPression) {
		this.dateHeure=laDateHeure;
		this.temperateur=laTemperature;
		this.pression = laPression;
		notifierObservateurs();
		
	} 
	public static boolean etatChanger(int valeurXobservee) {
		if(observableMeteo.getValeurObservee()==valeurXobservee) {
			return true;
			}
		return false;
		}
}
