package ObiektowoscZajecia;

class Osoba {
	String kolorSkory;
	int wiek;
	double wzrost;
	boolean czyPobity;

	public Osoba() {
//		this(23, 145);
		this.wiek = 23;

	}

	public Osoba(int wiek, double wzrost) {
		this();
		this.wiek = wiek;
		this.wzrost = wzrost;
		// this
	}

	public Osoba(int wiek, double wzrost, String kolorSkory, boolean czyPobity) {
		this(wiek, wzrost);
		this.kolorSkory = kolorSkory;
		this.czyPobity = czyPobity;

	}

	public void wypiszInformacje() {
		System.out.printf("Kolor skory: %s\nWiek: %d\nWzrost: %.1f\nCzy pobity: %b\n", kolorSkory, wiek, wzrost,
				czyPobity);
	}
}

public class Obiektowosc1 {

	public static void main(String[] args) {

//		Osoba gruby = new Osoba();

//		Osoba o1 = new Osoba(45, 182, "czarny", false);
//		Osoba o2 = new Osoba(15, 152, "biały", true);

		Zwierzatko[] zoo = { new Zwierzatko("Slon", 2500, 320, "ssak"), 
				new Zwierzatko("Krokodyl", 600, 200, "gad"),
				new Zwierzatko("Wąż", 20, 400, "gad"), 
				new Zwierzatko("Karp", 15, 60, "ryba"),
				new Zwierzatko("Żółw", 30, 120, "gad") };

		boolean czyZamiana = true;
		
		while(czyZamiana) {
			czyZamiana = false;
			
			for(int idx = 0; idx < zoo.length-1; idx++)
				if(zoo[idx].waga < zoo[idx+1].waga) {
					czyZamiana = true;
					Zwierzatko tmp = zoo[idx];
					zoo[idx] = zoo[idx+1];
					zoo[idx+1] = tmp;
				}
		}
		
		for(int idx = 0; idx < zoo.length; idx++)
			System.out.print(zoo[idx].nazwa + " ");
		
		Zwierzatko najbardziejZarloczne = zoo[0];
		
		for(int idx = 0; idx < zoo.length; idx++)
			if(najbardziejZarloczne.obliczZapotrzebowanieNaJedzenie() < zoo[idx].obliczZapotrzebowanieNaJedzenie())
				najbardziejZarloczne = zoo[idx];
		
		System.out.println();
		System.out.println(najbardziejZarloczne.nazwa);
		
		
		System.out.println("Gady:");
		
		for(int idx = 0; idx < zoo.length; idx++)
			if(zoo[idx].gatunek.equals("gad"))
				System.out.println(zoo[idx].nazwa);
//		System.out.println(gruby);
//		gruby.wypiszInformacje();
//		gruby.wzrost = 165;
//		gruby.kolorSkory = "biały";
//		gruby.wiek = 16;
//		gruby.czyPobity = false;
//
//		Osoba marek = new Osoba();
//
//		marek.wzrost = 186;
//		marek.kolorSkory = "biały";
//		marek.wiek = 26;
//		marek.czyPobity = false;
//
//		marek.wypiszInformacje();
//
//		Osoba rudy = gruby;
//
//		System.out.println("Przed pobiciem: ");
//		gruby.wypiszInformacje();
//		rudy.wypiszInformacje();
//
//		System.out.println("=============================");
//
//		rudy.czyPobity = true;
//		rudy.kolorSkory = "fioletowy";
//		
//		System.out.println("Po pobiciu: ");
//		gruby.wypiszInformacje();
//		rudy.wypiszInformacje();
//		
//		gruby = marek;
//		rudy = marek;
//	
//		rudy.wypiszInformacje();
//		marek.wypiszInformacje();
//		gruby.wypiszInformacje();
//		System.out.println("=============");
//		rudy.kolorSkory ="CZERWONY";
//		
//		rudy.wypiszInformacje();
//		marek.wypiszInformacje();
//		gruby.wypiszInformacje();

	}
}

class Zwierzatko {
	String gatunek;
	int waga;
	int wzrost;
	String nazwa;

	public Zwierzatko(String nazwa, int waga, int wzrost, String gatunek) {
		this.gatunek = gatunek;
		this.nazwa = nazwa;
		this.waga = waga;
		this.wzrost = wzrost;
	}

	public Zwierzatko() {
	}

	public Zwierzatko(int waga, int wzrost) {
		this("Nie podano", waga, wzrost, "Nie podano");
	}

	public Zwierzatko(String nazwa) {
		this(nazwa, 0, 0, "Nie podano");
	}

	public void wypiszInformacje() {
		System.out.printf("Nazwa: %s\nGatunek: %s\nWaga: %d\nWzrost: %d\n", nazwa, gatunek, waga, wzrost);

	}

	public double obliczZapotrzebowanieNaJedzenie() {

		return (double) wzrost / (double) waga;

	}

	public boolean weryfikujPoprawnosc() {
		boolean czyPoprawny = true;

		if (this.waga < 0) {
			czyPoprawny = false;
			this.waga = 0;
		}
		if (this.wzrost < 0) {
			czyPoprawny = false;
			this.wzrost = 0;
		}

		return czyPoprawny;
	}
​
}
​
// 1. Stworz klase zwierzatko, 
// 2. daj mozliwosc tworzenia obiektow tej klasy na 4 rozne sposoby, przy czym realizacje przypisania wartosci do zmiennych 
// klasy mozna realizowac tylko w jednym konstruktorze
// 3. Daj mozliwosc stworzenia metody wypisujacej dane i zwierzatku
// 4. Napisz metode ktora pozwoli obliczyc zapotrzebowani na jedzenie na 
// podstawie stosunku wagi do wzrostu zwierzecia (dowolny mechanizm)
// 5. Stworz metody z wykorzystaniem ktorych sprawdzisz czy parametry zwierzatka sa ustawione poprawnie 
// (np. waga nie moze byc mniejsza niz 0)
//6. Stworz tablice 5 zwierzatek
//7. Posortuj je wzgledem wagi
//8. Wyswietl najbardziej zarloczne zwierzatko
//9. Wypisz tylko te które są gadami (dodaj pole gatunek)
