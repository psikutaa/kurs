package zadania.z.internetu.nr3;

import java.util.Scanner;

//Utwórz tablicę typu int przechowującą n elementów - gdzie n jest parametrem pobieranym od użytkownika. 
//Następnie wypełnij ją liczbami od 1 do n i wyświetl zawartość na ekranie przy pomocy pętli while.
public class Main {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);	
	tablicaLiczbowa(scan);
	}
	
	public static void tablicaLiczbowa (Scanner ilosc) {
		System.out.println("podaj ilość elementow");
		int liczbaElementow = ilosc.nextInt();
		int[] tablica = new int[liczbaElementow];
		for( int i = 0; i < liczbaElementow; i++)
			tablica[i] = i + 1;
		int n = 0;
		while (n <= tablica.length) {
			System.out.println(tablica[n]);
			n++;
		}
		
	}
}
