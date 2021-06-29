package ZadaniaDomowe;



public class zadania31052021 {

 
	public static void main (String[] args) {

		
//		 zad4b(7);
//		 zad4b_rm(5);
//		 zad6();
//		 zad6a(5);
		 zad6_rm(5);
		zad7(5);
		// 1. Z wykorzystaniem pętli for, wypisz dzielniki liczby n 
//		int liczba = 23121222;
//		for (int n = 1; n < liczba; n++) {
//			if (liczba % n == 0)
//				System.out.println(n);
//		}
		
		// 2. Z wykorzystaniem pętli for, zlicz dzielniki liczby n 
	
//		int liczba1 = 333, dzielniki = 0;
//		for (int n = 1; n < liczba1; n++) {
//			if (liczba1 % n == 0)
//				dzielniki++;
//		}
//		System.out.println(dzielniki);
		
		//2b. z wykorzystaniem petli zliczyć sumę dzielników
		
//		int liczba2 = 489, dzielniki2 = 0;
//		for (int n = 1; n < liczba2; n++) {
//			if (liczba2 % n == 0)
//				dzielniki2 = dzielniki2 + n;
//		}
//		System.out.println(dzielniki2);
		
		//3. Z wykorzystaniem petli for wypisz wszystkie liczby zakończone na 7 i 5 od -100 do 100
		
//		for (int n = -100; n <= 100; n++) {
//			if ( n % 10 == 5 || n % 10 == 7 || n % 10 == - 5 || n % 10 == -7)
//				System.out.println(n);
//		}
		
		// 4. Suma cyfr danej liczby
		
//		int liczba = 444, suma = 0;
//		
//		while (liczba >= 1) {
//			suma = suma + liczba % 10;
//			liczba = liczba / 10;
//		}
//		System.out.println(suma);
		
		// 5. zarpoponuj mechanizm a do potęgi b 
		
//		int liczba = 2, ktoraPotega = 3, c = 1;
//		for (int n = 1; n <= ktoraPotega; n++) {
//			c = c * liczba;
//		}
//		System.out.println(c);
// __________________________________________________________________________________-
		
		
//		1. Wyświetl 40 kolejno znalezionych liczb pierwszych
//		int badana = 300;
//		int a = 0;
//		while (a < 40) {
//			badana++;
//			boolean czyPierwsza = true;
//			
//			
//			for (int i = 2; i < badana; i++)
//				if (badana % i == 0) {
//					czyPierwsza = false;
//					break;
//				}
//			
//			if (czyPierwsza == true) {
//				System.out.println(badana);
//				a++;
//			}
//		}	
		
//		int badana = 2 , ile = 0;
//		
//		while (ile < 40) {
//			int iloscPodzielnikow = 0;
//			badana++;
//			for (int n = 2; n < badana; n++) {
//				if (badana % n == 0)
//					iloscPodzielnikow++;
//			}
//	
//			if (iloscPodzielnikow == 0) {
//				System.out.println(badana);
//				ile++;
//			}
//			
//		}

//		1A wyświetl liczby parzyste od 1 -100
//		int i = 1;
//		while (i <= 100) {
//			if (i % 2 == 0)
//				System.out.println(i);
//			i++;	
//		}
		
//		2. Sprawdz czy dana liczba jest palindromem (zakaz używania string, pokrewnych i tablic)
	// palindrom =to np 1221, 323   
		

		
//		3. ZNAJDZ 4 KOLEJNE LICZBY DOSKONAŁE
	//JEST SUMĄ WSZYSTKICH SWOICH dzielników	
		
		
//		int badana = 1, ile = 0, sprawdzana = 0;
//		
//		while (ile < 4) {
//		sprawdzana = 0;
//			for (int i = 1; i < badana; i++) {
//				if (badana % i == 0)
//					sprawdzana = sprawdzana + i;
//				
//			}
//			
//			if (sprawdzana - badana == 0) {
//				System.out.println(badana);
//				ile++;
//			}
//			badana++;
//				
//		}

		
		
		
//		4. dla n = 5 (przyklad) wyświetl: 
//			a)
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
		
//		int n = 100;
//		String znak = "";
//		for (int i = 1; i <= n; i++) {
//			String gwiazdka = "* ";
//			znak = znak + gwiazdka;
//			System.out.println(znak);
//		}
//		

//			b1)
//		* * * * * 
//		* * * * * 
//		* * * * * 
//		* * * * * 
//		* * * * * 

//		int i = 5, z = 0;
//		while (z < i ) {
//			for (int n = 1; n <= i; n++) {
//			System.out.print("*");
//			System.out.print(" ");
//			}
//			System.out.println("");
//			z++;
//		}
			
			
//			c)
//			* * * * *
//			* * * *
//			* * *
//			* *
//			*
//		int i = 5, z = 0, a = i;
//		while (z < i ) {
//			for (int n = 1; n <= a; n++) {
//			System.out.print("*");
//			System.out.print(" ");
//			}
//			System.out.println("");
//			z++;
//			a--;
//		}
		
//			d)
//			        *
//			      * *
//			    * * * 
//			  * * * *
//			* * * * *
//		int n = 15;
//		int ile = 1, a = n - 1, b = 1;
//		while (ile <= n) {
//			for (int i = 1; i <= a; i++) {
//			System.out.print("  ");
//			}
//			for (int i = 1; i <= b; i++) {
//				System.out.print("*");
//				System.out.print(" ");
//			}
//			System.out.println();
//			ile++;
//			a--;
//			b++;
//		}
//		

		
//		 5. dla n = 5
//		 	x o x o x
//		 	o x o x o
//		 	x o x o x
//		 	o x o x o
//		 	x o x o x
		
//		int n = 11;
//		int ile = 0, a, b;
//		
//		while (ile <= n) {
//
//			for(int i = 1; i <= n; i++){
//				if (i % 2 == 0)
//					System.out.print("x ");
//				else
//					System.out.print("o ");
//			}
//			
//			ile++;
//			
//			if (ile == n)
//				break;
//			
//			System.out.println("");
//			
//			for(int i = 1; i <= n; i++){
//				if (i % 2 == 0)
//					System.out.print("o ");
//				else
//					System.out.print("x ");
//			}
//
//			ile++;
//			
//			if (ile == n)
//				break;
//			
//			System.out.println("");
//		}
//		 	(dla parzystych również szachownica)

//		 7. piramida dla n = 4 (przykład)

//		 		1
//		 	   1 1
//		 	  1 2 1
//		 	 1 2 2 1
//		 	1 2 3 2 1
//		   1 2 3 3 2 1
//		  1 2 3 4 3 2 1 
//		  
// 		int n = 5;   // robi piramidę
//	int a = 0, b = n, ile = 0, d = 1;
//	while (ile <= n) {
//	
//		for(int i = 1; i <= a; i++) {
//			System.out.print(" ");
//		}
//		for (int i = 0; i < b; i++) {
//	
//			System.out.print(d);
//			System.out.print(" ");
//			
//		}
//		System.out.println("");
//		a++;
//		b--;
//		ile++;
//	}
 		

//		  8. do góry nogami zad 7.  
 		
//		 int ileLiczb = 5;
//		 int ileRazy = ileLiczb, a, b = 0,  c, d = 1, e = ileLiczb;
//		 while (ileRazy > 0) {
//			 a = 0; 
//			 d = 1;
//			 c = e / 2;
//
//			 while (a < b) {
//				 System.out.print(" ");
//				 a++;
//			 }
//			 for(int n = 1; n <= e; n++) {
//				 if (n <= e - e/2 && d > 0) {
//					 System.out.print(d);
//					 System.out.print(" ");
//					 d++;
//				 }
//				 else {
//					 System.out.print(c);
//					 c--;
//					 System.out.print(" ");
//				 }
//				 
//			 }
//			 
//			
//			 System.out.println("");
//			 
//			 ileRazy--;
//			 b++;
//			 e--;

			 
			 
		
		 }

