package modele.papier;

import modele.utilisateur.UtilisateurModele;

public class PapierModele {
	
	protected String nom;
	protected String pathImage;
	protected UtilisateurModele utilisateur;
	
	public PapierModele() {
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPathImage() {
		return pathImage;
	}

	public void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}

	public UtilisateurModele getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UtilisateurModele utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
	
	

}
