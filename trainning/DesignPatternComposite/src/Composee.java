import java.util.ArrayList;
import java.util.List;
//import java.util.Set;

public class Composee extends Composant{
	public Composee(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	private List<Composant> composants=new ArrayList<Composant>();
	
	public void operation() {
		//On affiche d'abord le composee lui meme puis les enfants des composee
		System.out.println(getNom());
		for(Composant c:composants) {
			c.operation();
		}
	}
	public void ajouterComposant(Composant c) {
		c.niveau=getNiveau()+1;
		composants.add(c);
	}
	public void retirerComposant(Composant c) {
		composants.remove(c);
	}
	// Afficher la liste des composants
	public List<Composant> getChilds(){
		return composants;
	}
	
}

