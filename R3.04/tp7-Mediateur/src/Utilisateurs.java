
public abstract class Utilisateurs {

	public Utilisateurs(ServeurDeChat unServeurDeChat) {
		this.serveurDeChat = unServeurDeChat;
	}
	private ServeurDeChat serveurDeChat;
	
	public void envoyerMessage(String message) {
		serveurDeChat.diffuserMessageDe(message, this);// This pour dire que c'est aux utilisateurs Utilisateurs
	}
	private String name;
	public void setNom(String nom) {
		name = nom;
	}
	public String getNom() {
		return name;
	}
}
