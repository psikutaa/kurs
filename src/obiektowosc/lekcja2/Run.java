package obiektowosc.lekcja2;

public class Run {
	public static void main (String[] args) {
	
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
		// jest najwyzszy​	​
			// zad 1 Napisz przyklad wykorzystania biznesowego static ?
			// zad 2 Z wykorzystaniem static policz ile stowrzyles obiektów danej klasy​
//			System.out.println(Osoba.iloscNog);
//			Osoba o1 = new Osoba("Pawel", "Malinowski", true, 1946, true, 3000, 2, 0);
	//
//			System.out.println(o1.czyJestEmerytem());​
		
			// zad 1 Stworz kalse przedsiebiorstwo z min 5 atrybutami 
			// zad 2 stworz klase pracownik z min. 5 atrybutami
			// zad 3 wewnatrz klasy stworz tablice 10 pracownikow
			// zad 4 wylicz dla przedsiebiorstwa roczny koszt utrzymania pracownikow wraz z 
			// dadatkim za prace kazdy rok to 10% podstawy do pensji
			// zad 5 
			
			//		System.out.println(Osoba.ilosc);
//			Osoba o2 = new Osoba("Pawel", "Malinowski", true, 1996, true, 3000, 2, 0);
//			System.out.println(Osoba.ilosc);
//			System.out.println(o1.iloscNog);
//			System.out.println(o2.iloscNog);
//			o1.iloscNog = 5;
	//
//			System.out.println(o1.iloscNog);
//			System.out.println(o2.iloscNog);
//			System.out.println(Osoba.iloscNog);
//			Osoba[] spisOsob = {
//				new Osoba("Pawel", "Malinowski", true, 1996, true, 3000, 2, 0),
	//
//				new Osoba("Basia", "Malinowska", false, 1991, true, 2500, 3, 1),
//				new Osoba("Pawel", "Szymanski", true, 1992, false, 0, 2, 0),
//				new Osoba("Tadeusz", "Kowalski", true, 1990, true, 3000, 2, 4),
//				new Osoba("Zdzisław", "Malina", true, 1955, true, 3000, 1, 5),
//				new Osoba("Ola", "Wisniewska", false, 1964, false, 0, 5, 0),
//				new Osoba("Tomek", "Jankowski", true, 1974, true, 3000, 2, 6),
//				new Osoba("Marek", "Wolski", true, 2001, true, 3000, 4, 1),
//				new Osoba("Daria", "Tomaszewska", false, 1998, true, 3000, 6, 1),
//				new Osoba("Piotr", "Jodlowski", true, 1986, true, 3000, 2, 2),
//					
//			};
//			
//			int ileZatrudnionych = 0;
//			
//			for(Osoba o : spisOsob) if(o.czyZatrudniony) ileZatrudnionych++;
//			
//			Osoba[] zatrudnieni = new Osoba[ileZatrudnionych];
//			
//			int idx = 0;
//			for(Osoba o : spisOsob) if(o.czyZatrudniony) zatrudnieni[idx++] = o;
//			
//			for(int i = 0; i < zatrudnieni.length; i++)
//				zatrudnieni[i].wypisz();
//			
//			
//			System.out.println("=====================");
//			
//			// ilosc zatrudnionych kobiet
//			int ileZatrudnionychKobiet = 0;
//			
//			for(Osoba o : zatrudnieni) if(!o.czyMezczyzna) ileZatrudnionychKobiet++;
//			idx = 0;
//			Osoba[] zatrudnioneKobiety = new Osoba[ileZatrudnionychKobiet];
//			
//			for(Osoba o : zatrudnieni) if(!o.czyMezczyzna) zatrudnioneKobiety[idx++] = o;
//			
//			// ilosc zatrudnionych mezczyzn
//			int ileZatrudnionychMezczyzn = 0;
//			
//			for(Osoba o : zatrudnieni) if(o.czyMezczyzna) ileZatrudnionychMezczyzn++;
//			idx = 0;
//			Osoba[] zatrudnieniMezczyzni = new Osoba[ileZatrudnionychMezczyzn];
//			
//			for(Osoba o : zatrudnieni) if(o.czyMezczyzna) zatrudnieniMezczyzni[idx++] = o;
//			
//			boolean czyZamiana = true;
//			
//			while(czyZamiana) {
//				czyZamiana = false;
//				for(int i = 0; i < zatrudnioneKobiety.length -1; i++)
//					if(zatrudnioneKobiety[i].obliczWynagrodzenie() < zatrudnioneKobiety[i+1].obliczWynagrodzenie()) {
//						czyZamiana = true;
//						Osoba tmp = zatrudnioneKobiety[i];
//						zatrudnioneKobiety[i] = zatrudnioneKobiety[i+1];
//						zatrudnioneKobiety[i+1] = tmp;
//					}
//			}
//			
//			
//			czyZamiana = true;
//			
//			while(czyZamiana) {
//				czyZamiana = false;
//				for(int i = 0; i < zatrudnieniMezczyzni.length -1; i++)
//					if(zatrudnieniMezczyzni[i].obliczWynagrodzenie() < zatrudnieniMezczyzni[i+1].obliczWynagrodzenie()) {
//						czyZamiana = true;
//						Osoba tmp = zatrudnieniMezczyzni[i];
//						zatrudnieniMezczyzni[i] = zatrudnieniMezczyzni[i+1];
//						zatrudnieniMezczyzni[i+1] = tmp;
//					}
//			}
//			
//			
//			for(int i = 0; i < zatrudnieni.length; i++)
//				if(i >= zatrudnioneKobiety.length)
//					zatrudnieni[i] = zatrudnieniMezczyzni[i - zatrudnioneKobiety.length];
//				else
//					zatrudnieni[i] = zatrudnioneKobiety[i];
//			
//			for(int i = 0; i < zatrudnieni.length; i++)
//				zatrudnieni[i].wypisz();
//			
	//
//			Osoba najwyzszyStosunek = spisOsob[0];
//			for(int i = 0; i < spisOsob.length; i++)
//				if(najwyzszyStosunek.obliczStosunek() < spisOsob[i].obliczStosunek())
//					najwyzszyStosunek = spisOsob[i];
//			
//			
//			najwyzszyStosunek.wypisz();
//		}
	   // 10 pkt. 
		// zad 1. Stworz Klase Zoo z min 5 parametrami
		// zad 2. W klasie zoo stworz tablice 10 miejsc na zwierzeta
		// zad 3 Stworz stosowne metody zeby moc umieszczac oraz wyjmowac zwierzeta w klatkach
		// zad 4 Kazde zwierze generuje koszt miesieczny i roczny 
		// zad 5 Zoo sprzedaje bilety w cenach 5 zł ulgowy 9 zł normalny 
		// zad 6 na podstawie zmieniajacych sie kosztow generujacych przez zwierzeta i popularnosci zoo 
	 	//         stworz metode ktora bedzie generowala i proponowala zmiany cen biletów.
		
		
		// Metody, klasy, obiekty, relacje klas (przynaleznosc i wspolpraca)
		// Atrybuty, atrybuty wyliczalne, automatyczna numeracja obiektów
		// static jako metoda i jako pole - zastosowania
		// Tablice obiektów 
		
		// Na nastepne zajecia
		// Metody klas wbudowane, przeciazanie metod, klasa Object, bloki statyczne i niestatyczne inicjalizacyjne 
		// Kolekcje
		}
}
