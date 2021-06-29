package testowanie.lekcja1.cwiczenie1;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


public class Test {

	@org.junit.Test
	public void test1() {
		int liczba1 = 3;
		int liczba2 = 3;
		
		assertTrue(Narzedzia.NWD(liczba1, liczba2) == 5);
	}
	
	@org.junit.Test
	public void test2() {
		int liczba1 = 5;
		int liczba2 = 2;
		
		
		
//		assertTrue(Narzedzia.NWD(liczba1, liczba2) == 5);
//		assertFalse(condition);
//		assertNull(object);
//		assertNotNull();
//		assertEquals(expected, actual);
	
	}
}