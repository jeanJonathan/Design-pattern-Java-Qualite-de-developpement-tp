
public interface ServeurDeChat {

	public abstract void diffuserMessageDe(String message,Utilisateurs utilisateurs);
	public abstract boolean ajouterUtilisateur(Utilisateur unUtilisateur);
	public abstract boolean retirerUtilisateur(Utilisateur unUtilisateur);
	public abstract boolean existeUtilisateur(Utilisateur unUtilisateur);
	

}

