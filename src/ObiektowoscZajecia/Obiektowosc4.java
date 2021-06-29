package ObiektowoscZajecia;

class Piesek {
	public String nazwa;
	public static int wiek;
}

class Schronisko {
	private  String dane;
	
}

public class Obiektowosc4 {

	public static void main(String[] args) {
		Piesek burek = new Piesek();
		burek.nazwa = "Burek";
		burek.wiek = 20;
		
		Piesek azor = new Piesek();
		azor.nazwa = "Azor";
		azor.wiek = 13;
		
		System.out.println(azor.nazwa);
		System.out.println(burek.nazwa);
		
		System.out.println(azor.wiek);
		System.out.println(burek.wiek);
		
		Schronisko sunieczkowo = new Schronisko();
		sunieczkowo.dane = "sunieczkowo";
		
		Schronisko daria = new Schronisko();
		daria.dane = "daria";
		
		System.out.println(daria.dane);
		System.out.println(sunieczkowo.dane);
	}
}		
		
		// Zastanow sie i zaproponuj jak zrobic automatyczna numeracje Tworzych piesków
		// Stworz klase schroniko z minimum 3 wartosciami 
		// Zastanow sie jak stworzyc zeby schornisko bylo tylko raz stworzone.		

		
