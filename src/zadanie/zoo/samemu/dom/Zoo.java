package zadanie.zoo.samemu.dom;


public class Zoo {
	
	private String nazwa;
	private int iloscZwierzat = 0;
	private int biletUlgowy;
	private int biletNormalny;
	private int iloscOdwiedzajacych;
	public Zwierze[] klatki = new Zwierze[10];
	
	public Zoo(String nazwa, int iloscZwierzat, int biletUlgowy, int biletNormalny, int iloscOdwiedzajacych) {
		super();
		this.nazwa = nazwa;
		this.iloscZwierzat = iloscZwierzat;
		this.biletUlgowy = biletUlgowy;
		this.biletNormalny = biletNormalny;
		this.iloscOdwiedzajacych = iloscOdwiedzajacych;
	}
	
	public boolean dodajZwierze (Zwierze zwierz) {
		if (iloscZwierzat < klatki.length) {
			System.out.printf("udalo sie dodac zwierze %s\n", zwierz.getNazwa());
			klatki[iloscZwierzat++] = zwierz;
			return true;}
		else {System.out.printf("Nie ma miejsca w ZOO %s\n", nazwa);
			return false;}
	}
	
	public Zwierze wyjmijZwierze () {
		Zwierze wyjmowane;
		wyjmowane = klatki[iloscZwierzat];
		klatki[iloscZwierzat--] = null;
		return wyjmowane;
	}
	
	public void wypiszZwierzaki() {
		for(Zwierze nr : klatki)
			if (klatki != null) {
				System.out.println(nr.getNazwa());
			}
	}
	public int koszty() { // sumaKosztow += nr.getKosztyUtrzymania(); - do tego pojawia mi się komentarz the metod getkoszty is undefined for the type zwierze -juz wiem jeżeli nie zapiszę to nie działa :)
		int sumaKosztow = 0;
		for(Zwierze nr : klatki)
			if (nr != null) { // tutaj zamiast nr dałem wczesniej klatki
				sumaKosztow += nr.getKosztyUtrzymania();
			}
		return sumaKosztow;
	}
	
	public int losuj() {
		double liczba = Math.random()*1000;
		return (int) liczba;
	}
	
	public int odwiedzajacyUlgowy() {
		int odwiedzajacyUlgowy = this.losuj();  // jaka będzie rónica jak dam this losuj a dam samo losuj()
		return odwiedzajacyUlgowy;
	}
	
	public int odwiedzajacyNormalny() {
		int odwiedzajacyNormalny = this.losuj();
		return odwiedzajacyNormalny;
	}
	
	public int przychody() {
		int przychody = biletNormalny * odwiedzajacyNormalny() + biletUlgowy * odwiedzajacyUlgowy();
		return przychody;
	}
	
	public int bilans() {
		int bilans = przychody() - koszty();
		return bilans;
	}
	
	public void cenyBiletow() {
		int podsumowanie = bilans();
		if( podsumowanie < 0) {
		
		}
			
	}
}	
	
	
