package cwiczenia.nr1;


import java.util.Scanner;

//Napisz metodê, która zwróci Twój aktualny wiek.
//Napisz metodê, która zwróci Twoje imiê,
//Napisz metodê, która jako argument przyjmuje 2 liczby i wypisuje ich sumê, ró¿nicê i iloczyn,
//Napisz metodê, która jako argument przyjmuje liczbê i zwraca true jeœli liczba jest parzysta,
//Napisz metodê, która jako argument przyjmuje liczbê i zwraca true jeœli liczba jest podzielna przez 3 i przez 5,
//Napisz metodê, która jako argument przyjmuje liczbê i zwraca go podniesionego do 3 potêgi,
//Napisz metodê, która jako argument przyjmuje liczbê i zwraca jej pierwiastek kwadratowy (poczytaj javadoc do klasy Math, znajdziesz tam metodê, która na pewno Ci pomo¿e),
//Napisz metodê, która jako argument przyjmie trzy liczby. Metoda powinna zwróciæ true jeœli z odcinków o d³ugoœci przekazanych w argumentach mo¿na zbudowaæ trójk¹t prostok¹tny.
public class Main {
	
	public static void main (String[] args) {
		Scanner scanMain = new Scanner(System.in);
		String scanMain2 = new String("5");
		
		sumaParametry(scanMain);
		sumaParametry2(scanMain2);
//		Scanner scan = new Scanner(System.in);
//		System.out.println("ile masz lat?");
//		int wiek = scan.nextInt();
//		System.out.printf("Twoj wiek to: %d lat\n", wiek);
//		System.out.println();
//		
//		
//		
//		String ja = podajImie();
//		System.out.printf("Masz na imie: %s\n\n",ja);
		
//		System.out.println(suma1(22, 22));
		
		
//		int a = sumaParametry(scanMain);
//		System.out.println(a);
		
		drukuj("Jan", 22, "Wrocławiu");
		drukuj("janusz", 44,"warszawie");
	}
	
	public static String podajImie() {
		Scanner scan1 = new Scanner(System.in);
		String imie = scan1.nextLine();
		return imie;	
	}
	
	public static int sumRozIlocz() {
		
		Scanner scan2 = new Scanner(System.in);
		int liczba1 = scan2.nextInt();
		int liczba2 = scan2.nextInt();
		
		int suma = liczba1 + liczba2;
		int iloczyn = liczba1 * liczba2;
		int iloraz = liczba1 / liczba2;
		
		return liczba1; //nie wiem co wprowadziæ tutaj ¿eby potem skorzystaæ ? wszystkie razem??
		
		
		
	}
	public static boolean parzysta() {
		
		Scanner scan3 = new Scanner(System.in);
		int czyParzysta = scan3.nextInt();
		
		boolean parzysta = false;
		
		if (czyParzysta % 2 == 0 )
			parzysta = true;
		
		return parzysta;
	}
	public static boolean podzielna() {
		Scanner scan4 = new Scanner(System.in);
		int podzielna = scan4.nextInt();
		boolean czyPodzielna = false;
		if(podzielna % 3 == 0 && podzielna % 5 == 0)
			czyPodzielna = true;
		return czyPodzielna;
	}
	public static int potega() {
		Scanner scan5 = new Scanner(System.in);
		int potega = scan5.nextInt();
		int poPotedze = potega;
		for(int i = 1; i < 3; i++)
			poPotedze *= potega;
		return poPotedze;
	}
	
	public static int suma1 (int a, int b) {
		return a + b;
	}
	public static int sumaParametry (Scanner scanner) {
		int scan1 = scanner.nextInt();
		int scan2 = scanner.nextInt();
		return scan1+scan2;
	}
	public static void sumaParametry2(String str) {
		System.out.println(str);
	}
	public static void drukuj (String imie, int wiek, String miasto) {
		
		System.out.printf("nazwywam sie %s mam %s lat mieszkam we %s\n", imie, wiek, miasto);
		
	}
}
