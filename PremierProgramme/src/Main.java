/**
 * Classe : Main
 * Objectif :
 * 
 * @author HP
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] tab = new int[10];	
		int[] tableau = {1,2,4,5,8,6,3,7,9,0};
		affichageTableau(tableau,tableau.length);
		System.out.println(sommeTableau(tableau,tableau.length));
		trieTableau(tableau,tableau.length);
		affichageTableau(tableau,tableau.length);
		
	}
	public static void affichageTableau(int[] tab,int nbTab) {
		for(int i=0;i<= nbTab-1;i++) {
		System.out.println(tab[i]);
}
}
	public static int sommeTableau(int[] tab,int nbTab) {
		int somme = 0;
		for(int i=0;i<= nbTab-1;i++) {
			somme = somme + tab[i];}
		return somme;
}
	
	public static void trieTableau(int[] tab,int nbTab) {
		for(int i=0;i<= nbTab-1;i++) {
			int ici=nbTab-1;// En considerant que le dernier element est deja trie
			monterLaBulle(tab,ici,nbTab);			
}
		
}
	public static void monterLaBulle(int[] tab,int ici,int nbTab) {
		for(int i=0;i<= ici-1;i++) {
			if(tab[i]>tab[i+1]) {
				echangerValeur(tab[i],tab[i+1]);
			}
}
}
	public static void echangerValeur(int x,int y) {
		int intermediaire;
		intermediaire=y;
		y=x;
		x=intermediaire;
		
	}
	
}
