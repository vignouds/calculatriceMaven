package org.formation.java;
import calculatrice.main.Calculatrice;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

	/** 
	 * Classe de test pour la calculatrice.
	 * @author S�bastien Vignoud
	 * 
	 */
public class ApplicationTest extends TestCase {

	public static Test suite() {
		return new TestSuite(ApplicationTest.class);
	}
	
	/**
	 * Fonction pour tester la m�thode additionner
	 * @author S�bastien Vignoud
	 */
	public void testAdditioner() {
		
		Calculatrice calc = new Calculatrice(1,2);
		assertTrue(calc.additioner() == 3);
	}
	
	/**
	 *  Fonction pour tester la m�thode soustraire
	 *  @author S�bastien Vignoud
	 */
	public void testSoustraire() {
		Calculatrice calc = new Calculatrice(0,1);
		assertTrue(calc.soustraire() == -1);
	}
	
	/**
	 *  Fonction pour tester la m�thode multiplier
	 *  @author S�bastien Vignoud
	 */
	public void testMultiplier() {
		Calculatrice calc = new Calculatrice(4,-5);
		assertTrue(calc.multiplier() == -20);
	}
	
	/**
	 *  Fonction pour tester la m�thode diviser
	 *  @author S�bastien Vignoud
	 */
	public void testDiviser() {
		Calculatrice calc = new Calculatrice(10,4);
		assertTrue(calc.diviser() == 2.5);
	}
	
}