package zadania.z.internetu.nr2;

import java.util.Scanner;

//Napisz program, w którym zadeklarujesz i utworzysz pięcioelementową tablicę odpowiedniego typu. 
//W pętli pobierzesz od użytkownika 5 imion i je w niej zapiszesz. 
//Następnie wyświetl na ekranie powiadomienia "Witaj imie_z_tablicy" dla każdego z podanych parametrów.

public class Main {
	public static void main (String[] args) {
		wyswietlImiona(2);
		
		
	}

//	public static String[] tablicaImion(int n) {
//		
//		String[] tablica = new String[n - 1];
//		
//		Scanner scan = new Scanner(System.in);
//		
//		for (int i = 0; i < n; i++)
//			 tablica[i] = scan.nextLine();
//			
//		return tablica[]; ///czemu nie moge zwrocic tablicy???
//	}
	
	public static void wyswietlImiona(int n) {
		String[] tablica = new String[n];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			System.out.printf("podaj %s imie: \n", (i+1));
			 tablica[i] = scan.nextLine();
		}
		
		for (int i = 0; i < tablica.length; i++)
			System.out.println("witaj: " + tablica[i]);
	}
}
