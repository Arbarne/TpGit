package nintendo.model;

public class Boutique {

	private String Nom;
	private String Numero;
	private String Ville;
	private String Voie;
	private String Cp;
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String numero) {
		Numero = numero;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		Ville = ville;
	}
	public String getVoie() {
		return Voie;
	}
	public void setVoie(String voie) {
		Voie = voie;
	}
	public String getCp() {
		return Cp;
	}
	public void setCp(String cp) {
		Cp = cp;
		
		
		
		
		
		
		
		
	}
	

	@Override
	public String toString() {
		return "Boutique [Nom=" + Nom + ", Numero=" + Numero + ", Ville=" + Ville + ", Voie=" + Voie + ", Cp=" + Cp
				+ "]";
	}

	public Boutique(String nom, String numero, String ville, String voie, String cp) {
		Nom = nom;
		Numero = numero;
		Ville = ville;
		Voie = voie;
		Cp = cp;
	}



}


