package obiektowosc.lekcja3.czesc2;

import java.util.Scanner;
public class Gra {
		enum Roslinka {
			NASLONECZNIENIE(losujNaslonecznienie()),
			NAWODNIENIE(losujNawodnienie()), 
			ZAROBACZENIE(losujZarobaczenie()), 
			POZIOM_NAWOZU(losujPoziomNawozu());
			private int poziom;
			
			private Roslinka(int wartosc) {
				this.poziom = wartosc;
			}
			
			public static int losujNaslonecznienie() {
				int min = 1;
				int max = 100;
				
				return (int)(Math.random() * (max - min) + min);
			}
			public static int  losujPoziomNawozu() {
				int min = 1;
				int max = 100;
				
				return (int)(Math.random() * (max - min) + min);
			}
			public static int losujZarobaczenie() {
				int min = 1;
				int max = 100;
				
				return (int)(Math.random() * (max - min) + min);
			}
			public static int losujNawodnienie() {
				int min = 1;
				int max = 100;
				
				return (int)(Math.random() * (max - min) + min);
			}
			
			public int getPoziom() {
				return poziom;
			}
			
			public void setPoziom(int poziom) {
				this.poziom = poziom;
			}
			
			public static boolean czyKontynuowacGre() {
				
				return NASLONECZNIENIE.getPoziom() > 0 && NASLONECZNIENIE.getPoziom() < 100
						&& NAWODNIENIE.getPoziom() > 0 && NAWODNIENIE.getPoziom() < 100
						&& POZIOM_NAWOZU.getPoziom() > 0 && POZIOM_NAWOZU.getPoziom() < 100
						&& ZAROBACZENIE.getPoziom() > 0 && ZAROBACZENIE.getPoziom() < 100;
			}
			public static void info() {
				System.out.printf("Roślinka: \nNaslonecznienie: %d\nNawodnienie: %d\nZarobaczenie: %d\nNawoz: %d\n", 
						NASLONECZNIENIE.getPoziom(), NAWODNIENIE.getPoziom(), ZAROBACZENIE.getPoziom(), POZIOM_NAWOZU.getPoziom());
				
			}
			static void nawodnij(boolean czyNowaTura) {
				int min = 1; 
				int max = 20;
				int zmiana = (int) (Math.random() * (max - min) + min);
				NAWODNIENIE.setPoziom(czyNowaTura ? (NAWODNIENIE.getPoziom() - zmiana) : (NAWODNIENIE.getPoziom() + zmiana));
			}
			static void naslonecznienie(boolean czyNowaTura) {
				int min = 1; 
				int max = 20;
				
				int zmiana = (int) (Math.random() * (max - min) + min);
				NASLONECZNIENIE.setPoziom(czyNowaTura ? (NASLONECZNIENIE.getPoziom() - zmiana) : (NASLONECZNIENIE.getPoziom() + zmiana));
			}
			
			static void nawozenie(boolean czyNowaTura) {
				int min = 1; 
				int max = 20;
				int zmiana = (int) (Math.random() * (max - min) + min);
				POZIOM_NAWOZU.setPoziom(czyNowaTura ? (POZIOM_NAWOZU.getPoziom() - zmiana) : (POZIOM_NAWOZU.getPoziom() + zmiana));
			}
			static void odrobaczenie(boolean czyNowaTura) {
				int min = 1; 
				int max = 20;
				
				int zmiana = (int) (Math.random() * (max - min) + min);
				ZAROBACZENIE.setPoziom(czyNowaTura ?(ZAROBACZENIE.getPoziom() + zmiana) : (ZAROBACZENIE.getPoziom() - zmiana));
			}

			static void nowaTura() {
				odrobaczenie(true);
				nawodnij(true);
				nawozenie(true);
				naslonecznienie(true);
				
			}
		}
		public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			int iloscTur = 0;
			while(Roslinka.czyKontynuowacGre()) {
				Roslinka.info();
				System.out.println("Podaj co chcesz zrobic: \n1. Nawodnienie\n2. Nawozenie\n3.Zarobaczenie \n4.Naslonecznienie");
				int decyzja = scan.nextInt();
				
				wykonaj(decyzja);
				Roslinka.nowaTura();
				iloscTur++;
			}
			System.out.println("Przetrwałes: " + iloscTur);
			Roslinka.info();
			
		}

		private static void wykonaj(int decyzja) {
			if(decyzja == 1) Roslinka.nawodnij(false);
			if(decyzja == 2) Roslinka.naslonecznienie(false);
			if(decyzja == 3) Roslinka.nawozenie(false);
			if(decyzja == 4) Roslinka.odrobaczenie(false);
		}

	}