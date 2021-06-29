package Obiektowosc5;

import java.util.ArrayList;
import java.util.Scanner;




public class Cwiczenia {
	
	public static void main(String[] args) {
//		zad 1. Napisz z wykorzystaniem list menu produktow w sklepie 
//		oraz przypadek uzycia uzytkwonik przychodzi wybiera produkty i ilosci jest podsumownay i wyswieltana cena 

		ArrayList<String> products = new ArrayList<String>();
		
		products.add("Schabowy");
		products.add("Mielony");
		products.add("Panga");
		
		ArrayList<Integer> productPrices = new ArrayList<Integer>();
		
		productPrices.add(15);
		productPrices.add(13);
		productPrices.add(11);
		
		for (String p : products) {
			System.out.println(p+ ", " + productPrices.get(products.indexOf(p)));
		}
		
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		
		String as = "tak";
		while (as == "tak") {
			System.out.println("Co z menu?");
			int coZMenu = scan.nextInt();
			
			
			System.out.println("Ile sztuk?");
			int ileSztuk = scan.nextInt();
			
			System.out.println("Czy cos jeszcze?");
			String czyCosJeszcze = scan1.nextLine();

			if (czyCosJeszcze.equals("nie"))
				as = "nie";	
		}
	}

}
