
public class Main {

	public static void main(String[] args) {

		ServeurDeChat serveurDeChat = new UnServeurDeChat();

		/*On instancie l'utilisateur avec le mediateur*/
		Utilisateur utilisateur1 = new Utilisateur(serveurDeChat);
		Utilisateur utilisateur2 = new Utilisateur(serveurDeChat);
		
		serveurDeChat.ajouterUtilisateur(utilisateur1);
		serveurDeChat.ajouterUtilisateur(utilisateur2);
		
		utilisateur1.setNom("Samuel");
		utilisateur2.setNom("JJ");
		
		/*L'utilisateur envoyer le message sans ce preocuper du destinataire car le mediateur sait et s'en charge*/
		utilisateur1.envoyerMessage("Bonjour mon collegue");
		utilisateur2.envoyerMessage("Bonjour mon collegue comment ca vas");
		
	}
	/*Le main ne marche pas correctement parce qu'on a une seule classe acteurContret*/
}
