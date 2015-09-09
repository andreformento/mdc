package br.com.formento.mdc.model;

public class CalculadoraMdcRecursiva extends AbstractCalculadoraMdc implements CalculadoraMdc {

	@Override
	public int calcular(int x, int y) {
		int r = x % y;
		if (r > 0)
			return calcular(y, r);
		else
			return y;
	}

}
