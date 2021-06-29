package obiektowosc.cwiczenia.zad4;
//Zastanow sie i zaproponuj jak zrobic automatyczna numeracje Tworzonych piesków
//Stworz klase schroniko z minimum 3 wartosciami 
//Zastanow sie jak stworzyc zeby schornisko bylo tylko raz stworzone. 
public class Main {
	public static void main (String[] args) {
		
		Piesek azor = new Piesek();
		Piesek bobik = new Piesek();
		Piesek tajga = new Piesek();
		Piesek tajfun = new Piesek();
		
		
		System.out.println(azor.getNumer());
		System.out.println(tajfun.getNumer());
		
		System.out.println(Piesek.getIlePieskow());
		
		Piesek luna = new Piesek();
		
		System.out.println(Piesek.getIlePieskow());
		
		// jak stworzyć tylko jeden obiekt danej klasy
	
		
	}
}
