package division;

import static org.junit.Assert.*;
import  org.junit.Before;

import org.junit.Test;

public class testDividir {
	private Dividir calc;
	
	@Before
	public void crearCalc() {
		calc= new Dividir();
	}
	
	@Test
	public void testDivisionEntera() {
		assertEquals(4,calc.divisionEntera(20,5),0);
	}
	
	@Test
	public void testDivisionKO() {
		assertEquals(3,calc.divisionEntera(20, 5),0);
	}

	
	@Test
	public void testDivisionNoNegativos() {
		assertEquals(10,calc.divisionEntera(-5,6),0);
	}
	
	
	@Test
	public void testNoVocal() {
		assertTrue(calc.noContieneVocales("a"));
	}
	
	@Test
	public void testNoVocalOkKO() {
		assertFalse(calc.noContieneVocales("e"));
		
	}
	
	@Test
	public void testDivisionNoIgual() {
		assertNotSame(5,calc.divisionEntera(12, 6));
	}
	
	
}
