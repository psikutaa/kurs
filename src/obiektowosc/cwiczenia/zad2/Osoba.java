package obiektowosc.cwiczenia.zad2;

class Osoba {
	// zad 1 Stworz klase osoba posiadajaca pola: Plec, Imie, Nazwisko, rok
	// urodzenia, czy Zatrudniony, pensja, staż pracy, ilosc dzieci
	
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
		
		this.czyMezczyzna = czyMezczyzna;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rokUrodzenia = rokUrodzenia;
		this.czyZatrudniony = czyZatrudniony;
		this.pensja = pensja;
		this.stazPracy = stazPracy;
		this.iloscDzieci = iloscDzieci;
	}
	
	public void wypisz() {
		System.out.println("Imie : " + imie + " Nazwisko: " + nazwisko + " Pensja: " );
	}
	
}