	public static void zad4b(int n) {
//		b)
//		* * * * *
//		  * * * * 
//		    * * *
//		      * * 
//		        *
	
		
		int a = 0, b = n;
		while (a <= n) {
			for(int i = 1; i <= a; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i <b; i++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
			a++;
			b--;
		}
	}
	
	public static void zad4b_rm(int n) {
		for (int i=0; i< n; i++) {
			printChar("  ",i);
			printChar("* ", n - i);
			System.out.println("");

		}
		for (int i=0; i< n; i++) {
			System.out.print("  ".repeat(i));
			System.out.println("* ".repeat(n-i));
		}
	}
	
	public static void printChar(String zn, int count) {
		for (int i=0; i< count; i++)
			System.out.print(zn);
	}

	public static void zad6() {
//		 6. dla n = 5 (przykład)
//	 	o x x x o
//	 	x o x o x
//	 	x x o x x
//	 	x o x o x
//	 	o x x x o
		int n = 5;
		int ile = 0, a = 1, b = n, y = 1;
		while (ile <= n) {
			
			for(int i = 1; i <= n; i++) {
				if (a == i || b == i )
					System.out.print("o ");
				else
					System.out.print("x ");
			}
			
			System.out.println("");
			
			ile++;
			a++;
			b--;
			
			if (ile == n)
				break;
			
		}
	}
	public static void zad6a(int n) {
		int b=n;
		for (int row=1; row <= n; row++) {
			for(int i = 1; i <= n; i++) {
				if (row == i || b == i )
					System.out.print("o ");
				else
					System.out.print("x ");
			}
			
			System.out.println("");
			b--;	
		}
	}
	public static void zad6_rm(int n) {
		for (int i=1; i <= n; i++) {
			for (int j=1; j<=n; j++) {
				if(j == i || j == n - i +1)
					System.out.print("x ");
				else
					System.out.print("o ");
			}
			System.out.println();
		}
	}
	public static void zad7 (int n) {
 		
 		int ile = 1, a = 0, b = n, c = n, g = n, d = g;
 		while (ile <= n) {
 			c = 1; 
 			d = g;
	 		for (int i = 1; i <= a; i++) {
	 			System.out.print(" ");
	 		}
	 		
	 		for (int i = 1; i <= b; i++) {
	 			if(i <= b / 2) 
	 				System.out.print(c);
	 			else
	 				System.out.print(d);
	 			
			 	System.out.print(" ");
			 	c++;
			 	d--;	
	 		}
	 		
	 		System.out.println("");
	 		a++;
	 		ile++;
	 		b--;
	 		c--;
	 		g--;

 		}
	}
}

