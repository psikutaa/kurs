package zadaniaWork4;
//Napisz program sk³adaj¹cy siê z dwóch klas. Pierwsza niech zawiera kilka metod o nazwie dodaj(), 
//ale zwracaj¹cych ró¿ne typy wyników i przyjmuj¹cych po minimum dwa parametry typów liczbowych wybranych przez Ciebie. 
//Ich zadaniem jest zwrócenie, lub wyœwietlanie sumy podanych argumentów. W drugiej klasie Testowej utwórz obiekt tej klasy i sprawdŸ dzia³anie 
//swoich metod, wyœwietlaj¹c wyniki dzia³añ na ekranie. 
//Dodatkowo ka¿da z metod niech wyœwietla swój typ zwracany i rodzaj argumentów, abyœ wiedzia³, która z nich zadzia³a³a.
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
	
//	public static int dodaj (int a, int b, double c) { //czy mogê zmieniæ parametry
//		return (double) a + (double) b + c;
//	}
}
