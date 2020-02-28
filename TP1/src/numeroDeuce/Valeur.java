package numeroDeuce;

public class Valeur {

	private String nom;
	private String responsable;
	private String tache;

	public Valeur() {

	}

	public Valeur(String nom, String responsable, String tache) {
		super();
		this.nom = nom;
		this.responsable = responsable;
		this.tache = tache;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getTache() {
		return tache;
	}

	public void setTache(String tache) {
		this.tache = tache;
	}

}
