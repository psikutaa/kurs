package obiektowosc.cwicznia.zad3;



public class Run {

		public static void main (String[] args ) {
			Odziez koszulka = new Odziez(100, "Reebok", Rozmiar.XXS);
			Odziez bluza = new Odziez(350, "Zara", Rozmiar.L);
			
//			System.out.println(Rozmiar.S.rozmiar);
//			Rozmiar.S.rozmiar = 1200;
//			System.out.println(Rozmiar.S.rozmiar);
//			Rozmiar.S.etykietaSlowna = "kalafior";
//			System.out.println(Rozmiar.S.etykietaSlowna);
			
			for(Rozmiar r: Rozmiar.values()) 
				System.out.println(r);
		}
}
