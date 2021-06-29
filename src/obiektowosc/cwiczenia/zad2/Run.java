package obiektowosc.cwiczenia.zad2;

// zad 1 Stworz klase osoba posiadajaca pola: Plec, Imie, Nazwisko, rok
// urodzenia, czy Zatrudniony, pensja, staż pracy, ilosc dzieci
// zad 2 Stworz tablice 10 osob o roznych parametrach
// zad 3 Wyswietl posortowanych od nawyzszej pensji (tylko zatrudnionych)
// najpierw kobiety potem mezczyzn
// zad 4 Znajdz pracownikow ktorzy maja takie samo imie
// zad 5 Rozbuduj 3 o sytuacje w ktore do pensji podstawowej dosz dodatek jesli
// przepracowal wiecej niz 5 lat (1000) oraz dodatek jesli ma wiecej niz 3
// dzieci (1500).
// zad 6 Wyswietl prawconika ktorego calsciowy zarobek (5) w stosunku do wieku
// jest najwyzszy​	

public class Run {
	public static void main (String [] args) {
	// zad 2 Stworz tablice 10 osob o roznych parametrach
		Osoba [] pracownicy = {
				new Osoba("Jan", "As", true, 1990, true, 2000, 5, 0),
				new Osoba("Ola", "Ej", false, 2000, true, 3000, 10, 3),
				new Osoba("Adam", "Das", true, 1980, false, 0, 0, 5),
				new Osoba("Ala", "El", false, 1970, true, 5000, 3, 0),
				new Osoba("Jaś", "Pas", true, 1985, true, 3500, 11, 0),
				new Osoba("Ela", "Ce", false, 1981, true, 2800, 13, 0)
		};


		// zad 4 wylicz dla przedsiebiorstwa roczny koszt utrzymania pracownikow wraz z 
		// dadatkim za prace kazdy rok to 10% podstawy do pensji
		
		int koszt = 0;
		for (int i = 0; i < pracownicy.length; i++) {
			koszt += (pracownicy[i].pensja + pracownicy[i].stazPracy * pracownicy[i].pensja/10);
		}
		koszt *= 12;
		
		System.out.println("Roczny koszt dla firmy to: " + koszt);
		
		int ileZatrudnionych = 0;
//		
		for(Osoba o : pracownicy) if(o.czyZatrudniony) ileZatrudnionych++; // czemu taka konstrukcja???
		
		System.out.println(ileZatrudnionych);
		
		
		Osoba[] zatrudnieni = new Osoba[ileZatrudnionych];
		
		int idx = 0;
		for(Osoba o : pracownicy) if(o.czyZatrudniony) zatrudnieni[idx++] = o;
		
		for(int i = 0; i < zatrudnieni.length; i++)
			zatrudnieni[i].wypisz();
//		 ilosc zatrudnionych kobiet
		int ileZatrudnionychKobiet = 0;
		
		for(Osoba o : zatrudnieni) if(!o.czyMezczyzna) ileZatrudnionychKobiet++;
		idx = 0;
		Osoba[] zatrudnioneKobiety = new Osoba[ileZatrudnionychKobiet];
		
		System.out.println("----------------");
		for(Osoba n: pracownicy) if(n.pensja > 0) System.out.println(n.imie + " " + n.nazwisko);
		System.out.println("----------------");
		
		int i =0;
		Osoba[] pracujaceKobiety = new Osoba [4];
		for(Osoba z: pracownicy) 
			if (z.czyMezczyzna == true) {
				
				pracujaceKobiety[i] = z;
				i++;
			}
		
	}
}
