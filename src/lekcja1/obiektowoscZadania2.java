package lekcja1;
//zad 1 Stworz klase osoba posiadajaca pola: Plec, Imie, Nazwisko, rok urodzenia, czy Zatrudniony, pensja, staż pracy, ilosc dzieci
		// zad 2 Stworz tablice 10 osob o roznych parametrach 
		// zad 3 Wyswietl posortowanych od nawyzszej pensji (tylko zatrudnionych) najpierw kobiety potem mezczyzn  
		// zad 4 Znajdz pracownikow ktorzy maja takie samo imie 
		// zad 5 Rozbuduj 3 o sytuacje w ktore do pensji podstawowej dosz dodatek jesli przepracowal wiecej niz 5 lat (1000) oraz dodatek jesli ma wiecej niz 3 dzieci (1500).
		// zad 6 Wyswietl prawconika ktorego calsciowy zarobek (5) w stosunku do wieku jest najwyzszy
class Osoba {
	static int ileno = 4;
	String plec;
	String imie;
	String nazwisko;
	int rokUrodzenia;
	boolean czyZatrudniony;
	int pensja;
	int stazPracy;
	int iloscDzieci;
	
	public Osoba (String plec, String imie, String nazwisko, int rokUrodzenia, boolean czyZatrudmiony, int pensja, int stazPracy, int iloscDzieci) {
		this.plec = plec;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rokUrodzenia = rokUrodzenia;
		this.czyZatrudniony = czyZatrudniony;
		this.pensja = pensja;
		this.stazPracy = stazPracy;
		this.iloscDzieci = iloscDzieci;
	}	
	public void wypiszInformacje() {
		System.out.printf("a");
	}
}

public class obiektowoscZadania2 {
	
	public static void main (String[] args) {

		Osoba[] korpo = { new Osoba("M", "Jan", "Kowalski", 1970, true, 2200, 35, 6),
				new Osoba("K", "Maria", "Kowalska", 1959, false, 1100, 40, 4),
				new Osoba("M", "Janusz", "Dąbrowski", 1977, false, 0, 7, 0),
				new Osoba("M", "Brajan", "Patol", 2000, false, 300, 1, 3),
				new Osoba("K", "Jessika", "Patolka", 1995, true, 3000, 7, 2),
				new Osoba("K", "Samanta", "Skłodowska", 1984, true, 0, 0, 0),
				new Osoba("K", "Maria", "Klocek", 1929, false, 7300, 50, 8),
				new Osoba("M", "Janusz", "Makaron", 1991, true, 12000, 10, 1),
				new Osoba("K", "Jessika", "Bladz", 2000, true, 9000, 5, 2),
				new Osoba("M", "Wladyslaw", "Psikuta", 1984, true, 15000, 14, 0),
				};
		
		
//		boolean czyZamiana = true;
//		
//		while(czyZamiana) {
//			czyZamiana = false;
//			
//			for(int i = 0; i < korpo.length-1; i++)
//				if(korpo[i].czyZatrudniony) {
//					czyZamiana = true;
//					Pracownik tmp = korpo[i];
//					korpo[i] = korpo[i+1];
//					korpo[i+1] = tmp;
//					System.out.println(tmp);
//				}
//		}
		
		

	}
}
