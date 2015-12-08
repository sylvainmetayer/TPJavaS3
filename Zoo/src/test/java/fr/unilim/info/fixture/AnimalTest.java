package fr.unilim.info.fixture;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.unilim.info.Animal;


public class AnimalTest {
	/**
	 * File d'attente a tester
	 */
	private Animal animal;
	
	/**
	 * Constructeur par defaut
	 */
	public AnimalTest() {
		
	}
	
	@BeforeClass
	public static void setUpGlobal() {
	}
	
	
	@AfterClass
	public static void tearDownGlobal() {
	}
	
	
	@Before
	public void setUp() {
		animal = new Animal("Chien", true, 10.5f);
	}
	
	@After
	public void tearDown() {
	}
	
	//////////////////////////////
	//Test de la méthode equals
	//(Couverture vérifiée avec Eclemma)
	//////////////////////////////
	@Test
	public void testEqualsVrai() {
		Animal chien2 = new Animal("Chien", true, 10.5f); 
		assertTrue(animal.equals(chien2));
	}
	
	@Test
	public void testEqualsFauxEspeceDifferente(){
		Animal chien2 = new Animal("Chat", true, 10.5f); 
		assertFalse(animal.equals(chien2)); 
	}
	
	@Test
	public void testEqualsFauxCarnivoreDifferent(){
		Animal chien2 = new Animal("Chien", false, 10.5f); 
		assertFalse(animal.equals(chien2));
	}
	
	@Test
	public void testEqualsFauxPoidsDifferent(){
		Animal chien2 = new Animal("Chien", true, 10.6f); 
		assertFalse(animal.equals(chien2));
	}
	
	@Test
	public void testEqualsFauxObjetDifferent(){
		String phrase = new String();
		assertFalse(animal.equals(phrase));
	}
	
	@Test
	public void testEqualsFauxObjetNull(){
		assertFalse(animal.equals(null));
	}
	
	//////////////////////////////
	//Test de la méthode toString
	//(Couverture vérifiée avec Eclemma)
	//////////////////////////////
	@Test
	public void testToStringIdentique(){
		String phraseRetour = "Animal[espece=Chien, carnivore=true, poids=10.5]";
		assertEquals(animal.toString(), phraseRetour);
	}

}
