package obiektowosc.lekcja2;

class Osoba {
	static int ilosc;
	boolean czyMezczyzna;
	String imie;
	String nazwisko;
	int rokUrodzenia;
	boolean czyZatrudniony;
	int pensja;
	int stazPracy;
	int iloscDzieci;

	public Osoba(String imie, String nazwisko, boolean czyMezczyzna, int rokUrodzenia, boolean czyZatrudniony,
			int pensja, int stazPracy, int iloscDzieci) {
		this.imie = imie;
		this.czyMezczyzna = czyMezczyzna;
		this.nazwisko = nazwisko;
		this.czyZatrudniony = czyZatrudniony;
		this.rokUrodzenia = rokUrodzenia;
		this.pensja = pensja;
		this.stazPracy = stazPracy;
		this.iloscDzieci = iloscDzieci;
		ilosc++;
	}

	public void wypisz() {
		System.out.println("Imie : " + imie + " Nazwisko: " + nazwisko + " Pensja: " + obliczWynagrodzenie());
	}

	public int obliczWynagrodzenie() {
		return pensja + (stazPracy >= 5 ? 1500 : 0) + (iloscDzieci >= 3 ? 1000 : 0);
	}

	public double obliczStosunek() {
		return (double) obliczWynagrodzenie() / (double) (2021 - rokUrodzenia);
	}
	
	public boolean czyJestEmerytem() {	
		return 2021 - rokUrodzenia > 65;
	}
}