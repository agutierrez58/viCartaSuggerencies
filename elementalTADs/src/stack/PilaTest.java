package stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PilaTest {
	
	Pila pila_plena;
	Pila pila_buida;
	
	@Before
	public void setUp(){
		this.pila_buida = new Pila();
		this.pila_plena = new Pila();
		this.pila_plena.apilar(1);
		this.pila_plena.apilar(2);
		this.pila_plena.apilar(3);
		this.pila_plena.apilar(4);
	}
	

	@Test
	public void testPilaBuida() {
		// Està buida la pila per defecte?
		assertEquals(this.pila_buida.getNumElements(),0);
	}

	@Test
	public void testApilar_pila_plena() {
		// Una vegada s'apila, s'incrementa correctament la mida?
		Integer i = new Integer(5);
		int mida = pila_plena.getNumElements();
		pila_plena.apilar(i);
		assertEquals(pila_plena.getNumElements(),mida+1);
	}

	@Test
	public void testDesapilar_pila_plena() {
		// Si es desempila, es decrementa corractament la pila?
		int mida = pila_plena.getNumElements();
		Integer i = pila_plena.desapilar();
		assertEquals(i, new Integer(4));
		assertEquals(pila_plena.getNumElements(),mida-1);
	}
	
	/*
	@Test
	public void testDesapilar_pilaBuida() {
		int mida = pila_buida.getNumElements();
		Integer i = (Integer) pila_buida.desapilar();
		assertEquals (i, null);
		assertEquals(pila_buida.getNumElements(),mida);
	}
  */
}
