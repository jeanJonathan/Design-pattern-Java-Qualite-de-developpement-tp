
public abstract class TemplateClass {

	public TemplateClass() {
		// TODO Auto-generated constructor stub
	}
	/*Ce algorithme depant de d'autres methodes*/
	public double templateMethode() {
		int a = etape1();
		int somme = 0;
		for(int i = 0 ; i <= a; i++) {
			somme += etape2();
		}
		return somme;
	}
	protected abstract int etape1();
	protected abstract int etape2();
}
