package zadaniaWork4;
//Napisz program sk�adaj�cy si� z dw�ch klas. Pierwsza niech zawiera kilka metod o nazwie dodaj(), 
//ale zwracaj�cych r�ne typy wynik�w i przyjmuj�cych po minimum dwa parametry typ�w liczbowych wybranych przez Ciebie. 
//Ich zadaniem jest zwr�cenie, lub wy�wietlanie sumy podanych argument�w. W drugiej klasie Testowej utw�rz obiekt tej klasy i sprawd� dzia�anie 
//swoich metod, wy�wietlaj�c wyniki dzia�a� na ekranie. 
//Dodatkowo ka�da z metod niech wy�wietla sw�j typ zwracany i rodzaj argument�w, aby� wiedzia�, kt�ra z nich zadzia�a�a.
public class Liczby {
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public Liczby(int a, int b, int c, double d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	private int a;
	private int b;
	private int c;
	private double d;
	
	public static int dodaj (int getA, int getC) {
		return getA + getC;
	}
	
	public static void dodaj (int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
//	public static int dodaj (int a, int b, double c) { //czy mog� zmieni� parametry
//		return (double) a + (double) b + c;
//	}
}
