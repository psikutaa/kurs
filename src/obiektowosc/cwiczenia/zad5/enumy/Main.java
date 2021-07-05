package obiektowosc.cwiczenia.zad5.enumy;

import java.util.ArrayList;

public class Main {
	public static void main(String [] args) {
		
		ArrayList<Karta> talia = new ArrayList<Karta>();
		
		for (KoloryKart kolor: KoloryKart.values()) {
			for (FiguryKart figura: FiguryKart.values()) {
				Karta temp = new Karta(kolor, figura);
				talia.add(temp);
			}
		}
		
		talia.forEach(value -> System.out.println(value.toString()));

	}
}
