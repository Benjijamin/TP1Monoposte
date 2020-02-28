package code_permis;

public class Permis {
	private String noPermis;
	private String dateDebutPermis;
	private String dateFinPermis;
	private String typePermis;
	private String nom;
	private String sexe;
	private String couleur;
	private String dateNaissance;
	private String vaccination;
	private String sterelisation;
	private String poids;
	private String micropuce;
	private String dangereux;

	public Permis(String noPermis, String dateDebutPermis, String dateFinPermis, String typePermis, String nom,
			String sexe, String couleur, String dateNaissance, String vaccination, String sterelisation, String poids,
			String micropuce, String dangereux) {
		super();
		this.noPermis = noPermis;
		this.dateDebutPermis = dateDebutPermis;
		this.dateFinPermis = dateFinPermis;
		this.typePermis = typePermis;
		this.nom = nom;
		this.sexe = sexe;
		this.couleur = couleur;
		this.dateNaissance = dateNaissance;
		this.vaccination = vaccination;
		this.sterelisation = sterelisation;
		this.poids = poids;
		this.micropuce = micropuce;
		this.dangereux = dangereux;
	}

	public String getNoPermis() {
		return noPermis;
	}

	public void setNoPermis(String noPermis) {
		this.noPermis = noPermis;
	}

	public String getDateDebutPermis() {
		return dateDebutPermis;
	}

	public void setDateDebutPermis(String dateDebutPermis) {
		this.dateDebutPermis = dateDebutPermis;
	}

	public String getDateFinPermis() {
		return dateFinPermis;
	}

	public void setDateFinPermis(String dateFinPermis) {
		this.dateFinPermis = dateFinPermis;
	}

	public String getTypePermis() {
		return typePermis;
	}

	public void setTypePermis(String typePermis) {
		this.typePermis = typePermis;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getVaccination() {
		return vaccination;
	}

	public void setVaccination(String vaccination) {
		this.vaccination = vaccination;
	}

	public String getSterelisation() {
		return sterelisation;
	}

	public void setSterelisation(String sterelisation) {
		this.sterelisation = sterelisation;
	}

	public String getPoids() {
		return poids;
	}

	public void setPoids(String poids) {
		this.poids = poids;
	}

	public String getMicropuce() {
		return micropuce;
	}

	public void setMicropuce(String micropuce) {
		this.micropuce = micropuce;
	}

	public String getDangereux() {
		return dangereux;
	}

	public void setDangereux(String dangereux) {
		this.dangereux = dangereux;
	}

}
