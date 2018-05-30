package br.com.db1.start.classes;

import org.junit.Assert;
import org.junit.Test;

public class ContasTest {

	private Contas contas = new Contas();

	@Test
	public void init() {
		contas.setValor1(3d);
		contas.setValor2(2d);
		Assert.assertTrue(3 == contas.getValor1());
		Assert.assertTrue(2 == contas.getValor2());
		Assert.assertTrue(5 == contas.Soma());
		Assert.assertTrue(1 == contas.Subtracao());
		Assert.assertTrue(6 == contas.Multiplicacao());
		Assert.assertTrue(1.5 == contas.Divisao());
		Assert.assertTrue("3 é impar" == contas.eParValor1());
		Assert.assertTrue("2 é par" == contas.eParValor2());
	}
}
