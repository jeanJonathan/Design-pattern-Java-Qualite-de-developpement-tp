package tp3;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	Client monClient;
	Client getClient() {return monClient;}
	void setClient(Client client) {monClient=client;}
	
	String numeroTable;
	String getNumeroTable(){return numeroTable;}
	void setNumeroTable(String numTable) {numeroTable=numTable;}
	
	String tostring() {return "Son numero de table est "+getNumeroTable();}	
	String tostringAndLink() {
		if(getClient()!=null){
			return tostring()+"Le nom du client est "+getClient().getNom()+" le numero de telephone est "+getClient().getTelephone();
		}
		return toString();
		}
	void removeLink() {
		if(getClient()!=null) {
			setClient(null);
		}
	}
	
	//Constructeur
	public Table(String numTable) {
		numeroTable=numTable;
	}
	
}
