package obiektowosc.cwiczenia.zad5.enumy;

public class Main {
	public static void main(String [] args) {
		
		Karta[][] talia = new Karta [13][4];
		
		for (int i = 0; i < talia.length; i++) {
			for (int j = 0; j < talia[i].length; j++) {
				talia[i][j] = new Karta(null ,null );
			}
		}
	}
}
