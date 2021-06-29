package zadanie.domowe.zoo;

public class Zwierze {
	private String gatunek;
	private double kosztUtrzymania;
	
	public Zwierze(String gatunek, double kosztUtrzymania) {
		super();
		this.gatunek = gatunek;
		this.kosztUtrzymania = kosztUtrzymania;
	}

	public double getKosztUtrzymania() {
		return kosztUtrzymania;
	}
	
}
