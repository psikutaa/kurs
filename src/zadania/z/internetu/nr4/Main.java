package zadania.z.internetu.nr4;
//Utwórz dwie zmienne typu double. Następnie przy użyciu klasy Scanner pobierz od użytkownika dwie liczby 
//i wykonaj na nich dodawanie, odejmowanie, mnożenie i dzielenie, wyświetlając wyniki w kolejnych liniach na konsoli.
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = pierwszaLiczba(scan);
		double b = drugaLiczba(scan);
		obliczenia(a, b);
	}
	public static double pierwszaLiczba(Scanner scan) {
		System.out.println("podaj pierwsza liczbe: ");
		double liczba = scan.nextDouble();
		return liczba;
	}
	public static double drugaLiczba(Scanner scan) {
		System.out.println("podaj druga liczbe: ");
		double liczba = scan.nextDouble();
		return liczba;
	}
	
	public static void obliczenia(double a, double b) {
//		double a = pierwszaLiczba(null);  //dlaczego tak nie mogę wywołać metod i zaimplementowac zmiennych
//		double b = drugaLiczba(null);
		
		double mnozenie = a * b;
		double dzielenie = a / b;
		double dodawanie = a + b;
		double odejmowanie = a - b;
		
		System.out.printf("wynik mnozenie to: %s\nwynik dzielenia to %s\nwynik dodawania to %s\nwynik odejmowania to %s\n", mnozenie,dzielenie,dodawanie,odejmowanie);
	}
}
