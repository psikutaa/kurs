package obiektowosc.cwiczenia.zoo;

public class Zwierzeta {
	private String gatunek;
	private String imie;
	private int wiek;
	private int kosztUtrzymania;
	
	public Zwierzeta(String gatunek, String imie, int wiek, int kosztUtrzymania) {
		this.gatunek = gatunek;
		this.imie = imie;
		this.wiek = wiek;
		this.kosztUtrzymania = kosztUtrzymania;
	}

	public Zwierzeta(String gatunek, int kosztUtrzymania) {
		
		this.gatunek = gatunek;
		this.kosztUtrzymania = kosztUtrzymania;
	}
	
	

}
