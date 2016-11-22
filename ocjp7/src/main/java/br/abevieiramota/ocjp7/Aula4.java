package br.abevieiramota.ocjp7;

class Carro {
	String modelo;
	int ano;
	
	Carro() {
		ano = 2014;
		this.modelo = "bmw";
	}
	
	public String getDadosDeImpressao() {
		return modelo + "::" + ano;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
public class Aula4 {

	public static void main(String[] args) {
		Carro a = new Carro();
		a.modelo = "oi";
		System.out.println(a.modelo);
		System.out.println(a.getDadosDeImpressao());
		
		a = new Carro(); // carro anterior perdeu referência
		// prova pergunta quantos estão acessíveis, quantos não, quantos foram criados
		{
			Carro b = new Carro();
		} // b depois do bloco deixa de ser acessível
		// garbage collector -> não sei dizer, não tenho certeza
	}
}
