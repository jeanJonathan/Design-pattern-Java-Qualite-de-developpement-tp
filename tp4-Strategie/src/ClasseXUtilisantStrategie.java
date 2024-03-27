
public class ClasseXUtilisantStrategie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClasseXUtilisantStrategie objetX = new ClasseXUtilisantStrategie(); 
		IStrategie uneStrategie = new StrategieConcrete1(); // un attribut de l'interface ne peut instancier que les classe quelle implemente
		objetX.setLaStrategie(uneStrategie); // pret pour appeler la methode de StrategieConcrete
		objetX.operationMetier();
		
		uneStrategie = new StrategieConcrete2(); // uneStrategie creer un espace memoire qui pointe maintenant vers StrategieConcrete2
		objetX.setLaStrategie(uneStrategie);
		objetX.operationMetier();
	}
	public IStrategie getLaStrategie() {
		return laStrategie;
	}
	public void setLaStrategie(IStrategie laStrategie) {
		this.laStrategie = laStrategie;
	}
	private IStrategie laStrategie;
	
	void operationMetier() {
		System.out.println("Commencement de l'operation metier");
		if(getLaStrategie()==null) {
			System.out.println("Aucune strategie instanciee");
		}
		getLaStrategie().methodeDeStrategie();
		System.out.println("Terminaison de l'operation metier");
		System.out.println("\n");
	}
}
