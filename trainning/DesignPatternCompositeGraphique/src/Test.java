
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point unPoint1=new Point(1,2,'o');
		Point unPoint2=new Point(2,1,'o');
		Point unPoint3=new Point(2,2,'o');
		
		GraphiqueComposee unGraphique = new GraphiqueComposee();
		unGraphique.ajouter(unPoint1);
		unGraphique.ajouter(unPoint2);
		unGraphique.ajouter(unPoint3);
		
		unGraphique.afficher();
	}

}
