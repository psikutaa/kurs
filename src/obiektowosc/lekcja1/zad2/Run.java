package obiektowosc.lekcja1.zad2;

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
public class Run {
	public static void main(String[] args) {
		
		
		Zwierzatko[] zoo = { new Zwierzatko("Slon", 2500, 320, "ssak"), 
				new Zwierzatko("Krokodyl", 600, 200, "gad"),
				new Zwierzatko("Waz", 20, 400, "gad"), 
				new Zwierzatko("Karp", 15, 60, "ryba"),
				new Zwierzatko("Zolw", 30, 120, "gad") };
			

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
	}
}
