package td4;

import java.util.HashMap;
import java.util.Map;

public class GestionArticle {

	public GestionArticle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private Map<String, Article> map= new HashMap<>();
	
	public GestionArticle(String cle, Article val) {
		map.put(cle,val);
	} 
	public Map<String, Article> getMap() {
		return map;
	}

	public void setMap(Map<String, Article> map) {
		this.map = map;
	}
	
	public void ajouterArticle(String cle, Article article) {
		map.put(cle, article);
	}
	public double getPrix(String cle) {
		if(map.get(cle)!=null) {
			return map.get(cle).getPrix();
		}
		return -1.0;
		
	}
	public void setPrix(String cle,double price) {
		map.get(cle).setPrix(price);
	}
	public void supprimerArticle(Article article) {
		map.remove(article.getCodeBarre());
		}
	public void supprimerArticle(String cle) {
		map.remove(cle);
		}
	
	public void afficherGestionnaire(GestionArticle gestion) {
		System.out.println(gestion.getMap().toString());
		}
	
}