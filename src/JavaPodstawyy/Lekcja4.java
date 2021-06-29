package JavaPodstawyy;

import java.util.Arrays;

public class Lekcja4 {

	public static void main(String[] args) {

		int[] tab = { 2, 2, 3, 1, 2, 3, 7, -8, 17, 43, 56, 9, 2, 2, 2, 3, 1 };

//		2, 2, 3, 1, 2, 3, 7, -8, 17, 43, 56, 9, 2, 2, 2, 3, 1  min -8
//		
//		-8, 2, 3, 1, 2, 3, 7, 2, 17, 43, 56, 9, 2, 2, 2, 3, 1   min 1		
//		
//		-8, 1, 3, 2, 2, 3, 7, 2, 17, 43, 56, 9, 2, 2, 2, 3, 1   min 1
// 
//		-8, 1, 1, 2, 2, 3, 7, 2, 17, 43, 56, 9, 2, 2, 2, 3, 3  min 

//		start = 1
//		koniec = tab.length()

		for (int i = 0; i < tab.length; i++) {

			int min = tab[i];
			int idxMin = i;

			for (int z = i; z < tab.length; z++)
				if (tab[z] < min) {
					min = tab[z];
					idxMin = z;
				}
			int tmp = tab[i];
			tab[i] = tab[idxMin];
			tab[idxMin] = tmp;
			System.out.println(Arrays.toString(tab));
		}

		System.out.println(Arrays.toString(tab));

		// binary search
//	-1
//		int wrt = 3;

		// Zad1. zaimplementuj prost¹ grê w kó³ko - krzyzyk

//		int szukana = 5;
//		
//		int start = 0;
//		int koniec = tab.length-1;
//		int znalezionyIndex = -1;
//		int idx = 0;
//		while(start < koniec && znalezionyIndex == -1) {
//			idx = (koniec + start) / 2;
//			
//			if(tab[idx] == szukana)
//				znalezionyIndex = idx;
//			
//			if(tab[idx] < szukana)
//				start = idx+1;
//			if(tab[idx] > szukana)
//				koniec = idx-1;
//			
//			System.out.println(start + " " + koniec);
//		}
//		if(tab[idx] == szukana)
//			znalezionyIndex = idx;
//		
//		System.out.println(znalezionyIndex);

//		char[][] plansza = { { 'x', ' ', 'o' }, { 'o', 'o', 'o' }, { 'x', ' ', 'x' } };
//
//		boolean czyGraSkonczona = false;
//
//		for (int kolumna = 0; kolumna < plansza.length; kolumna++) {
//
//			if (plansza[0][kolumna] != ' ' && plansza[0][kolumna] == plansza[1][kolumna]
//					&& plansza[1][kolumna] == plansza[2][kolumna])
//				czyGraSkonczona = true;
//
//		}
//		for (int wiersz = 0; wiersz < plansza.length; wiersz++) {
//
//			if (plansza[wiersz][0] != ' ' && plansza[wiersz][0] == plansza[wiersz][1]
//					&& plansza[wiersz][1] == plansza[wiersz][2])
//				czyGraSkonczona = true;
//
//		}
//
//		if (plansza[0][0] != ' ' && plansza[0][0] == plansza[1][1] && plansza[2][2] == plansza[1][1])
//			czyGraSkonczona = true;
//
//		if (plansza[0][tab.length-1] != ' ' && plansza[0][tab.length-1] == plansza[1][1] && plansza[tab.length-1][0] == plansza[1][1])
//			czyGraSkonczona = true;
//
//		boolean czyZapelnione = true;
//		for(int i = 0; i < plansza.length; i++)
//			for(int j = 0; j < plansza.length; j++)
//				if(plansza[i][j] == ' ')
//					czyZapelnione = false;
//		
//		if(czyZapelnione)
//			czyGraSkonczona = true;
//		
//		System.out.println(czyGraSkonczona);

//		Do domku: (10pkt)
		// zad 1 Stworz tablice charow 10 x 10
		// zad 2 Wypelnij ja wylosowanymi malymi literami alfabetu
		// zad 3 sprawdz czy w pionie/ poziomie lub skosie wylosowa³o sie slowo
		// 'abc'(wzglednij je wspak)
		// zad 4 sprawdz czy istnieja 2 litery obok siebie takie same (wypisz pozycje)
		// zad 5 znajdz litere wystepujaca najwieksz ailosc razy (jesli kilka wypisz
		// wsyztskie)
//		------------

		// zad 6 Na podstawie 2 tablic jedno wymiarowych stworz tabliczke mnozenia i
		// zapisz ja w tablicy 2 wymiarowej
		// zad 7 Zaimplementuj prost¹ grê totolotek (zweryfikuj potwarzalnosc)
		// zad 8 Zaimplementuj gre Bingo

//		Do domu dokonczyc kolko-krzyzyk (5pkt wymagane doslac do 21.05)

//		minMax(tab);

//		silnia(6);
//
//		wypisz (tabl);
//		fib(10);
		
//		dzileniki(48);
		
//		System.out.println(suma(tab));
		
		
//		System.out.println(fibb(10));
		
//		dzielniki(100, 1);
		
		System.out.println(Arrays.toString(tabWspak(tab)));
	}

