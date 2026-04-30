package nintendo.model;

import java.time.LocalDate;

public class Achat {

	Jeu jeu;
	LocalDate date;
	int prix;

	public Achat(Jeu jeu, LocalDate date, int prix) {
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", date=" + date + ", prix=" + prix + "]";
	}
	public Jeu getJeu() {
		return jeu;
	}
	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public Achat() {
		// TODO Auto-generated constructor stub
	}

}
