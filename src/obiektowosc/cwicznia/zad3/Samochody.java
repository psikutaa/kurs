package obiektowosc.cwicznia.zad3;

enum TypySamochodow {
	
	KOMBI(5, "duzy"),
	SEDAN(4, "sredni"),
	HATCHBACK(3, "sredni"),
	COUPE(2, "maly");
	
	int iloscDrzwi;
	String wielkosc;
	
	private TypySamochodow(int iloscDrzwi, String wielkosc) {
		this.iloscDrzwi = iloscDrzwi;
		this.wielkosc = wielkosc;
	}
	
}