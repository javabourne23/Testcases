// https://www.youtube.com/watch?v=CK8shWNtizk

import static org.junit.Assert.*;

import org.junit.Test;

public class HilfsklasseJUnit {

// Primzahlen: 37, 999979, 999434473
	
	@Test
	
	public void test(){
		Hilfsklasse h = new Hilfsklasse();
		assertTrue("i ungleich 4",h.i == 4);
		assertTrue(h.j == "Name");
		assertEquals("h not \"Name\"","Name", h.j);   // expected, actual
//		assertTrue("Primzahltest falsch",h.istPrimzahl(2047)==true);
//		assertEquals("Primzahltest falsch 2",true,h.istPrimzahl(128));
	}
	
/*	@Test
	public void test2(){
		Hilfsklasse h = new Hilfsklasse();
		assertEquals("Primzahltest falsch: 3", true, h.istPrimzahl(999434473L));
		
	}*/


}
