package br.com.formento.mdc.model;

public class CalculadoraMdcIterativa extends AbstractCalculadoraMdc implements CalculadoraMdc {

	@Override
	public int calcular(int x, int y) {
		int r = x % y;
		while (r > 0) {
			x = y;
			y = r;
			r = x % y;
		}

		return y;
	}

}
