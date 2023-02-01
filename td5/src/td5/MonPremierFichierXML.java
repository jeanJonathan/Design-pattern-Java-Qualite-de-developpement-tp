package td5;

import java.io.FileOutputStream;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class MonPremierFichierXML {

	public MonPremierFichierXML() {
		// TODO Auto-generated constructor stub
	}
	// CREATION DE LA RACINE XML 
	static Element racine= new Element("personne");
	// CREATION DU NOUVEAU DOCUMENT JDOM base sur la racine creer
	static Document document=new Document(racine);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// On cree un nouvel Element etudiant a associer a la racine
	Element etudiant1=new Element("etudiant");
	// On ajoute l'element a la racine 
	racine.addContent(etudiant1);
	// On creer un nouvel attribut classe qu'on ajoute a etudiant
	Attribute classe1=new Attribute("classe","P2");
	// On ajoute l'attribut a l'element etudiant 
	etudiant1.setAttribute(classe1);
	// On cree un nouvel element nom
	Element nom1=new Element("nom");
	// On ajoute la donnee CynO
	nom1.setText("CynO");
	// On ajoute l'element nom a la balise etudiant 
	etudiant1.addContent(nom1);
	
	// Partie 3 Tp (Meme proceder)
	
	Element prenoms=new Element("prenoms");
	Element prenom1=new Element("prenom");
	Element prenom2=new Element("prenom");
	prenom1.setText("Nicolas");
	prenom2.setText("Laurent");
	prenoms.addContent(prenom1);
	prenoms.addContent(prenom2);
	etudiant1.addContent(prenoms);
	
	//
	Element etudiant2=new Element("etudiant");
	Attribute classe2=new Attribute("classe","P1");
	etudiant2.setAttribute(classe2);	
	Element nom2=new Element("nom");
	nom2.setText("Superwoman");
	racine.addContent(etudiant2);
	etudiant2.addContent(nom2);
	
	Element etudiant3=new Element("etudiant");
	Attribute classe3=new Attribute("classe","P1");
	etudiant3.setAttribute(classe3);	
	Element nom3=new Element("nom");
	nom3.setText("Don Corleone");
	etudiant3.addContent(nom3);
	racine.addContent(etudiant3);
	
	// On appelle les methodes qui vont nous permettee d'afficher le document
	affiche();
	// On créer le fichier Exercice1.xml dans lequel on enregistre le document XML
	enregistre("Exercice1.xml");
	
	}
	
	static void affiche() {
	try {
	//On utilise ici un affichage classique avec getPrettyFormat()
	XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
	sortie.output(document, System.out);
	}
	catch (java.io.IOException e){}
	}
	
	static void enregistre(String fichier) {
	try {
	// On utilise ici un affichage classique avec getPrettyFormat()
	XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
	// Remarquez qu'il suffit simplement de créer une instance de FileOutputStream avec en argument le
	// nom du fichier pour effectuer la sérialisation.
	sortie.output(document, new FileOutputStream(fichier));
	}
	catch (java.io.IOException e){}
	}

}
