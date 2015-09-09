package br.com.formento.mdc.model;

public abstract class AbstractCalculadoraMdc implements CalculadoraMdc {

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

	@Override
	public String toString(int x, int y) {
		StringBuilder mensagem = new StringBuilder();
		mensagem.append(toString());
		mensagem.append(": x = ");
		mensagem.append(x);
		mensagem.append("; y = ");
		mensagem.append(y);
		mensagem.append(": resultado = ");
		mensagem.append(calcular(x, y));

		return mensagem.toString();
	}

}
