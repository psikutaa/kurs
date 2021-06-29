package ZadaniaDomowe;

public class ZADANKA {
	public static void main (String[] args) {
//		dzielniki();
//		return;
		

		
//		zliczDzielniki();
		
//		liczbyNa7i5();

//				
//		sumaLiczb();
			
//		potega();	
				

	}
	
	public static void dzielniki() {
		// 1. Z wykorzystaniem pętli for, wypisz dzielniki liczby n 

		for (int n = 12, divider = 1; divider <= n; divider++ )
			if (n % divider == 0)
				System.out.println(divider);
	}
	
	public static void zliczDzielniki() {
		// 2. Z wykorzystaniem pętli for, zlicz dzielniki liczby n 
		int num = 6, b = 0;
		for( int n = 1; n <= num; n++) 
			if (num % n == 0)
				b++;
		
		System.out.println("dzielników jest: " + b);
	}
	
	public static void liczbyNa7i5() {
		
		// 3. Z wykorzystaniem petli for wypisz wszystkie liczby zakończone na 7 i 5 od -100 do 100
		
		for (int n = -100; n <= 100; n++ )
			if (n % 10 == 7 || n % 10 == 5 || n % 10 == -7 || n % 10 == -5)
				System.out.println(n);
	}
	
	public static void sumaLiczb() {
		// 4. Suma cyfr danej liczby 
		
		int num = 7321, b = 0;
		while (num >= 1) {
			b = b + num % 10;
			num = num / 10;
		}
		System.out.println(b);
	}

	public static void potega() {
		// 5. zarpoponuj mechanizm a do potęgi b 
		
		int number = 4, power = 3, score = 1;
		for (int n = 1; n <= power; n++)
			score = number * score;
		System.out.println(score);
	 
	}
}