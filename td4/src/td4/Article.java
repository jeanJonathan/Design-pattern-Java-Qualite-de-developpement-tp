package td4;

public class Article {

	public Article() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	protected String libelle;
	protected String codeBarre;
	protected double prix;
	
	public Article(String lib,String code,double price) {
		libelle=lib;
		codeBarre=code;
		prix=price;		
	}
	public String getLibelle() {
		return libelle;
	}
	public double getPrix() {
		return prix;
	}
	public String getCodeBarre() {
		return codeBarre;
	}
	public void setLibelle(String lib) {
		libelle=lib;
	}
	public void setCodeBarre(String code) {
		codeBarre=code;
	}
	public void setPrix(double price) {
		prix=price;
	}
}
