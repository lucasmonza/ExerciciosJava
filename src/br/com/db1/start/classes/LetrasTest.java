package br.com.db1.start.classes;

import org.junit.Assert;
import org.junit.Test;

public class LetrasTest {
	private Letras letras = new Letras();
	
	@Test
	public void exercicio1() {
		Assert.assertTrue("LUCASHENRIQUE" == letras.exercicio1());
		Assert.assertTrue("lucashenrique" == letras.exercicio2());
		Assert.assertTrue(7 == letras.exercicio3());
		}
}