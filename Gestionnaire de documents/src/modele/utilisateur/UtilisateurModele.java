package modele.utilisateur;

import modele.papier.GestionnairePapier;

public class UtilisateurModele {
	
	protected int ID;

	protected String pseudo;
	protected String photoPath;
	protected String nom;
	protected String prenom;
	
	protected int age;
	protected String sexe;
	protected double taille;
	
	protected GestionnairePapier papiers;
	
	public UtilisateurModele() {
		this.papiers = new GestionnairePapier();
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public GestionnairePapier getPapiers() {
		return papiers;
	}

	public void setPapiers(GestionnairePapier papiers) {
		this.papiers = papiers;
	}
	
	
	
	
	

}
