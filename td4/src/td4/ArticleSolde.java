package td4;

public class ArticleSolde extends Article {

	public ArticleSolde() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ArticleSolde(String lib,String code,double price,double sold) {
		super(lib,code,price);
		solde=sold;
		
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	public double getPrix() {
		return super.getPrix()-super.getPrix()*solde*0.01;
	}

	protected double solde;
	
}
