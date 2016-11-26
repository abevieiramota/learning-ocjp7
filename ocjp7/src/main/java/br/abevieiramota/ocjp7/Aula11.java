package br.abevieiramota.ocjp7;

public class Aula11 {

	public static void main(String[] args) {
		System.out.println(1 == 1 & 1 > 2); // AND
		System.out.println(1 == 1 | 1 > 2); // OR
		System.out.println(1 == 1 ^ 1 > 2); // EXCLUSIVE OR
		System.out.println(!(1 == 1)); // NOT
		System.out.println(1 == 1 && 1 > 2); // AND short circuit
		System.out.println(1 == 1 || 1 > 2); // OR short circuit
	}
}
