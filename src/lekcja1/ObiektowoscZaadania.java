//1. Stworz klase zwierzatko, 
		//2. daj mozliwosc tworzenia obiektow tej klasy na 4 rozne sposoby, przy czym realizacje przypisania wartosci do zmiennych 
		//klasy mozna realizowac tylko w jednym konstruktorze
		//3. Daj mozliwosc stworzenia metody wypisujacej dane i zwierzatku
		//4. Napisz metode ktora pozwoli obliczyc zapotrzebowani na jedzenie na 
		//podstawie stosunku wagi do wzrostu zwierzecia (dowolny mechanizm)
		//5. Stworz metody z wykorzystaniem ktorych sprawdzisz czy parametry zwierzatka sa ustawione poprawnie 
		//(np. waga nie moze byc mniejsza niz 0)
		//6. Stworz tablice 5 zwierzatek
		//7. Posortuj je wzgledem wagi
		//8. Wyswietl najbardziej zarloczne zwierzatko
		//9. Wypisz tylko te które są gadami (dodaj pole gatunek)

package lekcja1;

class Zwierzatko {
	String gatunek;
	int waga;
	double wzrost;
	boolean czySsak;
	String kolor;



	public Zwierzatko(int waga, double wzrost) {
		
		this.waga = waga;
		this.wzrost = wzrost;
	
	}
	
	public Zwierzatko(int waga, double wzrost, String kolor, boolean czySSak) {
		this(waga, wzrost);
		this.kolor = kolor;
		this.czySsak = czySsak;
		
	}
	
	public Zwierzatko (String gatunek)
	public void wypiszInformacje() {
		System.out.printf("Gatunek: %s\nWaga: %d\nWzrost: %.1f\nCzy to ssak: %b\nMasa: %d\n", gatunek, waga, 
				wzrost,kolor , czySsak);
	}
	
	
}

public class ObiektowoscZaadania {

	public static void main(String[] args) {
	
		
		Zwierzatko Z = new Zwierzatko(10, 20, "koziołek", true);
		Zwierzatko Z1 = new Zwierzatko(20, 100, "biały", true);
		Z1.wypiszInformacje();
	}
	
}