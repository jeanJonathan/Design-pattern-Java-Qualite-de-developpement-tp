
public class Simple extends Composant {
	public Simple(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	
	public void operation() {
		String tab="";
		for(int i=0;i<getNiveau();i++) {
			tab+="----";
			System.out.println(tab+getNom());
		}		
		}	
}
