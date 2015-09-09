package br.com.formento.mdc.model;

public interface CalculadoraMdc {

	/**
	 * http://www.profcardy.com/cardicas/euclides.php
	 * 
	 * http://www.somatematica.com.br/fundam/mdc.php
	 * 
	 * Obtendo o mdc entre dois números naturais X e Y onde X > Y.
	 * 
	 * 1. Divida X por Y e obtenha o resto R1. Se R1 for zero, o mdc entre X e Y
	 * é Y.
	 * 
	 * 2. Se R1 não for zero, divida Y por R1 e obtenha o resto R2.
	 * 
	 * 3. Se R2 for zero, o mdc entre X e Y é R1. Se R2 não for zero, divida R1
	 * por R2 e obtenha o resto R3. Se R3 for zero, o mdc entre X e Y é R2.
	 * 
	 * 4. ...
	 * 
	 * 5. Se Rn não for zero, divida Rn-1 por Rn e obtenha o resto Rn+1. Se Rn+1
	 * for zero, o mdc entre X e Y é Rn
	 * 
	 */
	int calcular(int x, int y);

	String toString(int x, int y);

}
