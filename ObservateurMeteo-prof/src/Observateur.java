/**
 * Classe : Observateur
 * Objectif : Montrer un cas pratique d'observation.
 * Deux objets observateurs afficheur et baseDeDonnees sont notifi�s
 * quand les valeurs dateHeure, temperature et pression de l'objet sondeMeteo
 * changent de valeur
 * @version 1.0
 * @author Lopist�guy Philippe
 * @date jj/mm/aa
 **/
public abstract class Observateur {
	// M�thode invoqu�e depuis un objet observable (cf. observ�),
	// quand il change d'�tat (cf. de valeur),
	// pour que l'observateur se mette � jour.
    public abstract void reagir();
}
