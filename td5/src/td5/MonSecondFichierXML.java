package td5;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class MonSecondFichierXML {

	public MonSecondFichierXML() {
		// TODO Auto-generated constructor stub
	}
	static Element racine;
	static Document document;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// On cree une instance de SAXBuilder
		SAXBuilder sxb=new SAXBuilder();
		try {
			// On procede au parsing 
			document=sxb.build(new File("Exercice2.xml"));
		}
		catch(Exception e) {}
		// 	On initialise un nouvel element racine du document
		racine=document.getRootElement();
		
		//
		//afficheAll();	
		//afficherFiltre();
	}
	
		static void afficheAll() {
		//On cree une List contenant tous les noeuds "etudiant" de l'element racine
		List listEtudiants=racine.getChildren("etudiant");
		
		// On cree un iterator sur la liste listEtudiants
		Iterator i = listEtudiants.iterator(); // Il parcours uniquement les noeuds se trouvant dans la balise etudiant
		while(i.hasNext()) {// On pouvais utiliser une boucle for egaleöent
			/*On recree l'Element courant a chaque tour de boucle afin de 
			utiliser les methodes propres aux Element comme
			selectionner un noeud fils,modifier du texte,etc...*/
			Element courant=(Element)i.next();
			//On affiche le mom de l'element courant 
			System.out.println(courant.getChild("nom").getText()); // ou bien getChildren("nom").getText();
		
		}
	}	
}

