package nauka;

import java.util.Arrays;

public class NaukaTablice {

		public static void main(String [] args) {
			
//			int[] tablica = new int[10];
//			 
//	 		for (int i = 0; i < 10; i++)
//	 			tablica[i] = i + 1;
//	 
//	 		int zmienna = tablica[3];
//	 
//	 		for (int i = 0; i < 10; i++)
//	 			System.out.println("Kolejna komórka to: " + tablica[i]);
//	 		
//	 		System.out.println("------------------");
//	 		
//	 		int[] tablica1 = new int [5];
//	 			tablica1 [1] = 1;
//	 			tablica1 [2] = 2;
//	 			tablica1 [3] = 4;
//	 			tablica1 [4] = 6;
//	 			tablica1 [0] = 11;
//	 			
//	 			for (int i = 0; i < 5; i++)
//		 			System.out.println("Kolejna komórka to: " + tablica1[i]);
//	 			
//	 			System.out.println("------------------");
//	 			
//	 			int[] tablica2 = new int [6];
//	 			
//	 			for (int i = 0; i <= 5; i++)
//	 				tablica2[i] = i * i;
//	 			
//	 			for (int i = 0; i <= 5; i++) 
//	 				System.out.println("wartosc komórki " + i + " to " + tablica2[i]);
//	 			
//	 			System.out.println("------------------");
//	 			
//	 			int [] tablica3 = new int[] {1, 3, 4, 5, 6, 11, -111};
//	 			for (int i = 0; i <= 6; i++)
//	 				System.out.println(tablica3[i]);
//	 			
//	 			System.out.println("------------------");
//	 			
//	 			int[] tablica4 = new int[] {-11, 22, -5, -212, 5, 669};
//	 			for (int i = 0; i < 6; i++)
//	 				System.out.println(tablica4[i]);
//	 			
//	 			System.out.println("------------------");
//	 			
//	 			String [] tablica5 = new String [] {"kot", "mysz", "kutas", "radekTochuj"};
//	 			for (int i = 0; i <= 3; i++ )
//	 				System.out.println(tablica5[i]);
//	 			
//	 			String [] tablica6 = {
//	 					"raz",
//	 					"dwa",
//	 					"trzy",
//	 					"cztery",
//	 			};
//	 			
//	 			System.out.println("------------------");
//	 			
//	 			String[] tablicaNull = new String[5];
//	 			for(int i = 0; i < 5; i++) {
//	 				System.out.println(tablicaNull[i]);
//	 			}
//	 			
//	 			System.out.println("------------------");
//	 			
//	 			int[] tablicaZero = new int [4];
//	 			for(int i = 0; i < 4; i++)
//	 				System.out.println(tablicaZero[i]);
			
			int [] tablicaSuma = new int [] {1, 2, 3, 4, 5, 6};
			
			int suma = 0;
			for(int i = 0; i <= 5; i++)
				suma = suma + tablicaSuma[i];
			
			System.out.println(suma);
			System.out.println(tablicaSuma.length);
			System.out.println(Arrays.toString(tablicaSuma));
			
// 			System.out.println("------------------");
			

			
	 					
	 			
		}
}

