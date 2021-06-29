package obiektowosc.lekcja1.zad1;

public class Run {
	
	public static void main(String[] args) {

		Osoba gruby = new Osoba();
		
		Osoba o3 = new Osoba(3, 10, "aaaa", false, 110);
		o3.wypiszInformacje();
		
		Osoba o1 = new Osoba(45, 182, "czarny", false);
		Osoba o2 = new Osoba(15, 152, "biały", true);
		
		Osoba o4 = new Osoba();
		
		gruby.wypiszInformacje();
		gruby.wzrost = 165;
		gruby.kolorSkory = "biały";
		gruby.wiek = 16;
		gruby.czyPobity = false;

		Osoba marek = new Osoba();

		marek.wzrost = 186;
		marek.kolorSkory = "biały";
		marek.wiek = 26;
		marek.czyPobity = false;

		marek.wypiszInformacje();

		Osoba rudy = gruby;

		System.out.println("Przed pobiciem: ");
		gruby.wypiszInformacje();
		rudy.wypiszInformacje();

		System.out.println("=============================");

		rudy.czyPobity = true;
		rudy.kolorSkory = "fioletowy";
		
		System.out.println("Po pobiciu: ");
		gruby.wypiszInformacje();
		rudy.wypiszInformacje();
		
		gruby = marek;
		rudy = marek;
	
		rudy.wypiszInformacje();
		marek.wypiszInformacje();
		gruby.wypiszInformacje();
		System.out.println("=============");
		rudy.kolorSkory ="CZERWONY";
		
		rudy.wypiszInformacje();
		marek.wypiszInformacje();
		gruby.wypiszInformacje();

		
	}
}
