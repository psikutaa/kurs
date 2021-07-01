package zadania.z.internetu.nr5;
	import java.util.Scanner;
	


//Napisz program, który pobierze od użytkownika imię i przechowa je w zmiennej. Następnie stwórz kilka warunków z różnymi imionami.
//Jeśli któreś z imion będzie pasowało wyświetl "Cześć jakieś_imię", gdy program nie znajdzie imienia wyświetl "Przykro mi, ale Cię nie znam".

public class Main {
	public static void main (String [] args) {

		
		//nie wiem jaką zrobić metodę żeby po dodaniu osoby zwiekszałą się liczba ktora odpowiada za ilosc dodanch imion. niby mozna z rozamaru tabeli ale nie o to chodzi
	

	}
	public static int ileOsob(int i) {
		return i++;
	}
	
	public static String[] stworzTablice(int i) {
		String[] tablica = new String[i];
		return tablica;
	}
	
	public static String podajImie(int i) {
		i++;
		Scanner scan = new Scanner(System.in);
		String imie = scan.nextLine();
		return imie;
	}
}
