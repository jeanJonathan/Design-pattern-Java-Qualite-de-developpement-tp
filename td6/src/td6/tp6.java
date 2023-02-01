package td6;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class tp6 {

	public tp6() {
		// TODO Auto-generated constructor stub
	}
	// Document JDOM qui fait l'objet des opérations 
	static org.jdom2.Document document; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deFichierXMLversJDOM("tp6.xml");
		//afficherJDOM();
		//afficherTexteDePetitsFilsDeLaRacine(document,"etudiant","nom");
		afficherAttributDeFilsDeLaRacine (document,"etudiant","classe");
		
	}
	
	
	 // Initialiser le document JDOM à partir d'un fichier XML // 
	 //*****************************************// 
	public static void deFichierXMLversJDOM (String fichier) { 
	 // Créer une instance de SAXBuilder 
	 SAXBuilder sxb = new SAXBuilder(); 
	 try { 
	 // Crer le document JDOM avec en argument le fichier XML 
	 document = sxb.build (new File(fichier)); 
	 } 
	 catch (Exception e) { } 
	 } 
	 
	 // Enregistrer le document JDOM dans un fichier XML // 
	 //***************************************// 
	static void deJDOMversFichierXML (String fichier) { 
	 try { 
	 // Utiliser un affichage classique avec getPrettyFormat() 
	 XMLOutputter sortie = new XMLOutputter (Format.getPrettyFormat()); 
	 // Créer une instance de FileOutputStream 
	 // avec en argument le nom du fichier pour effectuer la sérialisation 
	 sortie.output (document, new FileOutputStream (fichier)); 
	 } 
	 catch (java.io.IOException e){} 
	 } 
	 // Afficher le document JDOM // 
	 //**********************// 
	public static void afficherJDOM () { 
	 try { 
	 // Utiliser un affichage classique avec getPrettyFormat() 
	 XMLOutputter sortie = new XMLOutputter (Format.getPrettyFormat()); 
	 // Préciser que la sortie de document se fait sur System.out 
	 sortie.output (document, System.out); 
	 } 
	 catch (java.io.IOException e){} 
	 } 
	
	// Affiche le texte du nomPetitsFils contenu dans chacun des nomFils de la racine du document 
	 public static void afficherTexteDePetitsFilsDeLaRacine (Document document, String nomDeFils, String nomDePetitFils) { 
	 Element racine; // accède à la racine du document
	 List<Element> listFils; // contient la liste des fils de la racine
	 Element fils; // pour parcourir chacun des composants de la listFils
	 Element petitFils; // pour accéder à chaque petit fils de la racine
	 // Initialise la racine du document
	 racine = document.getRootElement(); 
	 // Obtient la liste des fils de la racine s'appelant nomDeFils
	 listFils = racine.getChildren(nomDeFils);
	//Parcours complet de la listFils
	 for (int i = 0; i < listFils.size(); i++) {
		 	fils = listFils.get(i); // Accède au i-ème fils dans listFils
		 	petitFils = fils.getChild (nomDePetitFils); // Accède au petitFils nomDePetitFils
		 	System.out.println (petitFils.getText()); // Affiche le texte du petitFils
	 		}
	}
	 /*
	 public static void afficherAttributDeFilsDeLaRacine (Document document, String nomDeFils, String nomDePetitFils) { 
	 Element racine=document.getRootElement(); ; // accède à la racine du document
	 List<Element> listFils=racine.getChildren(nomDeFils); // contient la liste des fils de la racine
	 Element fils; // pour parcourir chacun des composants de la listFils
	 Attribute petitFils; // pour accéder à chaque petit fils de la racine
	
	 //Parcours complet de la listFils
	 for (int i = 0; i < listFils.size(); i++) {
		 	fils = listFils.get(i); // Accède au i-ème fils dans listFils
		 	petitFils = fils.getAttribute(nomDeFils); // Accède au petitFils nomDePetitFils
		 	System.out.println (petitFils); // Affiche le texte du petitFils
	 		}
	}
	*/
	

}
