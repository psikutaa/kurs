package JavaPodstawyy;

import java.util.Scanner;

public class lekcja2 {
	
	public static void main(String[] args) {
		
		
//		for(int start = 0; start <= 100; start++)
//			System.out.println(start);
		
//		System.out.println();
		
//		int start = 0;
//		while(start <= 100) {
//			System.out.println(start);
//			start++;
//		}
		
//		boolean szukamyPodzielnejPrzez11i12 = false;
//		
//		int sprawdzana = 0;
//		while(!szukamyPodzielnejPrzez11i12) {
//			sprawdzana++;
//			if(sprawdzana % 11 == 0 && sprawdzana % 12 == 0)
//				szukamyPodzielnejPrzez11i12 = true;
//			
//		}
//		
//		System.out.println(sprawdzana);
		
		int sprawdzana = 1;
		for(boolean czySzukamy = true;czySzukamy;sprawdzana++) {
			if(sprawdzana % 11 == 0 && sprawdzana % 12 == 0)
				czySzukamy = false;
		}
		
		System.out.println(sprawdzana-1);
		
		// 1. Z wykorzystaniem pętli for, wypisz dzielniki liczby n 
		// 2. Z wykorzystaniem pętli for, zlicz dzielniki liczby n 
		// 3. Z wykorzystaniem petli for wypisz wszystkie liczby zakończone na 7 i 5 od -100 do 100
		// 4. Suma cyfr danej liczby 
		// 5. zarpoponuj mechanizm a do potęgi b 
		
		//1 
//		int n = 50;
//		
//		for(int dzielnik = 1; dzielnik <= n; dzielnik++)
//			if(n % dzielnik == 0)
//				System.out.println(dzielnik);
		
		// 2
		System.out.println("---------------");
		int n = 50;
		int ile = 0;
		for(int dzielnik = 1; dzielnik <= n; dzielnik++)
			if(n % dzielnik == 0)
				ile++;
		System.out.println(ile);
		
		// 3
		
//		for(int start = -100; start <= 100; start++)
//			if(start % 10 == 7 || start % 10 == -7 || start % 10 == 5 || start % 10 == -5)
//				System.out.println(start);
		// 4
//		int suma = 0;
//		
//		for(int liczba = 1314;liczba != 0; liczba /= 10)
//			suma += liczba % 10;
//		
//		System.out.println(suma);
		
		// 5
//		int wynik = 1;
//		
//		for(int a = 2, b = 7; b != 0; wynik *= a, b--);
//		
//		System.out.println(wynik);
	
		// 6. Wykorzystujac for napisz oblicz silnię z danej liczby 
		// 7. Wykorzystujac while napisz nwd
		// 8. wykorzystujc pętle while napisz nww
		
//		5! -> 5 * 4 * 3 * 2 * 1
		
//		Scanner scan = new Scanner(System.in);
//		
//		int liczba1 = scan.nextInt();
//		int liczba2 = scan.nextInt();
//	
//		System.out.println(liczba1 + liczba2);
	
//		9. pobierzcie od użytkwonika 5 liczb, wyświetl najmniejsza z nich
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		int min = scan.nextInt();
//		for(int i = 0; i < 9; i++) {
//			int wrt = scan.nextInt();
//			if(min > wrt)
//				min = wrt;
//			
//		}
//		
//		System.out.println(min);
		
//		for(int i = 0; i < 10; i++)
//			System.out.println((int)(Math.random()*21)-10);
		
//		10. wylosuj 10 liczb z przedziału od -10 do 10
		
//		11. Gra losuje liczbę od -100 do 100
//		    Uzytkwonik zgaduje liczbe przez wprowadzenie jej a konsoli
//			dostaje komunikaty za mała, za duża
//		    Gdy zgadnie wyswietla się za którym razem zgadł
		
//		int wylosowana = (int)(Math.random() * 201 - 100);
//		int pobrana = -200;
//		Scanner scan = new Scanner(System.in);
//		int ileZgadywales = 0;
//		
//		while(wylosowana != pobrana) {
//			System.out.println("Podaj swoj strzał: ");
//			pobrana = scan.nextInt();
//			
//			if(pobrana < wylosowana)
//				System.out.println("Twoja liczba jest zamala");
//			if(pobrana > wylosowana)
//				System.out.println("Twoja liczba jest zaduza");
//			
//			ileZgadywales++;
//		}
//		
//		System.out.println("Zgadłeś za: " + ileZgadywales +" razem");
		
//		12. uzytkownik wproawdza liczbe
//		komputer ja zgaduje 
//		komputer tez wyciaga wnioski ?
		
		
//		Praca domowa na punkty: (10pkt)
//			1. Wyświetl 40 kolejno znalezionych liczb pierwszych
//			2. Sprawdz czy dana liczba jest palindromem (zakaz używania string, pokrewnych i tablic)
//			3. Znajdz 4 kolejne liczby doskonałe
//			4. dla n = 5 (przyklad) wyświetl: 
//				a)
//				*
//				* *
//				* * *
//				* * * *
//				* * * * *
//				b)
//				* * * * *
//				  * * * * 
//				    * * *
//				      * * 
//				        *
//				c)
//				* * * * *
//				* * * *
//				* * *
//				* *
//				*
//				d)
//				        *
//				      * *
//				    * * * 
//				  * * * *
//				* * * * *
//			 5. dla n = 5
//			 	x o x o x
//			 	o x o x o
//			 	x o x o x
//			 	o x o x o
//			 	x o x o x
//			 	
//			 	(dla parzystych również szachownica)
//			 6. dla n = 5 (przykład)
//			 	o x x x o
//			 	x o x o x
//			 	x x o x x
//			 	x o x o x
//			 	o x x x o
//			 7. piramida dla n = 4 (przykład)
//			 
//			 		1
//			 	   1 1
//			 	  1 2 1
//			 	 1 2 2 1
//			 	1 2 3 2 1
//			   1 2 3 3 2 1
//			  1 2 3 4 3 2 1 
//			  
//			  8. do góry nogami zad 7.  
//			 
				  
//			Scanner scan = new Scanner(System.in);
//			
//			int naszaLiczba = scan.nextInt();
//			
//			int poczatek = -100;
//			int koniec = 100;
//			int ile = 0;
//			int zgadywana  = 200;
//			
//			while(zgadywana != naszaLiczba && naszaLiczba <= 100 && naszaLiczba >= -100) {
//				zgadywana = (int)(Math.random() * (koniec - poczatek) + poczatek);
//				System.out.printf("Zgaduje z przedzialu [%d : %d]: %d\n", poczatek, koniec, zgadywana);
//				if(zgadywana < naszaLiczba) {
//					poczatek = zgadywana+1;
//					System.out.println("Za mała !");
//				}
//				if(zgadywana > naszaLiczba) {
//					koniec = zgadywana-1;
//					System.out.println("Za duża !");
//				}
//				ile++;
//			}
//			
//			if(zgadywana == naszaLiczba)
//				System.out.println("Zgadłeś za " + ile +  " razem");
//			else	
//				System.out.println("Przegrałeś !");
//		
		
	}
}
