package br.com.formento.mdc.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.formento.mdc.model.CalculadoraMdc;
import br.com.formento.mdc.model.CalculadoraMdcIterativa;
import br.com.formento.mdc.model.CalculadoraMdcRecursiva;

public class CalculadoraMdcTest {

	private List<CalculadoraMdc> listCalculadoraMdc;

	@Before
	public void init() {
		listCalculadoraMdc = new ArrayList<>();
		listCalculadoraMdc.add(new CalculadoraMdcIterativa());
		listCalculadoraMdc.add(new CalculadoraMdcRecursiva());
	}

	@Test
	public void testListaComItens() {
		assertFalse(listCalculadoraMdc.isEmpty());
	}

	@Test(timeout = 1000)
	public void testValoresCorretos() {
		testValoresCorretos(6, 12, 6);
		testValoresCorretos(12, 20, 4);
		testValoresCorretos(20, 24, 4);
		testValoresCorretos(35, 24, 1);
		testValoresCorretos(35, 21, 7);
		testValoresCorretos(48, 30, 6);
		testValoresCorretos(36, 90, 18);
		testValoresCorretos(15, 10, 5);
	}

	private void testValoresCorretos(int x, int y, int resultado) {
		for (CalculadoraMdc calculadoraMdc : listCalculadoraMdc)
			assertEquals(calculadoraMdc.toString(x, y), resultado, calculadoraMdc.calcular(x, y));
	}

}
