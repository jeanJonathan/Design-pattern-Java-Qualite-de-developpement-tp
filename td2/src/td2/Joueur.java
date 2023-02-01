package td2;

public class Joueur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private String identifiant;
	private String nom;
	private String prenom;
	private int numero;
	private String poste;
	
	public Joueur(String id,String name,String surname,int num,String position) {
		identifiant = id;
		nom = name;
		prenom=surname;
		numero=num;
		poste=position;
	}
	//
	public void setIdentifiant(String id) {
		identifiant=id;
	}
	public void setNom(String name) {
		if(name != "") {nom=name;}		
	}
	public void setPrenom(String surname) {
		prenom=surname;
	}
	public void setNumero(int num) {
		if(num >=1) {numero=num;}
	}
	public void setPoste(String position) {
		if(poste != "") {poste=position;}
	}
	
	//
	public String getIdentifiant() {
		return identifiant;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getNumero() {
		return numero;
	}
	public String getPoste() {
		return poste;
	}

	//
	public void afficher() {
		System.out.println("Son identifiant est " +identifiant + " Son prenom est "+prenom+" Son nom est "+nom+" Son numero est "+numero+" Enfin son poste est "+poste);
	}
	

}
