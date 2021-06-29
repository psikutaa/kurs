package JavaPodstawyy;

import java.util.Arrays;

public class Lekcja3 {

	public static void main(String[] args) {

//		int liczba1 = 43;
//		int liczba2 = 23;
//
//		System.out.println(liczba1 & liczba2);
//		System.out.println(liczba1 | liczba2);
//		System.out.println(liczba1 ^ liczba2);


		String str1 = "Kurs programowania w jêzyku Java";
		String str2 = " jest fajny.";

		str1 = str1.concat(str2);
		System.out.println(str1);

		String s1 = "";
		String s2 = "kUrS";
		String s3 = new String("Kurs");
		String s4 = String.valueOf(s1);

		System.out.println(str1.charAt(7));
		System.out.println(str1.contains("java"));
		System.out.println(str1.endsWith("fajny."));
		System.out.println(str1.startsWith("Wu"));
		System.out.println("-------------------------------");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println("------------------------------");

		System.out.println(str1.indexOf('a'));
		System.out.println(str1.lastIndexOf('a'));

		System.out.println(s1.isEmpty());
		System.out.println(s2.length());

		System.out.println(str1 = str1.replace('a', 'Z'));
		System.out.println(str1);

//		String nic = null;
//		
//		System.out.println(nic.isEmpty());

		System.out.println(str1.substring(10));
		System.out.println(str1.substring(10, 15));

		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());

		// zad 1. Majac zdanie wyswietl je po literce
		String zdanie = "Ala Basia Marysia Ola Zosia Kasia";
//		
//		for(int idx = 0; idx < zdanie.length(); idx++)
//			System.out.println(zdanie.charAt(idx));

		// zad 2. Wyswietl to samo zdanie od tylu

//		for(int idx = zdanie.length()-1; idx >= 0; idx--)
//			System.out.println(zdanie.charAt(idx));

		// zad 3. Czy w zdaniu wiecej jest liter duzych czy malych
		int iloscMalych = 0, iloscDuzych = 0;
		for (int idx = 0; idx < zdanie.length(); idx++) {
			if (zdanie.charAt(idx) >= 'a' && zdanie.charAt(idx) <= 'z')
				iloscMalych++;
			if (zdanie.charAt(idx) >= 'A' && zdanie.charAt(idx) <= 'Z')
				iloscDuzych++;

		}
		System.out.println(iloscMalych);
		System.out.println(iloscDuzych);

		// zad 4. Ile zdanie ma slow
		zdanie = zdanie.trim();
//		int iloscSlow = 1;
//		for(int idx = 0; idx < zdanie.length(); idx++)
//			if(zdanie.charAt(idx) == ' ')
//				iloscSlow++;
//		
//		System.out.println(iloscSlow);

//		System.out.println(zdanie.split(" ").length);

		// zad 5. Ktora litera wystawpila nawieksza ilosc razy

		int ileMax = 0;
		char znakMax = zdanie.charAt(0);

		for (int i = 0; i < zdanie.length(); i++) {
			int ile = 0;
			for (int j = 0; j < zdanie.length(); j++)
				if (zdanie.charAt(i) == zdanie.charAt(j))
					ile++;

			if (ile > ileMax) {
				ileMax = ile;
				znakMax = zdanie.charAt(i);
			}
//			System.out.println(zdanie.charAt(i) + ": " + ile);
		}

		System.out.println(znakMax);
		// zad 6. Zamien wszytskie slowa Java na Python

		System.out.println(zdanie.replaceAll("Java", "Python"));
		// zad 7. Pomieszaj slowa w zdaniu.

//		String[] tabSlowa = zdanie.split(" ");
//		boolean[] czyUzyte = new boolean[tabSlowa.length];
//		boolean czyLosujemy = true;
//		
//		while(czyLosujemy) {
//			
//			int los = (int)(Math.random() * tabSlowa.length);
//			
//			if(!czyUzyte[los]) {
//				System.out.println(tabSlowa[los]);
//				czyUzyte[los] = true;
//			}
//			
//			czyLosujemy = false;
//			
//			for(int i  = 0; i < czyUzyte.length; i++)
//				if(!czyUzyte[i])
//					czyLosujemy = true;
//		}

