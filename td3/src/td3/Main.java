package td3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CharBasique charA= new CharBasique("charJonathan",50,200);
		CharBasique charB= new CharBasique("charJosue",20,200);	
		CharArgile charC= new CharArgile("charJoel",5,200);
		
		//charA.tirerSur(charB); // test OK
		charA.etreToucherPar(charC);
		charA.tirerSur(charC);
		

		/*
		CharArgile charA= new CharArgile("charJonathan",5,200);
		CharArgile charB= new CharArgile("charJosue",5,200);	
		
		charA.tirerSur(charB);
		charA.etreToucherPar(charB);
		*/
		/*
		CharBouclier charA= new CharBouclier("charJonathan",5,200);
		CharBouclier charB= new CharBouclier("charJosue",5,200);	
		
		charA.tirerSur(charB);
		charA.etreToucherPar(charB);
		*/
		//GrosChar charA= new GrosChar();
		//GrosChar charB= new GrosChar("charJosue",5,200,2);	
		
		//charA.tirerSur(charB);
		//charA.etreToucherPar(charB);
		
		//System.out.println(charA.getBouclier());
		
		
		
	}
}
