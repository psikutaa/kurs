package zadania.z.internetu.nr5;
	import java.util.Scanner;
	


//Napisz program, który pobierze od użytkownika imię i przechowa je w zmiennej. Następnie stwórz kilka warunków z różnymi imionami.
//Jeśli któreś z imion będzie pasowało wyświetl "Cześć jakieś_imię", gdy program nie znajdzie imienia wyświetl "Przykro mi, ale Cię nie znam".

public class Main {
	public static void main (String [] args) {
		
		int i = 0;
		String[] tablica = new String[i];
	}
	public static String podajImie () {
		Scanner scan = new Scanner(System.in);
		String imie = scan.nextLine();
		return imie;
		
	}
	public static String[] stworzTablice(int i) {
		
		return 
	}
	public static void porownanie(String imie) {
		tablica [] = stworzTablice(); 
		for(int i = 0; i < tablica.lenght; i++) {
			if(imie.equals(tablica[i])) 
				System.out.println("Czesc " + imie);
			else 
				System.out.println("nie znam cie");
		}
	}
}