	// zad 1 napis zmetode ktora przyjmie tablice i wypisze najmniejsza i najwieksza
	// wartosc

	public static void wypiszOdDo(int start, int koniec) {
// uzueplnij zeby zawsze wypisywalo od do 

		while (start != koniec) {
			System.out.println(start);
			if (start < koniec)
				start++;
			else
				start--;
		}
		System.out.println(start);
	}

	// zad 2 napisz metode ktora przyjmie wartosc i wypisze silnie z tej liczby
	// zad 3 napisz metode ktora przyjmie wartosc bedaca numerem wyrazu ciagu
	// Fibbonaciego i wypisze te wyrazy
	// zad 4 napisz metode ktora przyjmie liczb i wypisze wszytskie dzileniki tej
	// liczby

	public static void minMax(int[] tab) {
		int min = tab[0];
		int max = min;

		for (int i = 0; i < tab.length; i++) {
			if (min > tab[i])
				min = tab[i];
			if (max < tab[i])
				max = tab[i];
		}

		System.out.printf("Min: %d, Max: %d", min, max);
	}

	public static void silnia(int liczba) {
		int wynik = 1;

		for (int i = 1; i <= liczba; i++)
			wynik *= i;

		System.out.println(wynik);

	}

	public static void fib(int pozycja) {
		int p = 0;
		int p1 = 1;
		System.out.println(p);
		
		for(int i = 0 ; i < pozycja; i++) {
			System.out.println(p1);
			int tmp = p + p1;
			
			p = p1;
			p1 = tmp;
		}
	}
	
	public static void dzileniki(int liczba) {
		
		for(int dzielnik = 1; dzielnik <= liczba; dzielnik++)
			if(liczba % dzielnik == 0)
				System.out.println(dzielnik);
		
	}
	
	public static int suma(int[] tab) {
		int suma = 0;
		
		for(int ele : tab)
			suma += ele;
		
		return suma;
	}
	
	// zad1. Przerob metode silnia na zwracanie wyniku silni 
	// zad2. Zwroc ilosc dzilenikow dostarczonej do metody liczby 
	// zad3. Zwroc numer elementu ciagu fib.. 10 -> 55
	// zad4. Zwroc tablice uzueplniona wspak 
	// zad5. Zwroc slowo(String) wspak
	// zad6. Zwroc sumê cyfr dostarczonej liczby
	
	public static String wspak(String str) {
		String wynik = "";
		
		for(int i = str.length()-1; i >= 0; i--)
			wynik += str.charAt(i);
		
		return wynik;
	}
	
	public static int fibb(int pozycja) {
		int p = 0;
		int p1 = 1;
		
		if(pozycja == 0)
			return p;
		
		for(int i = 1; i < pozycja; i++) {
			int tmp = p1 + p;
			p = p1;
			p1 = tmp;
			System.out.println(p1);
		}
		return p1;	
		
	}
	
	public static int[] tabWspak(int[] tab) {
		
		int start = 0; 
		int koniec = tab.length-1;
		
		while(start < koniec) {
			
			int tmp = tab[start];
			tab[start] = tab[koniec];
			tab[koniec] = tmp;
			start++;
			koniec--;
		}
		
		return tab;
	}
	
	// rekurencja -> zakaz uzywania pêtli !
	
	public static void wypisz(int start, int stop) {
		System.out.println(start);
		if(start < stop)
			wypisz(start+1, stop);
		if(start > stop)
			wypisz(start-1, stop);
	}
	
	public static void dzielniki(int liczba, int dzielnik) {
		if(liczba % dzielnik == 0)
			System.out.println(dzielnik);
	
		if(dzielnik < liczba)   
			dzielniki(liczba, dzielnik+1);
		
		
	}
	
	public static int silniaRek(int liczba) {
		
		if(liczba < 2)
			return 1;
		return liczba * silniaRek(liczba-1);
		
		
	}
	
	// zad 1. wyswietl dzielniki danej liczby rekurencja
	// zad 2. zwroc silnie z danej liczby rekurencja
	// zad 3. zwroc sume cyfr danej liczby rekurencja
	// zad 4. zwroc ilosc cyfr danej liczby rekurencja
	
}
