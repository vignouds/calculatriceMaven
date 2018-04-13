package org.formation.java;
import calculatrice.main.Calculatrice;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ApplicationTest extends TestCase {
	
	public static Test suite() {
		return new TestSuite(ApplicationTest.class);
	}
	
	public void testAdditioner() {
		Calculatrice calc = new Calculatrice(1,2);
		assertTrue(calc.additioner() == 3);
	}
	
	public void testSoustraire() {
		Calculatrice calc = new Calculatrice(3,1);
		assertTrue(calc.soustraire() == 2);
	}
	
}
