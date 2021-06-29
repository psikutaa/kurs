package obiektowosc.cwiczenia.nr1;


//1. Stworz klase zwierzatko, 
//2. daj mozliwosc tworzenia obiektow tej klasy na 4 rozne sposoby, przy czym realizacje przypisania wartosci do zmiennych 
//klasy mozna realizowac tylko w jednym konstruktorze ?? co to oznacza mozliwosc tworzenia klasy
//3. Daj mozliwosc stworzenia metody wypisujacej dane o zwierzatku
//4. Napisz metode ktora pozwoli obliczyc zapotrzebowani na jedzenie na 
//podstawie stosunku wagi do wzrostu zwierzecia (dowolny mechanizm)
//5. Stworz metody z wykorzystaniem ktorych sprawdzisz czy parametry zwierzatka sa ustawione poprawnie 
//(np. waga nie moze byc mniejsza niz 0)
//6. Stworz tablice 5 zwierzatek
//7. Posortuj je wzgledem wagi
//8. Wyswietl najbardziej zarloczne zwierzatko
//9. Wypisz tylko te które są gadami (dodaj pole gatunek)

public class Run {

	
	public static void main (String [] args) {
		Zwierzatko[] zoo = {new Zwierzatko("Zyrafa", 20, 400, 7),
				new Zwierzatko("Slon", 5000, 350, 20),
				new Zwierzatko("Hipopotam", 1500, 200, 10),
				new Zwierzatko("Lew", 200, 100, 8),
				new Zwierzatko("kon",-20, -10, 2)};
		
		
//		for(int i = 0 ; i < zoo.length; i++) {
//			zoo[i].wypiszInformacje();
//		}
		
		Zwierzatko najbardziejZarloczne = zoo[0];
		
		for (int i = 0; i < zoo.length; i++) {
			if (zoo[i].wyliczMaseDoWzrost() > najbardziejZarloczne.wyliczMaseDoWzrost())
				najbardziejZarloczne = zoo[i];
		}		
		
//		System.out.println(najbardziejZarloczne.getGatunek());
		
		


		boolean czyZamiana = true;
		
		while(czyZamiana) {
			czyZamiana = false;
			
			for(int idx = 0; idx < zoo.length-1; idx++)
				if(zoo[idx].getWaga() < zoo[idx+1].getWaga()) {
					czyZamiana = true;
					Zwierzatko tmp = zoo[idx];
					zoo[idx] = zoo[idx+1];
					zoo[idx+1] = tmp;
				}
		}
		for(int i = 0; i < zoo.length; i++)
			System.out.print(zoo[i].getGatunek() + " ");
		
	}
}