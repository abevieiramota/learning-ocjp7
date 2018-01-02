package br.abevieiramota.ocjp7;

public class Aula09 {

	public static void main(String[] args) {

		// int operador int = int
		// int operador long = long
		// O MÍNIMO QUE UMA OPERAÇÃO É INT!!!!!!!!!!!!!!!!!!!!!!!!!!
		byte a = 10;
		byte b = 20;
		// não funciona porque o compilador não consegue saber o valor de d e e no momento do cálculo de f
//		byte c = a + b;
		// functiona porque o compilador consegue saber o valor de d e e no momento do cálculo de f
		final byte d = 0;
		final byte e = 1;
		byte f = d + e;
		// da mesma forma
		final int i = 20;
		short j = i;
		// só pode atribuir para tipo igual ou mais amplo
		// int / 0 -> ArithmeticException
		// float ou double / 0 -> existe!!!!!!!!!!!!!!!!!!!!!!!! infinito!
		// +inf + -inf = NaN
	}
}
