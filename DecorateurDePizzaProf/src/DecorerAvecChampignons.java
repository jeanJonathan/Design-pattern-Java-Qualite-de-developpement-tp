/**
 * Classe : DecorerAvecChampignons
 * Objectif : impl�mente un decorateur (i.e. une d�coration)
 * pour d�corer une pizza avec des champignons
 * @version 1.0
 * @author Lopist�guy Philippe
 * @date jj/mm/aa
 **/

public class DecorerAvecChampignons extends DecorateurDePizza {
	// CONSTANTES 				-non-
	// ATTRIBUTS 				-non-
	// CONSTRUCTEURS   
    public DecorerAvecChampignons (final InterfaceDePizza pizza) {
        super(pizza);
    }

	// METHODES D'ENCAPSULATION -non-

    // METHODES USUELLES : toString
    /**
     * Sp�cialisation de la m�thode toString
     * pour la d�corer selon "DecorerAvecChampignons"
     * Des op�rations sont effectu�es apr�s 
     * l'appel � la m�thode de l'objet de r�f�rence
     * "InterfaceDePizza" re�u au constructeur.
     * La m�thode ignore si cet objet est un autre
     * d�corateur ou une impl�mentation
     */
    public String toString () {
        String resultat;
        resultat = pizzaDecoree.toString();
        resultat += "******avec des Champignons\n";
        return resultat;
    }

    // METHODES SPECIFIQUES 	-non-
}
