package modele.utilisateur;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class GestionnaireUtilisateurModele extends Observable {
	
	protected List<UtilisateurModele> listeUtilisateurs;
	
	public GestionnaireUtilisateurModele() {
		this.listeUtilisateurs = new ArrayList<>();
	}
	
	public void ajouter(UtilisateurModele utilisateur) {
		this.listeUtilisateurs.add(utilisateur);
		notifier();
	}
	
	public void supprimer(UtilisateurModele utilisateur) {
		this.listeUtilisateurs.remove(utilisateur);
		notifier();
	}
	
	public int getNbUtilisateur() {
		return this.listeUtilisateurs.size();
	}
	
	public UtilisateurModele getUtilisateurAt(int index) {
		return this.listeUtilisateurs.get(index);
	}
		
	private void notifier() {
		notifier(null);
	}
	
	private void notifier(Object o) {
		setChanged();
		notifyObservers(o);
	}

}
