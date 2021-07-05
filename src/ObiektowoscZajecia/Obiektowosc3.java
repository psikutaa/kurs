
package ObiektowoscZajecia;

import java.util.Random;


enum Rozmiar {
	XXS(28, "ekstra małe"),
	XS(30, "super małe"),
	S(32, "małe"),
	M(34, "średnie"),
	L(36, "duże"),
	XL(38, "super duże"),
	XXL(40, "ekstra duże");
	
	int rozmiar;
	String etykietaSlowna;
	
	private Rozmiar(int rozmiar, String etykietaSlowna) {
		this.rozmiar = rozmiar;
		this.etykietaSlowna = etykietaSlowna;
	}
	
	public String getEtykietaSlowna() {
		return etykietaSlowna;
	}
}

class Odziez {
	private double cena;
	private String marka;
	private Rozmiar rozmiar;

	public Odziez(double cena, String marka, Rozmiar rozmiar) {
		this.cena = cena;
		this.marka = marka;
		this.rozmiar = rozmiar;
	}
	
	public String getMarka() {
		
		return "Marka: ".concat(marka);
	}

	@Override
	public String toString() {
		return "Odziez [cena=" + cena + ", marka=" + marka + ", rozmiar=" + rozmiar.etykietaSlowna + "]";
	}
}

public class Obiektowosc3 {

	public static void main(String[] args) {
		
		Odziez koszulka = new Odziez(79, "Nike", Rozmiar.S);
		Rozmiar.S.rozmiar = 40;
		System.out.println(Rozmiar.S.rozmiar);

		System.out.println(koszulka.getMarka());
		
		for(Rozmiar r : Rozmiar.values())
			System.out.println(r);
		System.out.println(koszulka);
		
	}

}	
		
//Dbanie o roslinke <- Enum
//- naslonecznienie, nawodnienie, poziom zarobaczenia, poziom nawozu

//Generuja loso sie wartosci powyzsze, nastepnie uzytkownik moze +, natomiast co kolejke wartosci odpowiendnio spadaja/wzrasta
	

