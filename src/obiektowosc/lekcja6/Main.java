package obiektowosc.lekcja6;



import java.util.ArrayList;

class Zwierzeta {
	String gatunek;
	int dlugoscZycia;
	int waga;
	int wzrost;

	public Zwierzeta(String gatunek, int dlugoscZycia, int waga, int wzrost) {
		this.gatunek = gatunek;
		this.dlugoscZycia = dlugoscZycia;
		this.waga = waga;
		this.wzrost = wzrost;
	}

	public void nakarm() {

		System.out.println("Zwierze nakarmione");
	}

	@Override
	public String toString() {
		return "Zwierzeta [gatunek=" + gatunek + ", dlugoscZycia=" + dlugoscZycia + ", waga=" + waga + ", wzrost="
				+ wzrost + "]";
	}

}

class Papuga extends Zwierzeta {

	boolean czyGada;
	int iloscKolorow;

	public Papuga(String gatunek, int dlugoscZycia, int waga, int wzrost, boolean czyGada, int iloscKolorow) {
		super(gatunek, dlugoscZycia, waga, wzrost);
		this.czyGada = czyGada;
		this.iloscKolorow = iloscKolorow;
	}

	@Override
	public void nakarm() {
		System.out.println("Nakarmiona ziarnem");

	}

	@Override
	public String toString() {
		return "Papuga [czyGada=" + czyGada + ", iloscKolorow=" + iloscKolorow + ", gatunek=" + gatunek
				+ ", dlugoscZycia=" + dlugoscZycia + ", waga=" + waga + ", wzrost=" + wzrost + "]";
	}

}

class Krokodyl extends Zwierzeta {

	int silaUsciskuZebow;

	public Krokodyl(String gatunek, int dlugoscZycia, int waga, int wzrost, int silaUsciskuZebow) {
		super(gatunek, dlugoscZycia, waga, wzrost);
		this.silaUsciskuZebow = silaUsciskuZebow;
	}

	@Override
	public String toString() {
		return "Krokodyl [silaUsciskuZebow=" + silaUsciskuZebow + ", gatunek=" + gatunek + ", dlugoscZycia="
				+ dlugoscZycia + ", waga=" + waga + ", wzrost=" + wzrost + "]";
	}

	@Override
	public void nakarm() {
		System.out.println("Nakarmiony kurczakiem.");
	}
	
}

public class Main {

	public static void main(String[] args) {
		Zwierzeta z1 = new Zwierzeta("Małpa Biała", 21, 15, 75);
		Zwierzeta z2 = new Papuga("Ara Niebieska", 120, 6, 110, true, 5);
		Zwierzeta z3 = new Krokodyl("Nilowy", 45, 750, 230, 1200);
		
		ArrayList<Zwierzeta> spisZwierzatkow = new ArrayList<Zwierzeta>();

		spisZwierzatkow.add(z1);
		spisZwierzatkow.add(z2);
		spisZwierzatkow.add(z3);

		for(Zwierzeta z : spisZwierzatkow)
			z.nakarm();
		
		
		
	}

}