		// Zad 8 Zamien liczbe podana przez uzytkwonika z systemu 10 na 2
		// Zad 9 Zamien liczbe podana przez uzytkwonika z systemu 2 na 10

//		String s = "A";
//		
//		s = "C" + s;
//
//		System.out.println(s);
		int liczba = 315;

//		System.out.println((liczba+"").length());

		// Zad 8 Zamien liczbe podana przez uzytkwonika z systemu 10 na 2

//		String wynik = "";
//		
//		while(liczba > 0) {
//			wynik = liczba % 2 + wynik;
//			liczba /= 2;
//		}
//		System.out.println(wynik);

//		String bin = "100111011";
//		int wynik = 0;
//		
//		for(int idx = bin.length()-1, potega = 0; idx >= 0; idx--, potega++)
//			if(bin.charAt(idx) == '1')
//				wynik += Math.pow(2, potega);
//		
//		
//		System.out.println(wynik);

		int[] tab = {60, 80, 60};

//		System.out.println(tab.length);
//		int[] tab1 = new int[10];
//		
//		System.out.println(tab[3]);
//		
//		System.out.println(tab);
//		System.out.println(Arrays.toString(tab));
//		
//		for(int i = 0; i < tab.length; i++)
//			System.out.print(tab[i] + " ");

		// zad 1. suma elementow z tablicy
//		int suma = 0;
//		
//		for(int i = 0; i < tab.length; i++ )
//			suma += tab[i];
//		
//		System.out.println("Suma: " + suma);
		// zad 2. Amplituda elemtnow z tablicy
		int min = tab[0], max = tab[0];
		
		for(int i = 0; i < tab.length; i++) {
			if(tab[i] < min)
				min = tab[i];
			if(tab[i] > max)
				max = tab[i];
		}
		
		System.out.println(max - min);

		// zad 3. liczba o najwieksze sumie cyfr
//		int max = tab[0];
//		int sumaMax = 0;
//		
//		for(int i = 0; i < tab.length; i++) {
//			int ele = tab[i];
//			if(ele < 0)
//				ele = -ele;
//			
//			int suma = 0;
//			while(ele != 0) {
//				suma += ele % 10;
//				ele /= 10;
//			}
//			
//			if(sumaMax < suma) {
//				sumaMax = suma;
//				max = tab[i];
//				
//			}
//			System.out.println(tab[i] + " suma: " + suma);
//		}
//		
//		System.out.println("Max: " + max);

		// zad 4. odwroc porzadek tablicy

//		int start = 0;
//		int koniec = tab.length - 1;
//
//		System.out.println(Arrays.toString(tab));
//
//		while (start < koniec) {
//			int tmp = tab[start];
//			tab[start] = tab[koniec];
//			tab[koniec] = tmp;
//
//			start++;
//			koniec--;
//		}
//
//		System.out.println(Arrays.toString(tab));

		// zad 5. œrednia arytmetyczna z zaokragleniem do 1 miejsca po przecinku
		
//		double suma = 0; 
//		
//		for(int element : tab)
//			suma += element;
		
		
		
		
		
//		suma /= tab.length;
//		suma *= 10;
//		if(suma * 10 % 10 > 4)
//			suma++;
//		
//		int tmp = (int)(suma);
//		suma = (double)(tmp)/10;
//		
//		
//		System.out.printf("%.1f", suma/ tab.length);
//		
//		System.out.println();
//		Arrays.sort(tab);
//		System.out.println(Arrays.toString(tab));
	
//		int[] t1 = {4, 3, 6};
//		int[] t2 = {2, 8};
//		int[] t3 = {-2, 7, 11};
//		int[] t4 = {7, 3, 2, 1, 1};
//		
//		int[][] tt1 = {t1, t2};
//		int[][] tt2 = {t3, t4};
//		
//		int[][][] ttt3 = {tt1, tt2} ;
//		
//		System.out.println(ttt3[1][1][2]);
		
		int[][] t = new int[10][10];
		
		
		// zad 1. Stworz tablice 10 x 10 
		// zad 2. wypelnij ja losowymi wartosciami od -99 do 99
		// zad 3. Znajdz wartosc najwieksza
		// zad 4. Suma kolumn
		// zad 5. suma wierszy 
		
	
	}
}
