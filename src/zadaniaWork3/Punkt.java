package zadaniaWork3;

import java.util.Scanner;

//Utw�rz klas� Punkt, kt�ra przechowuje dwie warto�ci typu int - wsp�rz�dne punktu na powierzchni. Napisz w niej tak�e metody kt�re:
//
//zwi�kszaj� wybran� wsp�rz�dn� o 1
//zmieniaj� wybran� zmienn� o dowoln� warto��
//zwracaj� warto�� wsp�rz�dnych (oddzielne metody)
//wy�wietla warto�� wsp�rz�dnych
//Napisz tak�e klas�, w kt�rej przetestujesz dzia�anie metod wy�wietlaj�c dzia�anie metod na ekranie,
public class Punkt {
	private int wspolrzednaA;
	private int wspolrzednaB;
	
	public Punkt(int wspolrzednaA, int wspolrzednaB) {
		super();
		this.wspolrzednaA = wspolrzednaA;
		this.wspolrzednaB = wspolrzednaB;
	}
	
	public int getWspolrzednaA() {
		return wspolrzednaA;
	}

	public int getWspolrzednaB() {
		return wspolrzednaB;
	}
	
	public static int aPlusJeden (int wspolrzedna) {
		return ++wspolrzedna;
	}
	
	public static int bPlusJeden (int wspolrzedna) {
		return ++wspolrzedna;
	}
	
	public static int plusWspolrzednaA (int wspolrzedna) {
		System.out.println("podaj o ile chcesz zmieni� wsp�rzedna A: ");
		Scanner scan = new Scanner(System.in);
		wspolrzedna += scan.nextInt();
		return wspolrzedna;
	}

	public static int plusWspolrzednaB (int wspolrzednaB) {
		System.out.println("podaj o ile chcesz zmieni� wsp�rzedna B: ");
		Scanner scan = new Scanner(System.in);
		wspolrzednaB += scan.nextInt();
		return wspolrzednaB;
	}
	
	public static void wartosci(int a, int b) {
		System.out.println(a = plusWspolrzednaA(a));
		System.out.println(b = plusWspolrzednaB(b));;
	}
	

}
