package zadaniaWork3;

import java.util.Scanner;

//Utwórz klasê Punkt, która przechowuje dwie wartoœci typu int - wspó³rzêdne punktu na powierzchni. Napisz w niej tak¿e metody które:
//
//zwiêkszaj¹ wybran¹ wspó³rzêdn¹ o 1
//zmieniaj¹ wybran¹ zmienn¹ o dowoln¹ wartoœæ
//zwracaj¹ wartoœæ wspó³rzêdnych (oddzielne metody)
//wyœwietla wartoœæ wspó³rzêdnych
//Napisz tak¿e klasê, w której przetestujesz dzia³anie metod wyœwietlaj¹c dzia³anie metod na ekranie,
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
		System.out.println("podaj o ile chcesz zmieniæ wspó³rzedna A: ");
		Scanner scan = new Scanner(System.in);
		wspolrzedna += scan.nextInt();
		return wspolrzedna;
	}

	public static int plusWspolrzednaB (int wspolrzednaB) {
		System.out.println("podaj o ile chcesz zmieniæ wspó³rzedna B: ");
		Scanner scan = new Scanner(System.in);
		wspolrzednaB += scan.nextInt();
		return wspolrzednaB;
	}
	
	public static void wartosci(int a, int b) {
		System.out.println(a = plusWspolrzednaA(a));
		System.out.println(b = plusWspolrzednaB(b));;
	}
	

}
