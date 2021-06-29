package ZadaniaDomowe;

public class ZadaniaDomoweL2 {
	public static void main (String[] args) {
		liczbyPierwsze();
		radekLiczbyPierwsze();
		radekLiczbyPierwsze2();
		palindrom();
		palindrom2();
		doskonale();
		doskonale2();
		doskonale3();
		parzyste();
		choinka1();
		choinka1b();
		choinka2();
		
//	1. Wyświetl 40 kolejno znalezionych liczb pierwszych
	
	
	
	
//	2. Sprawdz czy dana liczba jest palindromem (zakaz używania string, pokrewnych i tablic)
// palindrom =to np 1221, 323   
	

	
//	3. ZNAJDZ 4 KOLEJNE LICZBY DOSKONAŁE
//JEST SUMĄ WSZYSTKICH SWOICH dzielników	
	


	
	
	
//	4. dla n = 5 (przyklad) wyświetl: 
//		a)

//	
//	
	
//		b)
//		* * * * *
//		  * * * * 
//		    * * *
//		      * * 
//		        *
		
//		int ile = 5, b;
//		String star = "* ", spacja = "  ", c;
//			for (ile = 5; ile >= 0; ile--) { //czemu nie można dać samego ile tylko trzeba nadać tutaj
//				c = star + star + star + star + star;
//				System.out.println(c);
//				c = c - star;
//		
//			}
		
		
//		c)
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
//		d)
//		        *
//		      * *
//		    * * * 
//		  * * * *
//		* * * * *
//	 5. dla n = 5
//	 	x o x o x
//	 	o x o x o
//	 	x o x o x
//	 	o x o x o
//	 	x o x o x
//	 	
//	 	(dla parzystych również szachownica)
//	 6. dla n = 5 (przykład)
//	 	o x x x o
//	 	x o x o x
//	 	x x o x x
//	 	x o x o x
//	 	o x x x o
//	 7. piramida dla n = 4 (przykład)
//	 
//	 		1
//	 	   1 1
//	 	  1 2 1
//	 	 1 2 2 1
//	 	1 2 3 2 1
//	   1 2 3 3 2 1
//	  1 2 3 4 3 2 1 
//	  
//	  8. do góry nogami zad 7.  
//	 

	}

	public static void doskonale() {
		int perfect = 6, d = 0;
		for (int n = 1; n < perfect; n++) // jesli liczba jest doskonała wypisuje ją
			
			if (perfect % n == 0) 
				d = d + n;	
			if ( d == perfect) 
				System.out.println(d);
			else 
				System.out.println("nie jest liczbą doskonałą");
	}
	
	public static void doskonale2() {
		int i = 0, iloscDoskonalych = 0;
		while ( iloscDoskonalych < 4) {
			i++;
			int sumaDzielnikow = 0;
			for (int n = 1; n < i; n++) {
				
				if (i % n == 0) 
					sumaDzielnikow = sumaDzielnikow + n;	
				
			}	
		//System.out.println(iloscDoskonalych);
			if ( sumaDzielnikow == i) {
				System.out.println(sumaDzielnikow);
				iloscDoskonalych++;
			}
		}
	}

	public static boolean jestLiczbaDoskonala(int x) {
		int sumaDzielnikow = 0;
		for (int n = 1; n < x; n++) {
			if (x % n == 0) 
				sumaDzielnikow = sumaDzielnikow + n;	
		}	
		if ( sumaDzielnikow == x) {
			//System.out.println(sumaDzielnikow);
			return true;
		}
		return false;
	}
	
	public static void doskonale3() {
		int i = 0, iloscDoskonalych = 0;
		while ( iloscDoskonalych < 4) {
			i++;
			if (jestLiczbaDoskonala(i) == true) {
				System.out.println(i);
				iloscDoskonalych++;
			}
		}
	}
	
	public static void parzyste() {
		int liczba = 0, ileLiczb = 1;
		while (ileLiczb <= 5) {
			liczba++;
			if (liczba % 2 == 0) {
				System.out.println(liczba);
				ileLiczb++;
			}
		}
	}
	
	public static void liczbyPierwsze() {
		int prime = 1, qua = 1; 
		while (qua <= 40) {
			
			for (int n = 2; n < prime; n++) 
				if  (prime % n == 0 )
					
			
			
			System.out.println(prime);
			qua++;
			prime++;
		}
	

	}
	
	public static void radekLiczbyPierwsze() {
		int a = 1, iloscPierwszych = 0;
		while (iloscPierwszych <= 40) {
			a++;
			int iloscPodzielnikow = 0;
			for(int i = 2; i < a; i++) {
				if (a % i == 0)
					iloscPodzielnikow++;
			}
//			System.out.println("Badana liczba " + a + " ma " + iloscPodzielnikow + " podzielników");
			if (iloscPodzielnikow == 0) {
				System.out.println(iloscPierwszych + ". liczbą pierwszą jest: " + a);
				iloscPierwszych++;
				
			}
		}
	}
	
	public static void radekLiczbyPierwsze2() {
		int a = 3, iloscPierwszych = 0;
		while (iloscPierwszych <= 40) {
			boolean jestLiczbaPierwsza = true; 
			for(int i = 2; i < a; i++) {
				if (a % i == 0) {
					jestLiczbaPierwsza = false;
					break;
				}
			}
//			System.out.println("Badana liczba " + a + " ma " + iloscPodzielnikow + " podzielników");
			if (jestLiczbaPierwsza == true) {
				System.out.println(iloscPierwszych + ". liczbą pierwszą jest: " + a);
				iloscPierwszych++;
				
			}
			a=a+2;
		}
	}

	public static void palindrom() {
		int nowaLiczba = 0, palind = 121;
		for (int i = palind; i > 0; i = i / 10) {
			nowaLiczba = i % 10 + nowaLiczba * 10;
			System.out.println(nowaLiczba);
		}

		if (nowaLiczba == palind)
			System.out.println(" liczba jest palindromem");
		else 
			System.out.println("liczba nie jest palindromem");
	}
	
	public static void palindrom2() {
		int nowaLiczba = 0, palind = 132231;
		
		for (int i = palind; i > 0; i = i / 10) {
			nowaLiczba =  nowaLiczba * 10 + (i % 10);		
			System.out.println(nowaLiczba);
		}
		//nowaLiczba = nowaLiczba / 10;
		if (nowaLiczba == palind)
			System.out.println(" liczba jest palindromem");
		else 
			System.out.println("liczba nie jest palindromem");
	}

	public static void choinka1() {
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
	
		int n, b = 5;
		String c = "* ", d = "";
		for (n = 1; n <= b; n++) {
			d = c + d;
			System.out.println(d);
		}
	}
	
	public static void choinka1b() {
		String d = "";
		for (int n = 1; n <= 5; n++) {
			d += "* ";
			System.out.println(d);
		}
	}

	public static void choinka2() {
//		* * * * *
//		  * * * * 
//		    * * *
//		      * * 
//		        *
		
		for( int i = 0; i < 5; i++) {
			int x = 5 - i, y = 0 + i;
			for (int n = 1; n <= y; n++) {
				System.out.print("  ");
				
			}
			for (int n = 1; n <= x; n++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
