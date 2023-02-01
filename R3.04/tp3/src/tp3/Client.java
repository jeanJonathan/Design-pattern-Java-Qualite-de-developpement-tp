package tp3;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table table1 = new Table("t01");
		Table table2= new Table("t02");
		
		Client client1=new Client("Martin","0101010101");
		Client client2=new Client("Durant","0202020202");
		
		System.out.println(table1.tostring());	
		System.out.println(table2.tostring());
		
		System.out.println(client1.tostring());	
		System.out.println(client2.tostring());	
		
		// Pour une table donnee on doit connaitre son CLient et reciproquement
		
		table1.setClient(client1);
		//Test
		System.out.println(table1.tostringAndLink());	
		
		//Supression du client (JE SUIS ICI )
		table1.removeLink();
		//Test
		System.out.println(table1.tostringAndLink());	
	}
	Table table;
	Table getTable() {return table;}
	void setTable(Table laTable) {table=laTable;}
	String nom;
	String telephone;
	String getNom() {return nom;}
	String getTelephone() {return telephone;}
	void setNom(String leNom) {nom=leNom;}
	void setTelephone(String leTelephone) {telephone=leTelephone;}
	
	String tostring() {return "le nom est "+getNom()+" Le numero de telephone est "+getTelephone();}
	String tostringAndLink() {
		if(getTable()!=null){
			return tostring()+"le numero de table est "+getTable().getNumeroTable();
		}
		return toString();
		}
	//Constructeur
	public Client(String leNom,String leTelephone) {
		nom=leNom;
		telephone=leTelephone;
	}
	//Supprimer lien 
	void removeLink() {
		if(getTable()!=null) { // Si je suis lier alors 
			setTable(null); // le correspondant ne dois plus pointer vers moi
			
		}
	}
	
}
