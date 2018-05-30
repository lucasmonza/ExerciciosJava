package br.com.db1.start.classes;

public class Contas {

	private Double valor1 = (3d);
	private Double valor2 = (2d);

	public Double Soma() {
		return valor1 + valor2;
	}

	public Double Subtracao() {
		return valor1 - valor2;
	}

	public Double Multiplicacao() {
		return valor1 * valor2;

	}

	public Double Divisao() {
		return valor1 / valor2;
	}

	public String eParValor1() {
		if (valor1 % 2 == 0) {
			return "3 é par";
		} else {
			return "3 é impar";
		}
	}

	public String eParValor2() {
		if (valor2 % 2 == 0) {
			return "2 é par";
		} else {
			return "2 é impar";
		}
	}

	public String maiorValor() {
		if (valor1 > valor2) {
			return "3 é maior que 2";
		} else {
			return "2 é maior que 3";
		}
	}

	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

}
