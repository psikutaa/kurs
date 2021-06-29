package JavaPodstawyy;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Lekcja5 {

	public static void main(String[] args) throws IOException {
		File file = new File("mojPlik.txt");
		
//		System.out.println(file.createNewFile());
		
		
//		file.delete();
		
//		System.out.println(file.getAbsolutePath());
//		System.out.println(Arrays.toString(file.listRoots()));
//		System.out.println(file.getName());
//		
//		System.out.println(file.isDirectory());
//		System.out.println(file.isFile());
//	
//		
//		File dir = new File("C:\\Users\\piotr\\OneDrive\\Dokumenty");
//		
//		System.out.println(dir.getTotalSpace());
//		
//		File[] tab = dir.listFiles();
//		Arrays.sort(tab);
//		
//		for(File f : tab)
//			System.out.println(f.getName());
		
//		Scanner scanFromFile = new Scanner(file);
//		
//		while(scanFromFile.hasNextLine())
//			System.out.println(scanFromFile.nextLine().charAt(2));
		
//		String str;
//		String str = null;
//		String str = "";
		
//		PrintWriter pw = new PrintWriter("mojPlik.txt");
//		
//		pw.print("Ola");
//		pw.close();
//		pw.print("Ola");
//		pw.flush();
		
		// zad1. Pobierz od uzytkownika nazwe pliku, nastepnie tekst ktory chcesz zeby do niego zapisal
		// 			jesli plik istnieje zapisz, jelsi nie zwroc stosowny komunikat.
		
		// zad2 . Pobierz od użytkownika 2 nazwy pliku, zamien te pliki zawawrtoscia
		// zad3 . Z podanego katalogu wyswietl tylko pliki png i jpg
		// zad4. pobierz od uzytkownika 10 imion studentow.
//		        dla kazdego stworz folder zawierajacy plik z jego imieniem .docx, .txt, .pdf
		
//		String s1 = "plik.txt";
//		
//		Scanner scan = new Scanner(System.in);
//		
//		String linia = scan.nextLine();
//		
//		PrintWriter pw = new PrintWriter(s1);
//		pw.print(linia);
//		pw.close();
		
//		String s1 = "plik1.txt";
//		String s2 = "plik2.txt";
//		
//		String zawartoscS1 = "";
//		String zawartoscS2 = "";
//		
//		Scanner scan1 = new Scanner(new File(s1));
//		Scanner scan2 = new Scanner(new File(s2));
//		
//		
//		while(scan1.hasNextLine())
//			zawartoscS1 += scan1.nextLine() + "\n";
//		
//		while(scan2.hasNextLine())
//			zawartoscS2 += scan2.nextLine() + "\n";
//		
//		
//		PrintWriter pw1 = new PrintWriter(s1);
//		PrintWriter pw2 = new PrintWriter(s2);
//		
//		pw1.print(zawartoscS2);
//		pw1.close();
//		pw2.print(zawartoscS1);
//		pw2.close();
		
//		File dir = new File("C:\\Users\\piotr\\OneDrive\\Dokumenty");
//		String[] pliki = dir.list();
//		dir.mkdir();
//		for(String plik : pliki)
//			if(plik.endsWith(".jpg") || plik.endsWith(".png"))
//				System.out.println(plik);
		
		// zad 5 Masz 2 pliki w jednym liczby w drugim zwierzeta, 
		//  wyswietl w sposob synchroniczny
		
//		Scanner scan = new Scanner(System.in);
//		
//		String sciezka = "C:\\Users\\piotr\\3D Objects";
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("Podaj imie: ");
//			String imie = scan.nextLine();
//			
//			File f = new File(sciezka + "\\" + imie);
//			f.mkdir();
//			
//			new File(sciezka + "\\" + imie +"\\" + imie + ".txt").createNewFile();
//			new File(sciezka + "\\" + imie +"\\" + imie + ".pdf").createNewFile();
//			new File(sciezka + "\\" + imie +"\\" + imie + ".docx").createNewFile();
//
//		}
		
//		String plik1 = "C:\\Users\\piotr\\3D Objects\\plik1.txt";
//		String plik2 = "C:\\Users\\piotr\\3D Objects\\plik2.txt";
//		
//		Scanner scan1 = new Scanner(new File(plik1));
//		Scanner scan2 = new Scanner(new File(plik2));
//		
//		while(scan1.hasNextLine() || scan2.hasNextLine()) {
//			
//			if(scan1.hasNextLine())
//				System.out.print(scan1.nextLine() + " ");
//			
//			if(scan2.hasNextLine())
//				System.out.print(scan2.nextLine());
//			System.out.println();
//		}
		// zad 6. Macie folder, a w nim pliki, 
		// znajdzcie pliki które zawieraja wewnatrz fraze "komputer"	
		
//		File f = new File("C:\\Users\\piotr\\3D Objects");
//		
//		File[] spis = f.listFiles();
//		
//		for(File f1 : spis)
//			if(f1.getAbsolutePath().endsWith(".txt")) {
//				String calosc = "";
//				Scanner scan = new Scanner(f1);
//				while(scan.hasNextLine())
//						calosc += scan.nextLine();
//				
//				if(calosc.contains("komputer"))
//					System.out.println(f1.getAbsolutePath());
//				
//			}
				
//		String path = "C:\\Users\\piotr\\3D Objects\\0";
//		
////		for(int i = 0; i < 1000; i++) {
////			new File(path += "\\" + i).mkdir();
//		File f = new File(path);	
//		
//		while(f.list().length > 0)
//			f = f.listFiles()[0];
//		
//		System.out.println(f.getAbsolutePath());
//		
//		while(f.getAbsolutePath().length() > path.length()) {
//			File tmp = f.getParentFile();
//			f.delete();
//			f = tmp;
//		}
		
		
		
		
		
		// zad 7. stworz katalog w katologu rekurencyjnie 100 razy 
		
	}
}