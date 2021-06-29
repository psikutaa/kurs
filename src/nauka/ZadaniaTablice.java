package nauka;

import java.util.Arrays;
import java.util.Random;

public class ZadaniaTablice {
	public static void main (String [] args) {
		int [] tablica = {-666, 3, 55, 8, -12199,1};
		int [] tablica2 = {1,1};
		int [] tablica3 = {};
		int[] tablica4 = {1, 2 , -4};
		int[][] tablica2wymiarowa = new int[10][10];
		int[][] tablica2wymiarowa2 = new int[3][4];
//		zad1(tablica3);
//		zad3(tablica);
//		zad4_rm(tablica);
//		zad4(tablica);
//		zad5(tablica4);
		zad2_2W(tablica2wymiarowa2);
		zad3_2W(tablica2wymiarowa);
		zad4_2W(tablica2wymiarowa2);
		
		
		//		zad 1. Amplituda elemtnow z tablicy
	

//		
		// zad 1. Stworz tablice 10 x 10 
		
//		
		
		
		

		

		
		// zad 5. suma wierszy 
//		int kolumna = 0;
//		int b = 1;
//		int sumaWiersza;
//		while (kolumna < 10) {
//			sumaWiersza = 0;
//			for (ndx = 0; ndx < 10; ndx++) {
//				sumaWiersza = sumaWiersza + tablica2wymirowa[kolumna][ndx];
//			}
//			System.out.println("Suma wiersza " + b + " to " + sumaWiersza);
//			kolumna++;
//			b++;
		}
		// 6. Uporządkuj od najmniejszej do największej
		
//		int[] tab = { 2, 2, 3, 1, 2, 3, 7, -8, 17, 43, 56, 9, 2, 2, 2, 3, 1 };
//		
//		int kolejna;
//		int dlugoscTab = tab.length;
//		int zakres = 0;
//		int tymczasowy = 0;
//		int przestawiana = 0;
//		int z = 0;
//		
//		while (z < tab.length) {
//			for (int i = zakres; i < dlugoscTab; i++) {
//				if (tab[i] <= tab[zakres]) {
//					tymczasowy = tab[zakres];
//					przestawiana = tab[i];
//					tab[zakres] = przestawiana;
//					tab[i] = tymczasowy;
//					System.out.println(tab[i]);
//				}
//			}
//			System.out.println(przestawiana);
//			zakres++;
//			z++;
//		}
//		System.out.println(Arrays.toString(tab));
//		
//	}
	public static void strFunc(String str) {
		str +=" funkcja";
		System.out.println(str);
	}
	public static int sum(int x, int y) {
		return x + y;
	}
	public static void zad1 (int[] tablica) {
//		int suma = sum(1,3); //dotyczy tego co wyżej
		if(tablica.length == 0) {
			System.out.println("Brak elementów ...");
			return;
		}
		
		int min = tablica[0], max = tablica[0];
		
		for (int i = 0; i < tablica.length; i++) {
			if (tablica[i] < min)
				min = tablica[i];
			if (tablica[i] > max)
				max = tablica[i];
		}
		
		System.out.println("amplituda to " + (max - min));
	}
	public static void zad3 (int[] tablica) {
//		zad 3. liczba o najwieksze sumie cyfr //Zrobione tylko że zamiast pokazywać pozycję pokazuje najwyższą wartość
		int max = 0, tymczasowyMax = 0, idx = 0;
		for(int i = 0; i < tablica.length; i++) {
			int liczba = tablica[i];
			tymczasowyMax = 0;
			if(liczba < 0)
				liczba = - liczba;
			while (liczba >= 1) {
				tymczasowyMax = tymczasowyMax + liczba % 10;
				liczba = liczba / 10;
			}

			if (max < tymczasowyMax) {
				max = tymczasowyMax;
				idx = i;
			}
		}
		System.out.println(tablica[idx]);
		System.out.println(max);

	}
	public static void zad4 (int[] tablica) {
//		zad 4. odwroc porzadek tablicy
		System.out.println(Arrays.toString(tablica));
		int tymczasowy = 0, tymczasowyPierwszy;
		
		for (int i = 0; i < tablica.length - 1; i++) {
			tymczasowy = tablica[tablica.length - (i + 1)];
			tymczasowyPierwszy = tablica[i];
			tablica[i] = tymczasowy;
			tablica[tablica.length - (i + 1)] = tymczasowyPierwszy;
			
		}
		System.out.println(Arrays.toString(tablica));
	}
	public static void zad4_rm (int[] tablica) {
//		zad 4. odwroc porzadek tablicy
		int[] newTab = new int [tablica.length];
		
		for (int i = 0; i < tablica.length; i++) {
			newTab[i] = tablica[tablica.length - 1 - i];
	
		}
		System.out.println("moje");
		System.out.println(Arrays.toString(tablica));
		System.out.println(Arrays.toString(newTab));
	}
	public static void zad5 (int[] tab) {
		// zad 5. œrednia arytmetyczna z zaokragleniem do 1 miejsca po przecinku
		
		
		
		System.out.println(Arrays.toString(tab));
		
		System.out.println(tab.length);
		
		double suma = 0;
		double sredniaArytm = 0;
		for (int i = 0; i < tab.length; i++) {
			suma = tab[i] + suma;
		}
		System.out.println(suma);
		sredniaArytm = suma / tab.length;
		
		System.out.printf("Suma: %10s \nSrednia: %.1f",suma, sredniaArytm);
		
	}
	public static void zad2_2W (int[][] tab) {
// zad 2. wypelnij ja losowymi wartosciami od -99 do 99
		
		Random r = new Random();

		for (int n = 0; n < tab.length; n++) {
			for (int i = 0; i <= tab.length - 1; i++) {
//				tab[n][i] = r.nextInt(199)-99;
				tab[n][i] = r.nextInt(11);

			}
		}
		System.out.println(Arrays.deepToString(tab)
				.replace("], ", "]\n")
				.replace("[[", "[")
				.replace("]]", "]"));
	}
	public static void zad3_2W (int[][] tab) {
		// zad 3. Znajdz wartosc najwieksza
		int max = 0;
		for (int n = 0; n < tab.length; n++ )
			for (int i = 0; i < tab[n].length; i++) {
				if (tab[n][i] > max || (n == 0 && i == 0) )
					max = tab[n][i];
				}
			
		
		System.out.println(max);
	}
	public static void zad4_2W (int[][] tab) {
		// zad 4. Suma kolumn
		
		int a = 1;
		int sumaKolumny;
		for (int kolumna = 0; kolumna < tab[0].length; kolumna ++) {
			sumaKolumny = 0;
			for (int wiersz = 0; wiersz < tab.length; wiersz++){
				sumaKolumny += tab[wiersz][kolumna];
			}
			System.out.println("Suma kolumny " + (a) + " to: " + sumaKolumny );
			a++;
		}	
		
	}
}
