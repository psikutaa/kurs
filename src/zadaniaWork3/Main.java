package zadaniaWork3;

public class Main {
	public static void main (String[] args) {
		Punkt nowy = new Punkt(-100, 100);
		
		System.out.println(nowy.aPlusJeden(nowy.getWspolrzednaA()));
		System.out.println(nowy.bPlusJeden(nowy.getWspolrzednaB()));
		nowy.wartosci (nowy.getWspolrzednaA(), nowy.getWspolrzednaB());
	}
}
