package obiektowosc.lekcja4;


class Piesek {
	public String nazwa;
	private static int id_auto = 10000;
	public int numer;
	
	public Piesek() {
		this.numer = ++id_auto;
	}
}
​
class Schronisko{
	
	private static Schronisko schronisko;
	
	private Schronisko() {
	}
	
	public static Schronisko getSchronisko() {
		if(schronisko == null)
			schronisko = new Schronisko();
	
		return schronisko;
	}
	
}

public class Main {
	
	public static void main(String[] args) {
		Piesek burek = new Piesek();
		burek.nazwa = "Burek";
		
		Piesek azor = new Piesek();
		azor.nazwa = "Azor";
		
		System.out.println(azor.nazwa);
		System.out.println(burek.nazwa);
		
		System.out.println(azor.numer);
		System.out.println(burek.numer);
		
		Schronisko s = Schronisko.getSchronisko();
		Schronisko s1 = Schronisko.getSchronisko();
		
		System.out.println(s);
		System.out.println(s1);
		
	}
}