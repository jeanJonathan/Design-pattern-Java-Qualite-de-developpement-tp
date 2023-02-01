
public class PlatsFroid {
	private String nom;
	private int tempsPrepa;
	private int tempsConf;
	
	public PlatsFroid(String name,int time,int timeConf) {
		this.nom=name;
		this.tempsPrepa=time;
		this.tempsConf=timeConf;
	}
	public void setNom(String name) {
		nom=name;
	}
	public void setTempsPrepa(int timePrepa) {
		this.tempsPrepa=timePrepa;
	}
	public int getTempsConf() {
		return tempsConf;
	}
	public int getTempsPrepa() {
		return tempsPrepa;
	}
	public int getTempsGlobal() {
		return getTempsConf()+getTempsPrepa();
	}
	public void setTempsConf(int tempsConf) {
		this.tempsConf = tempsConf;
	}
	public String getNom() {
		return nom;
	}
	public boolean equals(PlatsFroid unPlatFroid) {
		if(unPlatFroid == null) {return false;}
		if(unPlatFroid.getNom().equals(getNom())&& unPlatFroid.getTempsConf()==getTempsConf()&&unPlatFroid.getTempsPrepa()==getTempsPrepa()) {
			return true;
		}
		return false;
	}
	public String toString() {
		return "le nom est "+getNom()+" le temps conf est "+String.valueOf(getTempsConf())+" le temps de prepa est "+String.valueOf(getTempsPrepa());}

}
