package zadania.z.internetu.nr1;

import java.util.Scanner;

//Napisz program, który pobierze od użytkownika całkowitą liczbę dodatnią. 
//Następnie wyświetl na ekranie Odliczanie z tekstem "Bomba wybuchnie za ... " 
//gdzie w miejsce dwukropka mają się pojawić liczby od podanej przez użytkownika do 0. 
//Napisz program w 3 wersjach przy użyciu różnych pętli.

public class Main {
	public static void main(String[] args) {
		
		int czas = zegar();
		odliczanie(czas);

	}

	public static int zegar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("podaj liczbe: ");
		int czas = scan.nextInt();
		if(czas < 0) {
			System.out.println("nie mozna podawać liczb mniejszych od zera");
			return czas = 0;
		}
		else
			return czas;
	}
	public static void odliczanie(int czas) {
		System.out.println("Do wybuchu bomby zostało ...");
		for(int n = czas; czas >= 0; czas--) {	//czemu nie mogę tutaj dac samego czas tylko musze int n = czas
			if (czas == 0) System.out.println("BOOOM");
			else 
			System.out.println(czas);
		}
	}
}
