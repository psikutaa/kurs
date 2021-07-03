package zadaniaWork2;
//Przy u¿yciu pêtli i tablic przechowuj¹cych liczby ca³kowite zaprezentuj poni¿sz¹ treœæ:
//
//tab[0,0] = 0;
//tab[0,1] = 1;
//tab[0,2] = 2;
//tab[1,0] = 3;
//tab[1,1] = 4;
//tab[1,2] = 5;
//
//Wykorzystuj przy tym w³asnoœæ length.
public class Main {
	public static void main (String[] agrs) {
		int [][] tablica = new int[2][3];
		
//		int wartosc = 0;
//		for (int i = 0; i < tablica.length; i++) {
//			for (int j = 0 ; j < tablica[i].length; j++);
//			tablica[i][j] = wartosc++;	
//		}
		
		int liczba = 0;
		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[i].length; j++)
				tablica[i][j] = liczba++;
		}
		
		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[i].length; j++)
				System.out.println(tablica[i][j]);
		}
	}

}
