
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Rmq : On instancie d'abord les decorateurConcret puis ensuite les Composant concret 
		Voiture corsaToitOuvrante = new ToitOuvrant(new Corsa());
		Voiture corsaGps = new Gps(new Corsa());
		Voiture C2Gps = new Gps(new C2());
		
		System.out.println(corsaToitOuvrante.toString());
		System.out.println(corsaGps.toString());
		System.out.println(C2Gps.toString());
	}

}
