package ZadaniaDomowe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ZadaniaDomoweTabele {
	public static char[][] tabChar = new char [10][10];
	
	public static void main (String [] args) {
		 // zad 1 Stworz tablice charow 10 x 10
        // zad 2 Wypelnij ja wylosowanymi malymi literami alfabetu
        // zad 3 sprawdz czy w pionie/ poziomie lub skosie wylosowało sie slowo 'abc'(wzglednij je wspak)
        // zad 4 sprawdz czy istnieja 2 litery obok siebie takie same (wypisz pozycje)
        // zad 5 znajdz litere wystepujaca najwieksz ailosc razy (jesli kilka wypisz wsyztskie)
//      ------------
        
        // zad 6 Na podstawie 2 tablic jedno wymiarowych stworz tabliczke mnozenia i zapisz ja w tablicy 2 wymiarowej
        // zad 7 Zaimplementuj prostą grę totolotek 
        // zad 8 Zaimplementuj gre Bingo 
		
		zad2();
//		zad3();
//		zad4();
//		zad3_rm();
//		zad5();
		zad7();
		
//		tabliczkaMnozenia();
//		printArray(tabChar);


		

		// zad 7 Zaimplementuj prost¹ grê totolotek (zweryfikuj potwarzalnosc)
		// zad 8 Zaimplementuj gre Bingo
	}

	
	public static void zad2() {
		// zad 2 Wypelnij ja wylosowanymi malymi literami alfabetu
		
		Random r = new Random();
		for (int wiersz = 0; wiersz < tabChar.length; wiersz++) {
			for (int kolumna = 0; kolumna < tabChar[0].length; kolumna++) {
				tabChar[wiersz][kolumna] = (char) (r.nextInt(26)+97);
			}
		}
	
			System.out.println(Arrays.deepToString(tabChar)
					.replace("], ", "]\n")
					.replace("[[", "[")
					.replace("]]", "]"));
		//printArray(tabChar);
	}
	public static void zad3() {
		// zad 3 sprawdz czy w pionie/ poziomie lub skosie wylosowa³o sie slowo
		// 'abc'(wzglednij je wspak)
		tabChar[0][0] = 'a';
		tabChar[1][1] = 'b';
		tabChar[2][2] = 'c';
while (true) {
		for(int row = 0; row < tabChar.length; row++) {
			for (int col = 0; col < tabChar[row].length; col++) {
				if (tabChar[row][col] == 'a') {
					if ((col < tabChar[row].length -2 && tabChar[row][col + 1] == 'b') || 
						(col < tabChar[row].length -2 && row < tabChar.length -2  && tabChar[row + 1][col + 1] == 'b') ||
						(row < tabChar.length -2) && tabChar[row + 1][col] == 'b' ) {
							if ((col < tabChar[row].length - 2 && tabChar[row][col + 2] == 'c' ) || 
									(col < tabChar[row].length - 2 && row < tabChar.length - 2 && tabChar[row + 2][col + 2] == 'c') ||
									(row < tabChar.length - 2 && tabChar[row + 2][col] == 'c')) {
						
					
								System.out.printf("numer wiersza: %s, kolumna: %s\n",
										row + 1,
										col + 1);
								return;
							}
					}
				}
			}
		}
		}
	}
	public static void zad3_rm() {
		tabChar[0][0] = 'a';
		tabChar[1][1] = 'b';
		tabChar[0][2] = 'c';
		for(int row = 0; row < tabChar.length; row++) {
			for (int col = 0; col < tabChar[row].length; col++) {
				if (checkCharInTab(row,col,'a')) {
					if (checkCharInTab(row,col+1,'b') || 
						checkCharInTab(row+1,col+1,'b') ||
						checkCharInTab(row+1,col,'b')) {
						if (checkCharInTab(row,col+2,'c') || 
								checkCharInTab(row+2,col+2,'c') ||
								checkCharInTab(row+2,col,'c')) {
							System.out.printf("numer wiersza: %s, kolumna: %s\n",
									row + 1,
									col + 1);
						}
					}
				}
			}
		}
	}
	public static Boolean checkCharInTab(int wiersz, int kolumna, char chr) {
		if (wiersz < tabChar.length && kolumna < tabChar[wiersz].length && tabChar[wiersz][kolumna] == chr)
			return true;	
		return false;		
	}
	public static void tabliczkaMnozenia () {
		// zad 6 Na podstawie 2 tablic jedno wymiarowych stworz tabliczke mnozenia i
		// zapisz ja w tablicy 2 wymiarowej
		
		int[] tab1 = new int [10];
		int[] tab2 = new int [10];
		
		for (int i = 0; i < tab1.length; i++)
			tab1[i] = i;
		for (int i = 0; i < tab1.length; i++)
			tab2[i] = i;
		
		int [][] tabMnozenia = new int [10][10];
		
		for (int wiersz = 0; wiersz < tabMnozenia.length; wiersz++) {
			for (int kolumna = 0; kolumna < tabMnozenia[0].length; kolumna++)
				tabMnozenia[wiersz][kolumna] = tab1[wiersz] * tab2[kolumna];
		}		
		System.out.println(tabMnozenia[9][9]);
		printArray(tabMnozenia);
		
	
	}
	public static void zad4() {
		// zad 4 sprawdz czy istnieja 2 litery obok siebie takie same (wypisz pozycje)
		int a = 0;
		for(int wiersz = 0; wiersz < tabChar.length; wiersz++) {
			for( int kolumna = 0; kolumna < tabChar[0].length; kolumna++) {
				if (kolumna < (tabChar[0].length -1) && tabChar[wiersz][kolumna] == tabChar[wiersz][kolumna +1] ){
					System.out.println("tą literą jest " + tabChar[wiersz][kolumna]+ " i znajduje się w " + (wiersz + 1) + "wierszu i " + (kolumna + 1) + "kolumnie");
				}
			}
		}
	}
	public static void zad5() {
		// zad 5 znajdz litere wystepujaca najwieksz ailosc razy (jesli kilka wypisz
				// wsyztskie)
		int[] tab = new int[26];
		Arrays.fill(tab, 0);
		
		for (int wiersz = 0; wiersz < tabChar.length; wiersz++) {
			for (int kolumna = 0; kolumna < tabChar[0].length; kolumna++) {
				int znak = tabChar[wiersz][kolumna];
				tab[znak - 97]++;
			}
		}
		
		
		int maxIndex = 0;
		String str = ""; 
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > tab[maxIndex]) {
				maxIndex = i;
				str = (char)(i+97)+"";
			} else if (tab[i] == tab[maxIndex]) {
				str += ", "+(char)(i+97);
			}
		}
		System.out.println( (char)97 );
		System.out.printf("najczęsciej pojawia się:  %s pojawiła się: %s\n\n" ,str, tab[maxIndex]);
		System.out.println(Arrays.toString(tab));
	}
	public static void zad7() {
        // zad 7 Zaimplementuj prostą grę totolotek 
		int [] tab = new int [6];
		System.out.println("Podaj 6 liczb z zakresu 1 - 49 : ");
		for (int n = 0; n < 6; n++) {		
			System.out.print((n + 1) + " liczba to: ");
			Scanner scan = new Scanner(System.in);
			if (scan.nextInt() > 49)
				System.out.println("błędny zakres, spróbuj ponownie");
			}
			tab [n] = scan.nextInt();
			System.out.println("");
		}
		System.out.println("Twoje Liczby to : " + tab );
		
	}
	public static void printArray(int[][] tabMnozenia) {
		System.out.println(Arrays.deepToString(tabMnozenia)
				.replace("], ", "]\n")
				.replace("[[", "[")
				.replace("]]", "]"));
	}
	public static void printArray(char[][] tabMnozenia) {
		System.out.println(Arrays.deepToString(tabMnozenia)
				.replace("], ", "]\n")
				.replace("[[", "[")
				.replace("]]", "]"));
	}

	
}
