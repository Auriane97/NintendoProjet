package metier;

public class Console {

	private String nom;
	private int prix;
	private String date;

	public int getPrix() {
		return prix;
	}

	public String getDate() {
		return date;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Console(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", date=" + date + "]";
	}
	
	
}
