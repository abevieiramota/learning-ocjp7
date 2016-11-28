package br.abevieiramota.ocjp7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

// n pode static e instance c msm método
@RunWith(JUnit4.class)
public class Aula1 {
	String nome = "tsc";
	
	static String nome2;
	
	@Test
	public void test() {
		String nome = "oi";
		
		assertEquals("oi", nome);
		assertEquals("tsc", this.nome);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int nome) {
		this.nome = Integer.toString(nome, 2);
	}

}
