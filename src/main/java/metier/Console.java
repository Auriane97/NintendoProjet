package metier;

public abstract class Console {


	protected String nom;

	
	protected int prix;
	protected String date;
	
	
	
	public Console(String nom,  String date,int prix) {
		this.nom = nom;
		this.prix = prix;
		this.date = date;
	}
	

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
