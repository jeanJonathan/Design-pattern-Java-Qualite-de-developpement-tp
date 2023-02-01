package td5;

import java.io.FileOutputStream;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class JDOM1 {

	public JDOM1() {
		// TODO Auto-generated constructor stub
	}
	// CREATION DE LA RACINE XML 
	static Element racine= new Element("personne");
	// CREATION DU NOUVEAU DOCUMENT JDOM base sur la racine creer
	static org.jdom2.Document document= new Document(racine);
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// On cree un nouvel element etudiant 
	Element etudiant = new Element("etudiant");
	// On ajoute l'element a la racine 
	racine.addContent(etudiant);
	
	// On creer un nouvel attribut classe qu'on ajoute a etudiant
	Attribute classe= new Attribute("classe","P2");
	
	// On ajoute l'attribut a l'element etudiant 
	etudiant.setAttribute(classe);
	
	// On cree un nouvel element nom
	Element nom= new Element("nom");
	// On ajoute la donnee CynO
	nom.setText("CynO");
	
	// On ajoute l'element nom a la balise etudiant 
	etudiant.addContent(nom);
	
	// On appelle les methodes qui vont nous permettee d'afficher le document
	
	//affiche();
	//enregistrer("Exercie1.xml");
	
	}
	static void affiche()
	{
	try
	{
	//On utilise ici un affichage classique avec getPrettyFormat()
	XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
	sortie.output(document, System.out);
	}
	catch (java.io.IOException e){}
	}
	static void enregistre(String fichier)
	{
	try
	{
	//On utilise ici un affichage classique avec getPrettyFormat()
	XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
	//Remarquez qu'il suffit simplement de créer une instance de FileOutputStream
	//avec en argument le nom du fichier pour effectuer la sérialisation.
	sortie.output(document, new FileOutputStream(fichier));
	}
	catch (java.io.IOException e){}
	}

	
}
